package play.twentythree

final case class Settings(
  packageName: String,
  objectName: String,
  params: Map[Int, Param]
) {
  def enableAll: Settings = copy(
    params = params.mapValues(_.enableAll)
  )

  def validate: Option[String] = {
    params.values.toList.collectFirst{
      case x if x.conflictFormat.nonEmpty =>
        "conflict format methods " + x.conflictFormat
      case x if x.conflictWrites.nonEmpty =>
        "conflict writes methods " + x.conflictWrites
    }
  }
}

object Settings {
  def withParams(params: Map[Int, Param]): Settings =
    Settings(
      packageName = Generate.defaultPackageName,
      objectName = Generate.defaultObjectName,
      params = params
    )

  def get(range: Iterable[Int]): Settings =
    withParams(Param.params(range))

  def all(range: Iterable[Int]): Settings =
    withParams(Param.params(range).mapValues(_.enableAll))
}
