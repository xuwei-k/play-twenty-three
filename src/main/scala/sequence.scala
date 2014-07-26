package play.twentythree

import shapeless.{HNil, HList, ::}
import play.api.libs.json.{JsError, JsSuccess, JsResult}

trait Apply2[FH, OutT] {
  type Out
  def apply(fh: FH, outT: OutT): Out
}

object Apply2 {
  type Aux[FH, OutT, Out0] = Apply2[FH, OutT] { type Out = Out0 }

  private[this] val _apply2: Aux[JsResult[Any], JsResult[Any], JsResult[Any]] =
    new Apply2[JsResult[Any], JsResult[Any]] {
      type Out = JsResult[Any]
      def apply(head: JsResult[Any], tail: JsResult[Any]): Out =
        (head, tail) match {
          case (JsSuccess(h, _), JsSuccess(t, _)) =>
            JsSuccess(shapeless.::(h, t.asInstanceOf[HList]).asInstanceOf[Any])
          case (JsError(h), JsError(t)) =>
            JsError(JsError.merge(h, t))
          case (e @ JsError(_), _) =>
            e
          case (_, e @ JsError(_)) =>
            e
        }
    }


  def apply2[H, T <: HList]: Aux[JsResult[H], JsResult[T], JsResult[H :: T]] =
    _apply2.asInstanceOf[Aux[JsResult[H], JsResult[T], JsResult[H :: T]]]
}

trait Sequencer[L <: HList] {
  type Out
  def apply(in: L): Out
}

object Sequencer {

  type Aux[L <: HList, Out0] = Sequencer[L] { type Out = Out0 }

  def cons[FH, FT <: HList, OutT](
    st: Aux[FT, OutT],
    ap: Apply2[FH, OutT]
  ): Aux[FH :: FT, ap.Out] =
    new Sequencer[FH :: FT] {
      type Out = ap.Out
      def apply(in: FH :: FT): Out = ap(in.head, st(in.tail))
    }

  private[this] val _sequence1: Sequencer[JsResult[Any] :: HNil]{ type Out = JsResult[Any :: HNil] } =
    new Sequencer[JsResult[Any] :: HNil] {
      type Out = JsResult[Any :: HNil]
      def apply(in: JsResult[Any] :: HNil): Out =
        in.head.map(_ :: HNil)
    }

  def sequence1[H]: Sequencer[JsResult[H] :: HNil]{ type Out = JsResult[H :: HNil] } =
    _sequence1.asInstanceOf[Sequencer[JsResult[H] :: HNil]{ type Out = JsResult[H :: HNil] }]

}

