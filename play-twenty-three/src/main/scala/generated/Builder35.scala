package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder35 (A1: String, A2: String, A3: String, A4: String, A5: String, A6: String, A7: String, A8: String, A9: String, A10: String, A11: String, A12: String, A13: String, A14: String, A15: String, A16: String, A17: String, A18: String, A19: String, A20: String, A21: String, A22: String, A23: String, A24: String, A25: String, A26: String, A27: String, A28: String, A29: String, A30: String, A31: String, A32: String, A33: String, A34: String, A35: String) {
    def reads[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3], k4: Reads[k4], k5: Reads[k5], k6: Reads[k6], k7: Reads[k7], k8: Reads[k8], k9: Reads[k9], k10: Reads[k10], k11: Reads[k11], k12: Reads[k12], k13: Reads[k13], k14: Reads[k14], k15: Reads[k15], k16: Reads[k16], k17: Reads[k17], k18: Reads[k18], k19: Reads[k19], k20: Reads[k20], k21: Reads[k21], k22: Reads[k22], k23: Reads[k23], k24: Reads[k24], k25: Reads[k25], k26: Reads[k26], k27: Reads[k27], k28: Reads[k28], k29: Reads[k29], k30: Reads[k30], k31: Reads[k31], k32: Reads[k32], k33: Reads[k33], k34: Reads[k34], k35: Reads[k35]): Reads[Z] =
      Reads[Z]( j =>
        sequence35[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: Reads.at(JsPath(KeyPathNode(A4) :: Nil))(k4).reads(j) :: Reads.at(JsPath(KeyPathNode(A5) :: Nil))(k5).reads(j) :: Reads.at(JsPath(KeyPathNode(A6) :: Nil))(k6).reads(j) :: Reads.at(JsPath(KeyPathNode(A7) :: Nil))(k7).reads(j) :: Reads.at(JsPath(KeyPathNode(A8) :: Nil))(k8).reads(j) :: Reads.at(JsPath(KeyPathNode(A9) :: Nil))(k9).reads(j) :: Reads.at(JsPath(KeyPathNode(A10) :: Nil))(k10).reads(j) :: Reads.at(JsPath(KeyPathNode(A11) :: Nil))(k11).reads(j) :: Reads.at(JsPath(KeyPathNode(A12) :: Nil))(k12).reads(j) :: Reads.at(JsPath(KeyPathNode(A13) :: Nil))(k13).reads(j) :: Reads.at(JsPath(KeyPathNode(A14) :: Nil))(k14).reads(j) :: Reads.at(JsPath(KeyPathNode(A15) :: Nil))(k15).reads(j) :: Reads.at(JsPath(KeyPathNode(A16) :: Nil))(k16).reads(j) :: Reads.at(JsPath(KeyPathNode(A17) :: Nil))(k17).reads(j) :: Reads.at(JsPath(KeyPathNode(A18) :: Nil))(k18).reads(j) :: Reads.at(JsPath(KeyPathNode(A19) :: Nil))(k19).reads(j) :: Reads.at(JsPath(KeyPathNode(A20) :: Nil))(k20).reads(j) :: Reads.at(JsPath(KeyPathNode(A21) :: Nil))(k21).reads(j) :: Reads.at(JsPath(KeyPathNode(A22) :: Nil))(k22).reads(j) :: Reads.at(JsPath(KeyPathNode(A23) :: Nil))(k23).reads(j) :: Reads.at(JsPath(KeyPathNode(A24) :: Nil))(k24).reads(j) :: Reads.at(JsPath(KeyPathNode(A25) :: Nil))(k25).reads(j) :: Reads.at(JsPath(KeyPathNode(A26) :: Nil))(k26).reads(j) :: Reads.at(JsPath(KeyPathNode(A27) :: Nil))(k27).reads(j) :: Reads.at(JsPath(KeyPathNode(A28) :: Nil))(k28).reads(j) :: Reads.at(JsPath(KeyPathNode(A29) :: Nil))(k29).reads(j) :: Reads.at(JsPath(KeyPathNode(A30) :: Nil))(k30).reads(j) :: Reads.at(JsPath(KeyPathNode(A31) :: Nil))(k31).reads(j) :: Reads.at(JsPath(KeyPathNode(A32) :: Nil))(k32).reads(j) :: Reads.at(JsPath(KeyPathNode(A33) :: Nil))(k33).reads(j) :: Reads.at(JsPath(KeyPathNode(A34) :: Nil))(k34).reads(j) :: Reads.at(JsPath(KeyPathNode(A35) :: Nil))(k35).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3], k4: Writes[k4], k5: Writes[k5], k6: Writes[k6], k7: Writes[k7], k8: Writes[k8], k9: Writes[k9], k10: Writes[k10], k11: Writes[k11], k12: Writes[k12], k13: Writes[k13], k14: Writes[k14], k15: Writes[k15], k16: Writes[k16], k17: Writes[k17], k18: Writes[k18], k19: Writes[k19], k20: Writes[k20], k21: Writes[k21], k22: Writes[k22], k23: Writes[k23], k24: Writes[k24], k25: Writes[k25], k26: Writes[k26], k27: Writes[k27], k28: Writes[k28], k29: Writes[k29], k30: Writes[k30], k31: Writes[k31], k32: Writes[k32], k33: Writes[k33], k34: Writes[k34], k35: Writes[k35]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail; val _3 = _2.tail; val _4 = _3.tail; val _5 = _4.tail; val _6 = _5.tail; val _7 = _6.tail; val _8 = _7.tail; val _9 = _8.tail; val _10 = _9.tail; val _11 = _10.tail; val _12 = _11.tail; val _13 = _12.tail; val _14 = _13.tail; val _15 = _14.tail; val _16 = _15.tail; val _17 = _16.tail; val _18 = _17.tail; val _19 = _18.tail; val _20 = _19.tail; val _21 = _20.tail; val _22 = _21.tail; val _23 = _22.tail; val _24 = _23.tail; val _25 = _24.tail; val _26 = _25.tail; val _27 = _26.tail; val _28 = _27.tail; val _29 = _28.tail; val _30 = _29.tail; val _31 = _30.tail; val _32 = _31.tail; val _33 = _32.tail; val _34 = _33.tail
        JsObject(Nil.::((A35,k35.writes(_34.head))).::((A34,k34.writes(_33.head))).::((A33,k33.writes(_32.head))).::((A32,k32.writes(_31.head))).::((A31,k31.writes(_30.head))).::((A30,k30.writes(_29.head))).::((A29,k29.writes(_28.head))).::((A28,k28.writes(_27.head))).::((A27,k27.writes(_26.head))).::((A26,k26.writes(_25.head))).::((A25,k25.writes(_24.head))).::((A24,k24.writes(_23.head))).::((A23,k23.writes(_22.head))).::((A22,k22.writes(_21.head))).::((A21,k21.writes(_20.head))).::((A20,k20.writes(_19.head))).::((A19,k19.writes(_18.head))).::((A18,k18.writes(_17.head))).::((A17,k17.writes(_16.head))).::((A16,k16.writes(_15.head))).::((A15,k15.writes(_14.head))).::((A14,k14.writes(_13.head))).::((A13,k13.writes(_12.head))).::((A12,k12.writes(_11.head))).::((A11,k11.writes(_10.head))).::((A10,k10.writes(_9.head))).::((A9,k9.writes(_8.head))).::((A8,k8.writes(_7.head))).::((A7,k7.writes(_6.head))).::((A6,k6.writes(_5.head))).::((A5,k5.writes(_4.head))).::((A4,k4.writes(_3.head))).::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3], k4: Format[k4], k5: Format[k5], k6: Format[k6], k7: Format[k7], k8: Format[k8], k9: Format[k9], k10: Format[k10], k11: Format[k11], k12: Format[k12], k13: Format[k13], k14: Format[k14], k15: Format[k15], k16: Format[k16], k17: Format[k17], k18: Format[k18], k19: Format[k19], k20: Format[k20], k21: Format[k21], k22: Format[k22], k23: Format[k23], k24: Format[k24], k25: Format[k25], k26: Format[k26], k27: Format[k27], k28: Format[k28], k29: Format[k29], k30: Format[k30], k31: Format[k31], k32: Format[k32], k33: Format[k33], k34: Format[k34], k35: Format[k35]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35),
        writes(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35)
      )
  }
