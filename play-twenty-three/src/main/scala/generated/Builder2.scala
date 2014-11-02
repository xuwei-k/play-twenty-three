package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder2 (A1: String, A2: String) {
    def reads[k1, k2, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2]): Reads[Z] =
      Reads[Z]( j =>
        sequence2[k1, k2](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail
        JsObject(Nil.::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: HNil })(implicit k1: Format[k1], k2: Format[k2]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2),
        writes(f)(k1, k2)
      )
  }
