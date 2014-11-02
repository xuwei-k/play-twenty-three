package play.twentythree

object Param {
  def params(range: Iterable[Int]): Map[Int, Param] =
    range.map { n =>
      n -> Param.param(
        applyMethods = List("apply", "apply" + n),
        className = "Builder" + n
      )
    }.toMap

  def all(applyMethods: List[String], className: String): Param =
    param(applyMethods, className).enableAll

  def param(applyMethods: List[String], className: String): Param =
    Param(
      applyMethods = applyMethods,
      clazz = Clazz(className, true, false, true),
      _reads = Some(Defaults.ReadsMethod),
      _writesDeep = None,
      _writesPlus = None,
      _writesFast = Some(Defaults.WritesFastMethod),
      formatDeep = None,
      formatPlus = None,
      formatFast = Some(Defaults.FormatFastMethod),
      paramName = "k" + _,
      tparamName = "A" + _
    )

  object Defaults {
    final val ReadsMethod = "reads"

    final val WritesFastMethod = "writes"
    final val FormatFastMethod = "format"

    final val WritesPlusMethod = "writesPlus"
    final val FormatPlusMethod = "formatPlus"

    final val WritesDeepMethod = "writesDeep"
    final val FormatDeepMethod = "formatDeep"
  }
}

final case class Param(
  applyMethods: List[String],
  clazz: Clazz,
  _reads: Option[String],
  _writesDeep: Option[String],
  _writesPlus: Option[String],
  _writesFast: Option[String],
  formatDeep: Option[String],
  formatPlus: Option[String],
  formatFast: Option[String],
  paramName: Int => String,
  tparamName: Int => String
){
  def isEmpty: Boolean = List(reads, writesDeep, writesPlus, writesFast, formatDeep, formatPlus).forall(_.isEmpty)
  def nonEmpty: Boolean = !isEmpty

  def writesDeep: Option[String] = _writesDeep.orElse(formatDeep.map(_ => Param.Defaults.WritesDeepMethod))
  def writesPlus: Option[String] = _writesPlus.orElse(formatPlus.map(_ => Param.Defaults.WritesPlusMethod))
  def writesFast: Option[String] = _writesFast.orElse(formatFast.map(_ => Param.Defaults.WritesFastMethod))
  def reads: Option[String] = {
    _reads.orElse{
      if(List(formatDeep, formatPlus, formatFast).exists(_.isDefined))
        Some(Param.Defaults.ReadsMethod)
      else
        None
    }
  }

  private def conflictMethods(methods: Option[String]*): List[String] =
    methods.flatten.combinations(2).collect{
     case List(x, y) if x == y => x
   }.toList

  def conflictFormat: List[String] = conflictMethods(
    formatDeep, formatPlus, formatFast
  )

  def conflictWrites: List[String] = conflictMethods(
    writesDeep, writesPlus, writesFast
  )

  def enableAll: Param = {
    import Param.Defaults._
    copy(
      _reads      = Some(reads.getOrElse(ReadsMethod)),
      _writesDeep = Some(writesDeep.getOrElse(WritesDeepMethod)),
      _writesPlus = Some(writesPlus.getOrElse(WritesPlusMethod)),
      _writesFast = Some(writesFast.getOrElse(WritesFastMethod)),
      formatDeep  = Some(formatDeep.getOrElse(FormatDeepMethod)),
      formatPlus  = Some(formatPlus.getOrElse(FormatPlusMethod)),
      formatFast  = Some(formatFast.getOrElse(FormatFastMethod))
    )
  }
}
