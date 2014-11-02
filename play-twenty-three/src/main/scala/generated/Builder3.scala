package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder3 (A1: String, A2: String, A3: String) {
    def reads[k1, k2, k3, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3]): Reads[Z] =
      Reads[Z]( j =>
        sequence3[k1, k2, k3](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail
        JsObject(Nil.::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3),
        writes(f)(k1, k2, k3)
      )
  }
