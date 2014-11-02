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
    generate(dir)
  }

  final val defaultPackageName = "play.twentythree"
  final val defaultObjectName = "PlayJson"
  private[this] final val charSet = Charset.forName("UTF-8")

  private def generate(dir: File): Unit = {
    generateMain(dir)
    generateSequencer(dir)
  }

  private def generateMain(dir: File): Unit = {
    val f = new File(dir, defaultObjectName + ".scala").toPath
    val source = code(Settings(defaultPackageName, defaultObjectName, Param.params(1 to 252)))
    Files.write(f, singletonList(source), charSet)
  }

  private def generateSequencer(dir: File): Unit = {
    val name = "Sequencer"
    val f = new File(dir, name + ".scala").toPath
    Files.write(f, singletonList(GenSequencer.gen(defaultPackageName)), charSet)
  }

  def code(setting: Settings): String = {
    val method: Tuple2[Int, Param] => String = {
      case (n, param) =>

        def tparams(n: Int): Seq[String] = (1 to n).map(param.tparamName)
        def params(n: Int): Seq[String] = (1 to n).map(param.paramName)

        val builder: String = param.clazz.name
        def method0(methodName: String) = s"""
  def ${methodName}(${params(n).map(_ + ": String").mkString(", ")}): $builder =
    new $builder(${params(n).mkString(", ")})"""

        def paramList(class1: String, class2: String) =
          s"""[${tparams(n).mkString(", ")}, Z](f: Generic[Z]{ type Repr = ${(tparams(n) :+ "HNil").mkString(" :: ")} })(implicit ${tparams(n).map(t => s"${t}: ${class1}[${t}]").mkString(", ")}): ${class2}[Z] ="""

        def read(readMethodName: String) = s"""
    def $readMethodName${paramList("Reads", "Reads")}
      Reads[Z]( j =>
        sequence$n[${tparams(n).mkString(", ")}](${
          (
            (tparams(n), params(n)).zipped.map((t, k) => s"Reads.at(JsPath(KeyPathNode($k) :: Nil))(${t}).reads(j)").toList :+ "HNil"
            ).mkString(" :: ")
        }).map(f.from)
      )"""

        def write(writeMethodName: String) = s"""
    def $writeMethodName${paramList("Writes", "OWrites")}
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        ${(1 until n).map(x => s"val _$x = _${x - 1}.tail").mkString("; ")}
        ${tparams(n).zip(params(n)).zipWithIndex.map { case ((t, k), i) =>
          s"(JsPath.createObj((JsPath \\ $k) -> $t.writes(_${i}.head)))"
        }.mkString(".deepMerge")}
      }"""


        def format(formatMethodName: String) = s"""
    def $formatMethodName${paramList("Format", "OFormat")}
      OFormat(
        ${param.reads.get}(f)(${tparams(n).mkString(", ")}),
        ${param.writes.get}(f)(${tparams(n).mkString(", ")})
      )"""

        Option(param).filterNot(_.isEmpty) match {
          case Some(p) =>
            s"""
${p.applyMethods.map(method0).mkString("\n")}

  ${p.clazz.str(setting.objectName)}(${params(n).map(_ + ": String").mkString(", ")}) {
    ${p.reads.fold("")(read)}
    ${p.writes.fold("")(write)}
    ${p.format.fold("")(format)}
  }"""
          case None => ""
        }
    }

  val range: List[(Int, Param)] = setting.params.filter{
    case (k, v) => v.nonEmpty
  }.toList.sortBy(_._1)

  val max: Int = setting.params.map(_._1).reduceOption(_ max _).getOrElse(0)

s"""package ${setting.packageName}

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode}
import shapeless.{HNil, HList, ::, Generic}

object ${setting.objectName} {
  import Sequencer.sequence1

  ${(2 to max).map(Sequencer.apply).mkString("\n")}

  ${range.map(method).mkString("\n")}
}
"""
  }

}
