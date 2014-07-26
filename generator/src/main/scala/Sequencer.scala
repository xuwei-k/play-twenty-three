package play.twentythree

object Sequencer {

  def apply(n: Int): String = {
    val tparams = (1 to n).map("A" + _)
    val any = List.fill(n)("Any")
    def returnType(types: Seq[String]) =
      s"""Sequencer.Aux[${types.map("JsResult[" + _ + "]").mkString(" :: ")} :: HNil, JsResult[${types.mkString(" :: ")} :: HNil]]"""

    s"""
  private[this] val _sequence$n: ${returnType(any)} =
    Sequencer.cons(
      sequence${n - 1}[${any.tail.mkString(", ")}],
      Apply2.apply2[Any, ${any.tail.mkString(" :: ")} :: HNil]
    )

  def sequence$n[${tparams.mkString(", ")}]: ${returnType(tparams)} =
    _sequence$n.asInstanceOf[${returnType(tparams)}]"""

  }

}
