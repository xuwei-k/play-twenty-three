package play.twentythree

import java.io.File
import java.nio.file.Files
import java.nio.charset.Charset
import java.util.Collections.singletonList

object Param {
  def params(range: Iterable[Int]): Map[Int, Param] =
    range.map { n =>
      n -> Param.param(
        applyMethods = List("apply", "apply" + n),
        className = "Builder" + n
      )
    }.toMap

  def param(applyMethods: List[String], className: String): Param =
    Param(
      applyMethods = applyMethods,
      clazz = Clazz(className, true, false, true),
      _reads = Some("reads"),
      _writes = Some("writes"),
      format = Some("format"),
      paramName = "k" + _,
      tparamName = "A" + _
    )
}

final case class Param(
  applyMethods: List[String],
  clazz: Clazz,
  _reads: Option[String],
  _writes: Option[String],
  format: Option[String],
  paramName: Int => String,
  tparamName: Int => String
){
  def isEmpty: Boolean = reads.isEmpty && writes.isEmpty && format.isEmpty
  def nonEmpty: Boolean = !isEmpty

  def reads: Option[String] = _reads.orElse(format.map(_ => "reads"))
  def writes: Option[String] = _writes.orElse(format.map(_ => "writes"))
}
