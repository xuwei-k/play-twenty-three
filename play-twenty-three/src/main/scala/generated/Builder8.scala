package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder8 (A1: String, A2: String, A3: String, A4: String, A5: String, A6: String, A7: String, A8: String) {
    def reads[k1, k2, k3, k4, k5, k6, k7, k8, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3], k4: Reads[k4], k5: Reads[k5], k6: Reads[k6], k7: Reads[k7], k8: Reads[k8]): Reads[Z] =
      Reads[Z]( j =>
        sequence8[k1, k2, k3, k4, k5, k6, k7, k8](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: Reads.at(JsPath(KeyPathNode(A4) :: Nil))(k4).reads(j) :: Reads.at(JsPath(KeyPathNode(A5) :: Nil))(k5).reads(j) :: Reads.at(JsPath(KeyPathNode(A6) :: Nil))(k6).reads(j) :: Reads.at(JsPath(KeyPathNode(A7) :: Nil))(k7).reads(j) :: Reads.at(JsPath(KeyPathNode(A8) :: Nil))(k8).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, k4, k5, k6, k7, k8, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3], k4: Writes[k4], k5: Writes[k5], k6: Writes[k6], k7: Writes[k7], k8: Writes[k8]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail; val _3 = _2.tail; val _4 = _3.tail; val _5 = _4.tail; val _6 = _5.tail; val _7 = _6.tail
        JsObject(Nil.::((A8,k8.writes(_7.head))).::((A7,k7.writes(_6.head))).::((A6,k6.writes(_5.head))).::((A5,k5.writes(_4.head))).::((A4,k4.writes(_3.head))).::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, k4, k5, k6, k7, k8, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3], k4: Format[k4], k5: Format[k5], k6: Format[k6], k7: Format[k7], k8: Format[k8]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3, k4, k5, k6, k7, k8),
        writes(f)(k1, k2, k3, k4, k5, k6, k7, k8)
      )
  }
