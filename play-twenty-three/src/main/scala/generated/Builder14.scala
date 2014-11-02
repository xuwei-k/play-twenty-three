package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder14 (A1: String, A2: String, A3: String, A4: String, A5: String, A6: String, A7: String, A8: String, A9: String, A10: String, A11: String, A12: String, A13: String, A14: String) {
    def reads[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3], k4: Reads[k4], k5: Reads[k5], k6: Reads[k6], k7: Reads[k7], k8: Reads[k8], k9: Reads[k9], k10: Reads[k10], k11: Reads[k11], k12: Reads[k12], k13: Reads[k13], k14: Reads[k14]): Reads[Z] =
      Reads[Z]( j =>
        sequence14[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: Reads.at(JsPath(KeyPathNode(A4) :: Nil))(k4).reads(j) :: Reads.at(JsPath(KeyPathNode(A5) :: Nil))(k5).reads(j) :: Reads.at(JsPath(KeyPathNode(A6) :: Nil))(k6).reads(j) :: Reads.at(JsPath(KeyPathNode(A7) :: Nil))(k7).reads(j) :: Reads.at(JsPath(KeyPathNode(A8) :: Nil))(k8).reads(j) :: Reads.at(JsPath(KeyPathNode(A9) :: Nil))(k9).reads(j) :: Reads.at(JsPath(KeyPathNode(A10) :: Nil))(k10).reads(j) :: Reads.at(JsPath(KeyPathNode(A11) :: Nil))(k11).reads(j) :: Reads.at(JsPath(KeyPathNode(A12) :: Nil))(k12).reads(j) :: Reads.at(JsPath(KeyPathNode(A13) :: Nil))(k13).reads(j) :: Reads.at(JsPath(KeyPathNode(A14) :: Nil))(k14).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3], k4: Writes[k4], k5: Writes[k5], k6: Writes[k6], k7: Writes[k7], k8: Writes[k8], k9: Writes[k9], k10: Writes[k10], k11: Writes[k11], k12: Writes[k12], k13: Writes[k13], k14: Writes[k14]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail; val _3 = _2.tail; val _4 = _3.tail; val _5 = _4.tail; val _6 = _5.tail; val _7 = _6.tail; val _8 = _7.tail; val _9 = _8.tail; val _10 = _9.tail; val _11 = _10.tail; val _12 = _11.tail; val _13 = _12.tail
        JsObject(Nil.::((A14,k14.writes(_13.head))).::((A13,k13.writes(_12.head))).::((A12,k12.writes(_11.head))).::((A11,k11.writes(_10.head))).::((A10,k10.writes(_9.head))).::((A9,k9.writes(_8.head))).::((A8,k8.writes(_7.head))).::((A7,k7.writes(_6.head))).::((A6,k6.writes(_5.head))).::((A5,k5.writes(_4.head))).::((A4,k4.writes(_3.head))).::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3], k4: Format[k4], k5: Format[k5], k6: Format[k6], k7: Format[k7], k8: Format[k8], k9: Format[k9], k10: Format[k10], k11: Format[k11], k12: Format[k12], k13: Format[k13], k14: Format[k14]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14),
        writes(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14)
      )
  }
