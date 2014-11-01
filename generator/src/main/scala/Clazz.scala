package play.twentythree

final case class Clazz(name: String, isFinal: Boolean, isCase: Boolean, constructorPrivate: Boolean){
  private[twentythree] def str(outer: String): String = List(
    if(isFinal) "final " else "",
    if(isCase) "case " else "",
    "class " + name + " ",
    if(constructorPrivate) s"private[$outer]" else ""
  ).mkString
}
