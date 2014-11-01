package play.twentythree

final case class Settings(
  packageName: String,
  objectName: String,
  params: Map[Int, Param]
)

object Settings {
  def withParams(params: Map[Int, Param]): Settings =
    Settings(
      packageName = Generate.defaultPackageName,
      objectName = Generate.defaultObjectName,
      params = params
    )

  def get(range: Iterable[Int]): Settings =
    withParams(Param.params(range))
}
