package play.twentythree

import java.io.File
import java.nio.file.Files
import java.nio.charset.Charset
import java.util.Collections.singletonList

object Generate {

  private def deleteDir(file: File): Unit = {
    if(!file.delete() && file.isDirectory){
      Option(file.listFiles).toList.flatten.foreach(deleteDir)
      file.delete
    }
  }

  def main(args: Array[String]): Unit = {
    val dir = new File(args.headOption.getOrElse(sys.error("invalid args " + args.mkString(", "))))
    deleteDir(dir)
    generate(dir)
  }

  private final val className = "PlayJson"

  private def generate(dir: File): Unit = {
    dir.mkdir
    val f = new File(dir, className + ".scala").toPath
    Files.write(f, singletonList(code), Charset.forName("UTF-8"))
  }

  private def tparams(n: Int) = (1 to n).map("A" + _)
  private def params(n: Int) = (1 to n).map("k" + _)

  private final val code: String = {
    val method: Int => String = { case n =>
      val builder = "Builder" + n
      def method0(methodName: String) = s"""
  def ${methodName}(${params(n).map(_ + ": String").mkString(", ")}): $builder =
    new $builder(${params(n).mkString(", ")})"""

      def paramList(class1: String, class2: String) =
        s"""[${tparams(n).mkString(", ")}, Z](f: Generic[Z]{ type Repr = ${(tparams(n) :+ "HNil").mkString(" :: ")} })(implicit ${tparams(n).map(t => s"${t}: ${class1}[${t}]").mkString(", ")}): ${class2}[Z] ="""

      val read = s"""
    def reads${paramList("Reads", "Reads")}
      Reads[Z]( j =>
        sequence$n[${tparams(n).mkString(", ")}](${(
          (tparams(n), params(n)).zipped.map((t, k) => s"Reads.at(JsPath(KeyPathNode($k) :: Nil))(${t}).reads(j)").toList :+ "HNil"
        ).mkString(" :: ")}).map(f.from)
      )"""

      val write = s"""
    def writes${paramList("Writes", "OWrites")}
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        ${(1 until n).map(x => s"val _$x = _${x - 1}.tail").mkString("; ")}
        ${tparams(n).zip(params(n)).zipWithIndex.map{ case ((t, k), i) =>
          s"(JsPath.createObj((JsPath \\ $k) -> $t.writes(_${i}.head)))"
        }.mkString(".deepMerge")}
      }"""


      val format = s"""
    def format${paramList("Format", "OFormat")}
      OFormat(
        reads(f)(${tparams(n).mkString(", ")}),
        writes(f)(${tparams(n).mkString(", ")})
      )"""


s"""
${method0("apply")}
${method0("apply" + n)}

  final class $builder private[$className](${params(n).map(_ + ": String").mkString(", ")}) {
    $read
    $write
    $format
  }"""
    }

  val range = 1 to 252

s"""package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode}
import shapeless.{HNil, HList, ::, Generic}

object $className {
  import Sequencer.sequence1

  ${range.tail.map(Sequencer.apply).mkString("\n")}

  ${range.map(method).mkString("\n")}
}
"""
  }

}
