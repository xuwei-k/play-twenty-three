package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder22 (A1: String, A2: String, A3: String, A4: String, A5: String, A6: String, A7: String, A8: String, A9: String, A10: String, A11: String, A12: String, A13: String, A14: String, A15: String, A16: String, A17: String, A18: String, A19: String, A20: String, A21: String, A22: String) {
    def reads[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3], k4: Reads[k4], k5: Reads[k5], k6: Reads[k6], k7: Reads[k7], k8: Reads[k8], k9: Reads[k9], k10: Reads[k10], k11: Reads[k11], k12: Reads[k12], k13: Reads[k13], k14: Reads[k14], k15: Reads[k15], k16: Reads[k16], k17: Reads[k17], k18: Reads[k18], k19: Reads[k19], k20: Reads[k20], k21: Reads[k21], k22: Reads[k22]): Reads[Z] =
      Reads[Z]( j =>
        sequence22[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: Reads.at(JsPath(KeyPathNode(A4) :: Nil))(k4).reads(j) :: Reads.at(JsPath(KeyPathNode(A5) :: Nil))(k5).reads(j) :: Reads.at(JsPath(KeyPathNode(A6) :: Nil))(k6).reads(j) :: Reads.at(JsPath(KeyPathNode(A7) :: Nil))(k7).reads(j) :: Reads.at(JsPath(KeyPathNode(A8) :: Nil))(k8).reads(j) :: Reads.at(JsPath(KeyPathNode(A9) :: Nil))(k9).reads(j) :: Reads.at(JsPath(KeyPathNode(A10) :: Nil))(k10).reads(j) :: Reads.at(JsPath(KeyPathNode(A11) :: Nil))(k11).reads(j) :: Reads.at(JsPath(KeyPathNode(A12) :: Nil))(k12).reads(j) :: Reads.at(JsPath(KeyPathNode(A13) :: Nil))(k13).reads(j) :: Reads.at(JsPath(KeyPathNode(A14) :: Nil))(k14).reads(j) :: Reads.at(JsPath(KeyPathNode(A15) :: Nil))(k15).reads(j) :: Reads.at(JsPath(KeyPathNode(A16) :: Nil))(k16).reads(j) :: Reads.at(JsPath(KeyPathNode(A17) :: Nil))(k17).reads(j) :: Reads.at(JsPath(KeyPathNode(A18) :: Nil))(k18).reads(j) :: Reads.at(JsPath(KeyPathNode(A19) :: Nil))(k19).reads(j) :: Reads.at(JsPath(KeyPathNode(A20) :: Nil))(k20).reads(j) :: Reads.at(JsPath(KeyPathNode(A21) :: Nil))(k21).reads(j) :: Reads.at(JsPath(KeyPathNode(A22) :: Nil))(k22).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3], k4: Writes[k4], k5: Writes[k5], k6: Writes[k6], k7: Writes[k7], k8: Writes[k8], k9: Writes[k9], k10: Writes[k10], k11: Writes[k11], k12: Writes[k12], k13: Writes[k13], k14: Writes[k14], k15: Writes[k15], k16: Writes[k16], k17: Writes[k17], k18: Writes[k18], k19: Writes[k19], k20: Writes[k20], k21: Writes[k21], k22: Writes[k22]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail; val _3 = _2.tail; val _4 = _3.tail; val _5 = _4.tail; val _6 = _5.tail; val _7 = _6.tail; val _8 = _7.tail; val _9 = _8.tail; val _10 = _9.tail; val _11 = _10.tail; val _12 = _11.tail; val _13 = _12.tail; val _14 = _13.tail; val _15 = _14.tail; val _16 = _15.tail; val _17 = _16.tail; val _18 = _17.tail; val _19 = _18.tail; val _20 = _19.tail; val _21 = _20.tail
        JsObject(Nil.::((A22,k22.writes(_21.head))).::((A21,k21.writes(_20.head))).::((A20,k20.writes(_19.head))).::((A19,k19.writes(_18.head))).::((A18,k18.writes(_17.head))).::((A17,k17.writes(_16.head))).::((A16,k16.writes(_15.head))).::((A15,k15.writes(_14.head))).::((A14,k14.writes(_13.head))).::((A13,k13.writes(_12.head))).::((A12,k12.writes(_11.head))).::((A11,k11.writes(_10.head))).::((A10,k10.writes(_9.head))).::((A9,k9.writes(_8.head))).::((A8,k8.writes(_7.head))).::((A7,k7.writes(_6.head))).::((A6,k6.writes(_5.head))).::((A5,k5.writes(_4.head))).::((A4,k4.writes(_3.head))).::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3], k4: Format[k4], k5: Format[k5], k6: Format[k6], k7: Format[k7], k8: Format[k8], k9: Format[k9], k10: Format[k10], k11: Format[k11], k12: Format[k12], k13: Format[k13], k14: Format[k14], k15: Format[k15], k16: Format[k16], k17: Format[k17], k18: Format[k18], k19: Format[k19], k20: Format[k20], k21: Format[k21], k22: Format[k22]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22),
        writes(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22)
      )
  }
