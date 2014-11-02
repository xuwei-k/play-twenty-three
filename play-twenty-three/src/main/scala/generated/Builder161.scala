package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder161 (A1: String, A2: String, A3: String, A4: String, A5: String, A6: String, A7: String, A8: String, A9: String, A10: String, A11: String, A12: String, A13: String, A14: String, A15: String, A16: String, A17: String, A18: String, A19: String, A20: String, A21: String, A22: String, A23: String, A24: String, A25: String, A26: String, A27: String, A28: String, A29: String, A30: String, A31: String, A32: String, A33: String, A34: String, A35: String, A36: String, A37: String, A38: String, A39: String, A40: String, A41: String, A42: String, A43: String, A44: String, A45: String, A46: String, A47: String, A48: String, A49: String, A50: String, A51: String, A52: String, A53: String, A54: String, A55: String, A56: String, A57: String, A58: String, A59: String, A60: String, A61: String, A62: String, A63: String, A64: String, A65: String, A66: String, A67: String, A68: String, A69: String, A70: String, A71: String, A72: String, A73: String, A74: String, A75: String, A76: String, A77: String, A78: String, A79: String, A80: String, A81: String, A82: String, A83: String, A84: String, A85: String, A86: String, A87: String, A88: String, A89: String, A90: String, A91: String, A92: String, A93: String, A94: String, A95: String, A96: String, A97: String, A98: String, A99: String, A100: String, A101: String, A102: String, A103: String, A104: String, A105: String, A106: String, A107: String, A108: String, A109: String, A110: String, A111: String, A112: String, A113: String, A114: String, A115: String, A116: String, A117: String, A118: String, A119: String, A120: String, A121: String, A122: String, A123: String, A124: String, A125: String, A126: String, A127: String, A128: String, A129: String, A130: String, A131: String, A132: String, A133: String, A134: String, A135: String, A136: String, A137: String, A138: String, A139: String, A140: String, A141: String, A142: String, A143: String, A144: String, A145: String, A146: String, A147: String, A148: String, A149: String, A150: String, A151: String, A152: String, A153: String, A154: String, A155: String, A156: String, A157: String, A158: String, A159: String, A160: String, A161: String) {
    def reads[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: k36 :: k37 :: k38 :: k39 :: k40 :: k41 :: k42 :: k43 :: k44 :: k45 :: k46 :: k47 :: k48 :: k49 :: k50 :: k51 :: k52 :: k53 :: k54 :: k55 :: k56 :: k57 :: k58 :: k59 :: k60 :: k61 :: k62 :: k63 :: k64 :: k65 :: k66 :: k67 :: k68 :: k69 :: k70 :: k71 :: k72 :: k73 :: k74 :: k75 :: k76 :: k77 :: k78 :: k79 :: k80 :: k81 :: k82 :: k83 :: k84 :: k85 :: k86 :: k87 :: k88 :: k89 :: k90 :: k91 :: k92 :: k93 :: k94 :: k95 :: k96 :: k97 :: k98 :: k99 :: k100 :: k101 :: k102 :: k103 :: k104 :: k105 :: k106 :: k107 :: k108 :: k109 :: k110 :: k111 :: k112 :: k113 :: k114 :: k115 :: k116 :: k117 :: k118 :: k119 :: k120 :: k121 :: k122 :: k123 :: k124 :: k125 :: k126 :: k127 :: k128 :: k129 :: k130 :: k131 :: k132 :: k133 :: k134 :: k135 :: k136 :: k137 :: k138 :: k139 :: k140 :: k141 :: k142 :: k143 :: k144 :: k145 :: k146 :: k147 :: k148 :: k149 :: k150 :: k151 :: k152 :: k153 :: k154 :: k155 :: k156 :: k157 :: k158 :: k159 :: k160 :: k161 :: HNil })(implicit k1: Reads[k1], k2: Reads[k2], k3: Reads[k3], k4: Reads[k4], k5: Reads[k5], k6: Reads[k6], k7: Reads[k7], k8: Reads[k8], k9: Reads[k9], k10: Reads[k10], k11: Reads[k11], k12: Reads[k12], k13: Reads[k13], k14: Reads[k14], k15: Reads[k15], k16: Reads[k16], k17: Reads[k17], k18: Reads[k18], k19: Reads[k19], k20: Reads[k20], k21: Reads[k21], k22: Reads[k22], k23: Reads[k23], k24: Reads[k24], k25: Reads[k25], k26: Reads[k26], k27: Reads[k27], k28: Reads[k28], k29: Reads[k29], k30: Reads[k30], k31: Reads[k31], k32: Reads[k32], k33: Reads[k33], k34: Reads[k34], k35: Reads[k35], k36: Reads[k36], k37: Reads[k37], k38: Reads[k38], k39: Reads[k39], k40: Reads[k40], k41: Reads[k41], k42: Reads[k42], k43: Reads[k43], k44: Reads[k44], k45: Reads[k45], k46: Reads[k46], k47: Reads[k47], k48: Reads[k48], k49: Reads[k49], k50: Reads[k50], k51: Reads[k51], k52: Reads[k52], k53: Reads[k53], k54: Reads[k54], k55: Reads[k55], k56: Reads[k56], k57: Reads[k57], k58: Reads[k58], k59: Reads[k59], k60: Reads[k60], k61: Reads[k61], k62: Reads[k62], k63: Reads[k63], k64: Reads[k64], k65: Reads[k65], k66: Reads[k66], k67: Reads[k67], k68: Reads[k68], k69: Reads[k69], k70: Reads[k70], k71: Reads[k71], k72: Reads[k72], k73: Reads[k73], k74: Reads[k74], k75: Reads[k75], k76: Reads[k76], k77: Reads[k77], k78: Reads[k78], k79: Reads[k79], k80: Reads[k80], k81: Reads[k81], k82: Reads[k82], k83: Reads[k83], k84: Reads[k84], k85: Reads[k85], k86: Reads[k86], k87: Reads[k87], k88: Reads[k88], k89: Reads[k89], k90: Reads[k90], k91: Reads[k91], k92: Reads[k92], k93: Reads[k93], k94: Reads[k94], k95: Reads[k95], k96: Reads[k96], k97: Reads[k97], k98: Reads[k98], k99: Reads[k99], k100: Reads[k100], k101: Reads[k101], k102: Reads[k102], k103: Reads[k103], k104: Reads[k104], k105: Reads[k105], k106: Reads[k106], k107: Reads[k107], k108: Reads[k108], k109: Reads[k109], k110: Reads[k110], k111: Reads[k111], k112: Reads[k112], k113: Reads[k113], k114: Reads[k114], k115: Reads[k115], k116: Reads[k116], k117: Reads[k117], k118: Reads[k118], k119: Reads[k119], k120: Reads[k120], k121: Reads[k121], k122: Reads[k122], k123: Reads[k123], k124: Reads[k124], k125: Reads[k125], k126: Reads[k126], k127: Reads[k127], k128: Reads[k128], k129: Reads[k129], k130: Reads[k130], k131: Reads[k131], k132: Reads[k132], k133: Reads[k133], k134: Reads[k134], k135: Reads[k135], k136: Reads[k136], k137: Reads[k137], k138: Reads[k138], k139: Reads[k139], k140: Reads[k140], k141: Reads[k141], k142: Reads[k142], k143: Reads[k143], k144: Reads[k144], k145: Reads[k145], k146: Reads[k146], k147: Reads[k147], k148: Reads[k148], k149: Reads[k149], k150: Reads[k150], k151: Reads[k151], k152: Reads[k152], k153: Reads[k153], k154: Reads[k154], k155: Reads[k155], k156: Reads[k156], k157: Reads[k157], k158: Reads[k158], k159: Reads[k159], k160: Reads[k160], k161: Reads[k161]): Reads[Z] =
      Reads[Z]( j =>
        sequence161[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: Reads.at(JsPath(KeyPathNode(A2) :: Nil))(k2).reads(j) :: Reads.at(JsPath(KeyPathNode(A3) :: Nil))(k3).reads(j) :: Reads.at(JsPath(KeyPathNode(A4) :: Nil))(k4).reads(j) :: Reads.at(JsPath(KeyPathNode(A5) :: Nil))(k5).reads(j) :: Reads.at(JsPath(KeyPathNode(A6) :: Nil))(k6).reads(j) :: Reads.at(JsPath(KeyPathNode(A7) :: Nil))(k7).reads(j) :: Reads.at(JsPath(KeyPathNode(A8) :: Nil))(k8).reads(j) :: Reads.at(JsPath(KeyPathNode(A9) :: Nil))(k9).reads(j) :: Reads.at(JsPath(KeyPathNode(A10) :: Nil))(k10).reads(j) :: Reads.at(JsPath(KeyPathNode(A11) :: Nil))(k11).reads(j) :: Reads.at(JsPath(KeyPathNode(A12) :: Nil))(k12).reads(j) :: Reads.at(JsPath(KeyPathNode(A13) :: Nil))(k13).reads(j) :: Reads.at(JsPath(KeyPathNode(A14) :: Nil))(k14).reads(j) :: Reads.at(JsPath(KeyPathNode(A15) :: Nil))(k15).reads(j) :: Reads.at(JsPath(KeyPathNode(A16) :: Nil))(k16).reads(j) :: Reads.at(JsPath(KeyPathNode(A17) :: Nil))(k17).reads(j) :: Reads.at(JsPath(KeyPathNode(A18) :: Nil))(k18).reads(j) :: Reads.at(JsPath(KeyPathNode(A19) :: Nil))(k19).reads(j) :: Reads.at(JsPath(KeyPathNode(A20) :: Nil))(k20).reads(j) :: Reads.at(JsPath(KeyPathNode(A21) :: Nil))(k21).reads(j) :: Reads.at(JsPath(KeyPathNode(A22) :: Nil))(k22).reads(j) :: Reads.at(JsPath(KeyPathNode(A23) :: Nil))(k23).reads(j) :: Reads.at(JsPath(KeyPathNode(A24) :: Nil))(k24).reads(j) :: Reads.at(JsPath(KeyPathNode(A25) :: Nil))(k25).reads(j) :: Reads.at(JsPath(KeyPathNode(A26) :: Nil))(k26).reads(j) :: Reads.at(JsPath(KeyPathNode(A27) :: Nil))(k27).reads(j) :: Reads.at(JsPath(KeyPathNode(A28) :: Nil))(k28).reads(j) :: Reads.at(JsPath(KeyPathNode(A29) :: Nil))(k29).reads(j) :: Reads.at(JsPath(KeyPathNode(A30) :: Nil))(k30).reads(j) :: Reads.at(JsPath(KeyPathNode(A31) :: Nil))(k31).reads(j) :: Reads.at(JsPath(KeyPathNode(A32) :: Nil))(k32).reads(j) :: Reads.at(JsPath(KeyPathNode(A33) :: Nil))(k33).reads(j) :: Reads.at(JsPath(KeyPathNode(A34) :: Nil))(k34).reads(j) :: Reads.at(JsPath(KeyPathNode(A35) :: Nil))(k35).reads(j) :: Reads.at(JsPath(KeyPathNode(A36) :: Nil))(k36).reads(j) :: Reads.at(JsPath(KeyPathNode(A37) :: Nil))(k37).reads(j) :: Reads.at(JsPath(KeyPathNode(A38) :: Nil))(k38).reads(j) :: Reads.at(JsPath(KeyPathNode(A39) :: Nil))(k39).reads(j) :: Reads.at(JsPath(KeyPathNode(A40) :: Nil))(k40).reads(j) :: Reads.at(JsPath(KeyPathNode(A41) :: Nil))(k41).reads(j) :: Reads.at(JsPath(KeyPathNode(A42) :: Nil))(k42).reads(j) :: Reads.at(JsPath(KeyPathNode(A43) :: Nil))(k43).reads(j) :: Reads.at(JsPath(KeyPathNode(A44) :: Nil))(k44).reads(j) :: Reads.at(JsPath(KeyPathNode(A45) :: Nil))(k45).reads(j) :: Reads.at(JsPath(KeyPathNode(A46) :: Nil))(k46).reads(j) :: Reads.at(JsPath(KeyPathNode(A47) :: Nil))(k47).reads(j) :: Reads.at(JsPath(KeyPathNode(A48) :: Nil))(k48).reads(j) :: Reads.at(JsPath(KeyPathNode(A49) :: Nil))(k49).reads(j) :: Reads.at(JsPath(KeyPathNode(A50) :: Nil))(k50).reads(j) :: Reads.at(JsPath(KeyPathNode(A51) :: Nil))(k51).reads(j) :: Reads.at(JsPath(KeyPathNode(A52) :: Nil))(k52).reads(j) :: Reads.at(JsPath(KeyPathNode(A53) :: Nil))(k53).reads(j) :: Reads.at(JsPath(KeyPathNode(A54) :: Nil))(k54).reads(j) :: Reads.at(JsPath(KeyPathNode(A55) :: Nil))(k55).reads(j) :: Reads.at(JsPath(KeyPathNode(A56) :: Nil))(k56).reads(j) :: Reads.at(JsPath(KeyPathNode(A57) :: Nil))(k57).reads(j) :: Reads.at(JsPath(KeyPathNode(A58) :: Nil))(k58).reads(j) :: Reads.at(JsPath(KeyPathNode(A59) :: Nil))(k59).reads(j) :: Reads.at(JsPath(KeyPathNode(A60) :: Nil))(k60).reads(j) :: Reads.at(JsPath(KeyPathNode(A61) :: Nil))(k61).reads(j) :: Reads.at(JsPath(KeyPathNode(A62) :: Nil))(k62).reads(j) :: Reads.at(JsPath(KeyPathNode(A63) :: Nil))(k63).reads(j) :: Reads.at(JsPath(KeyPathNode(A64) :: Nil))(k64).reads(j) :: Reads.at(JsPath(KeyPathNode(A65) :: Nil))(k65).reads(j) :: Reads.at(JsPath(KeyPathNode(A66) :: Nil))(k66).reads(j) :: Reads.at(JsPath(KeyPathNode(A67) :: Nil))(k67).reads(j) :: Reads.at(JsPath(KeyPathNode(A68) :: Nil))(k68).reads(j) :: Reads.at(JsPath(KeyPathNode(A69) :: Nil))(k69).reads(j) :: Reads.at(JsPath(KeyPathNode(A70) :: Nil))(k70).reads(j) :: Reads.at(JsPath(KeyPathNode(A71) :: Nil))(k71).reads(j) :: Reads.at(JsPath(KeyPathNode(A72) :: Nil))(k72).reads(j) :: Reads.at(JsPath(KeyPathNode(A73) :: Nil))(k73).reads(j) :: Reads.at(JsPath(KeyPathNode(A74) :: Nil))(k74).reads(j) :: Reads.at(JsPath(KeyPathNode(A75) :: Nil))(k75).reads(j) :: Reads.at(JsPath(KeyPathNode(A76) :: Nil))(k76).reads(j) :: Reads.at(JsPath(KeyPathNode(A77) :: Nil))(k77).reads(j) :: Reads.at(JsPath(KeyPathNode(A78) :: Nil))(k78).reads(j) :: Reads.at(JsPath(KeyPathNode(A79) :: Nil))(k79).reads(j) :: Reads.at(JsPath(KeyPathNode(A80) :: Nil))(k80).reads(j) :: Reads.at(JsPath(KeyPathNode(A81) :: Nil))(k81).reads(j) :: Reads.at(JsPath(KeyPathNode(A82) :: Nil))(k82).reads(j) :: Reads.at(JsPath(KeyPathNode(A83) :: Nil))(k83).reads(j) :: Reads.at(JsPath(KeyPathNode(A84) :: Nil))(k84).reads(j) :: Reads.at(JsPath(KeyPathNode(A85) :: Nil))(k85).reads(j) :: Reads.at(JsPath(KeyPathNode(A86) :: Nil))(k86).reads(j) :: Reads.at(JsPath(KeyPathNode(A87) :: Nil))(k87).reads(j) :: Reads.at(JsPath(KeyPathNode(A88) :: Nil))(k88).reads(j) :: Reads.at(JsPath(KeyPathNode(A89) :: Nil))(k89).reads(j) :: Reads.at(JsPath(KeyPathNode(A90) :: Nil))(k90).reads(j) :: Reads.at(JsPath(KeyPathNode(A91) :: Nil))(k91).reads(j) :: Reads.at(JsPath(KeyPathNode(A92) :: Nil))(k92).reads(j) :: Reads.at(JsPath(KeyPathNode(A93) :: Nil))(k93).reads(j) :: Reads.at(JsPath(KeyPathNode(A94) :: Nil))(k94).reads(j) :: Reads.at(JsPath(KeyPathNode(A95) :: Nil))(k95).reads(j) :: Reads.at(JsPath(KeyPathNode(A96) :: Nil))(k96).reads(j) :: Reads.at(JsPath(KeyPathNode(A97) :: Nil))(k97).reads(j) :: Reads.at(JsPath(KeyPathNode(A98) :: Nil))(k98).reads(j) :: Reads.at(JsPath(KeyPathNode(A99) :: Nil))(k99).reads(j) :: Reads.at(JsPath(KeyPathNode(A100) :: Nil))(k100).reads(j) :: Reads.at(JsPath(KeyPathNode(A101) :: Nil))(k101).reads(j) :: Reads.at(JsPath(KeyPathNode(A102) :: Nil))(k102).reads(j) :: Reads.at(JsPath(KeyPathNode(A103) :: Nil))(k103).reads(j) :: Reads.at(JsPath(KeyPathNode(A104) :: Nil))(k104).reads(j) :: Reads.at(JsPath(KeyPathNode(A105) :: Nil))(k105).reads(j) :: Reads.at(JsPath(KeyPathNode(A106) :: Nil))(k106).reads(j) :: Reads.at(JsPath(KeyPathNode(A107) :: Nil))(k107).reads(j) :: Reads.at(JsPath(KeyPathNode(A108) :: Nil))(k108).reads(j) :: Reads.at(JsPath(KeyPathNode(A109) :: Nil))(k109).reads(j) :: Reads.at(JsPath(KeyPathNode(A110) :: Nil))(k110).reads(j) :: Reads.at(JsPath(KeyPathNode(A111) :: Nil))(k111).reads(j) :: Reads.at(JsPath(KeyPathNode(A112) :: Nil))(k112).reads(j) :: Reads.at(JsPath(KeyPathNode(A113) :: Nil))(k113).reads(j) :: Reads.at(JsPath(KeyPathNode(A114) :: Nil))(k114).reads(j) :: Reads.at(JsPath(KeyPathNode(A115) :: Nil))(k115).reads(j) :: Reads.at(JsPath(KeyPathNode(A116) :: Nil))(k116).reads(j) :: Reads.at(JsPath(KeyPathNode(A117) :: Nil))(k117).reads(j) :: Reads.at(JsPath(KeyPathNode(A118) :: Nil))(k118).reads(j) :: Reads.at(JsPath(KeyPathNode(A119) :: Nil))(k119).reads(j) :: Reads.at(JsPath(KeyPathNode(A120) :: Nil))(k120).reads(j) :: Reads.at(JsPath(KeyPathNode(A121) :: Nil))(k121).reads(j) :: Reads.at(JsPath(KeyPathNode(A122) :: Nil))(k122).reads(j) :: Reads.at(JsPath(KeyPathNode(A123) :: Nil))(k123).reads(j) :: Reads.at(JsPath(KeyPathNode(A124) :: Nil))(k124).reads(j) :: Reads.at(JsPath(KeyPathNode(A125) :: Nil))(k125).reads(j) :: Reads.at(JsPath(KeyPathNode(A126) :: Nil))(k126).reads(j) :: Reads.at(JsPath(KeyPathNode(A127) :: Nil))(k127).reads(j) :: Reads.at(JsPath(KeyPathNode(A128) :: Nil))(k128).reads(j) :: Reads.at(JsPath(KeyPathNode(A129) :: Nil))(k129).reads(j) :: Reads.at(JsPath(KeyPathNode(A130) :: Nil))(k130).reads(j) :: Reads.at(JsPath(KeyPathNode(A131) :: Nil))(k131).reads(j) :: Reads.at(JsPath(KeyPathNode(A132) :: Nil))(k132).reads(j) :: Reads.at(JsPath(KeyPathNode(A133) :: Nil))(k133).reads(j) :: Reads.at(JsPath(KeyPathNode(A134) :: Nil))(k134).reads(j) :: Reads.at(JsPath(KeyPathNode(A135) :: Nil))(k135).reads(j) :: Reads.at(JsPath(KeyPathNode(A136) :: Nil))(k136).reads(j) :: Reads.at(JsPath(KeyPathNode(A137) :: Nil))(k137).reads(j) :: Reads.at(JsPath(KeyPathNode(A138) :: Nil))(k138).reads(j) :: Reads.at(JsPath(KeyPathNode(A139) :: Nil))(k139).reads(j) :: Reads.at(JsPath(KeyPathNode(A140) :: Nil))(k140).reads(j) :: Reads.at(JsPath(KeyPathNode(A141) :: Nil))(k141).reads(j) :: Reads.at(JsPath(KeyPathNode(A142) :: Nil))(k142).reads(j) :: Reads.at(JsPath(KeyPathNode(A143) :: Nil))(k143).reads(j) :: Reads.at(JsPath(KeyPathNode(A144) :: Nil))(k144).reads(j) :: Reads.at(JsPath(KeyPathNode(A145) :: Nil))(k145).reads(j) :: Reads.at(JsPath(KeyPathNode(A146) :: Nil))(k146).reads(j) :: Reads.at(JsPath(KeyPathNode(A147) :: Nil))(k147).reads(j) :: Reads.at(JsPath(KeyPathNode(A148) :: Nil))(k148).reads(j) :: Reads.at(JsPath(KeyPathNode(A149) :: Nil))(k149).reads(j) :: Reads.at(JsPath(KeyPathNode(A150) :: Nil))(k150).reads(j) :: Reads.at(JsPath(KeyPathNode(A151) :: Nil))(k151).reads(j) :: Reads.at(JsPath(KeyPathNode(A152) :: Nil))(k152).reads(j) :: Reads.at(JsPath(KeyPathNode(A153) :: Nil))(k153).reads(j) :: Reads.at(JsPath(KeyPathNode(A154) :: Nil))(k154).reads(j) :: Reads.at(JsPath(KeyPathNode(A155) :: Nil))(k155).reads(j) :: Reads.at(JsPath(KeyPathNode(A156) :: Nil))(k156).reads(j) :: Reads.at(JsPath(KeyPathNode(A157) :: Nil))(k157).reads(j) :: Reads.at(JsPath(KeyPathNode(A158) :: Nil))(k158).reads(j) :: Reads.at(JsPath(KeyPathNode(A159) :: Nil))(k159).reads(j) :: Reads.at(JsPath(KeyPathNode(A160) :: Nil))(k160).reads(j) :: Reads.at(JsPath(KeyPathNode(A161) :: Nil))(k161).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: k36 :: k37 :: k38 :: k39 :: k40 :: k41 :: k42 :: k43 :: k44 :: k45 :: k46 :: k47 :: k48 :: k49 :: k50 :: k51 :: k52 :: k53 :: k54 :: k55 :: k56 :: k57 :: k58 :: k59 :: k60 :: k61 :: k62 :: k63 :: k64 :: k65 :: k66 :: k67 :: k68 :: k69 :: k70 :: k71 :: k72 :: k73 :: k74 :: k75 :: k76 :: k77 :: k78 :: k79 :: k80 :: k81 :: k82 :: k83 :: k84 :: k85 :: k86 :: k87 :: k88 :: k89 :: k90 :: k91 :: k92 :: k93 :: k94 :: k95 :: k96 :: k97 :: k98 :: k99 :: k100 :: k101 :: k102 :: k103 :: k104 :: k105 :: k106 :: k107 :: k108 :: k109 :: k110 :: k111 :: k112 :: k113 :: k114 :: k115 :: k116 :: k117 :: k118 :: k119 :: k120 :: k121 :: k122 :: k123 :: k124 :: k125 :: k126 :: k127 :: k128 :: k129 :: k130 :: k131 :: k132 :: k133 :: k134 :: k135 :: k136 :: k137 :: k138 :: k139 :: k140 :: k141 :: k142 :: k143 :: k144 :: k145 :: k146 :: k147 :: k148 :: k149 :: k150 :: k151 :: k152 :: k153 :: k154 :: k155 :: k156 :: k157 :: k158 :: k159 :: k160 :: k161 :: HNil })(implicit k1: Writes[k1], k2: Writes[k2], k3: Writes[k3], k4: Writes[k4], k5: Writes[k5], k6: Writes[k6], k7: Writes[k7], k8: Writes[k8], k9: Writes[k9], k10: Writes[k10], k11: Writes[k11], k12: Writes[k12], k13: Writes[k13], k14: Writes[k14], k15: Writes[k15], k16: Writes[k16], k17: Writes[k17], k18: Writes[k18], k19: Writes[k19], k20: Writes[k20], k21: Writes[k21], k22: Writes[k22], k23: Writes[k23], k24: Writes[k24], k25: Writes[k25], k26: Writes[k26], k27: Writes[k27], k28: Writes[k28], k29: Writes[k29], k30: Writes[k30], k31: Writes[k31], k32: Writes[k32], k33: Writes[k33], k34: Writes[k34], k35: Writes[k35], k36: Writes[k36], k37: Writes[k37], k38: Writes[k38], k39: Writes[k39], k40: Writes[k40], k41: Writes[k41], k42: Writes[k42], k43: Writes[k43], k44: Writes[k44], k45: Writes[k45], k46: Writes[k46], k47: Writes[k47], k48: Writes[k48], k49: Writes[k49], k50: Writes[k50], k51: Writes[k51], k52: Writes[k52], k53: Writes[k53], k54: Writes[k54], k55: Writes[k55], k56: Writes[k56], k57: Writes[k57], k58: Writes[k58], k59: Writes[k59], k60: Writes[k60], k61: Writes[k61], k62: Writes[k62], k63: Writes[k63], k64: Writes[k64], k65: Writes[k65], k66: Writes[k66], k67: Writes[k67], k68: Writes[k68], k69: Writes[k69], k70: Writes[k70], k71: Writes[k71], k72: Writes[k72], k73: Writes[k73], k74: Writes[k74], k75: Writes[k75], k76: Writes[k76], k77: Writes[k77], k78: Writes[k78], k79: Writes[k79], k80: Writes[k80], k81: Writes[k81], k82: Writes[k82], k83: Writes[k83], k84: Writes[k84], k85: Writes[k85], k86: Writes[k86], k87: Writes[k87], k88: Writes[k88], k89: Writes[k89], k90: Writes[k90], k91: Writes[k91], k92: Writes[k92], k93: Writes[k93], k94: Writes[k94], k95: Writes[k95], k96: Writes[k96], k97: Writes[k97], k98: Writes[k98], k99: Writes[k99], k100: Writes[k100], k101: Writes[k101], k102: Writes[k102], k103: Writes[k103], k104: Writes[k104], k105: Writes[k105], k106: Writes[k106], k107: Writes[k107], k108: Writes[k108], k109: Writes[k109], k110: Writes[k110], k111: Writes[k111], k112: Writes[k112], k113: Writes[k113], k114: Writes[k114], k115: Writes[k115], k116: Writes[k116], k117: Writes[k117], k118: Writes[k118], k119: Writes[k119], k120: Writes[k120], k121: Writes[k121], k122: Writes[k122], k123: Writes[k123], k124: Writes[k124], k125: Writes[k125], k126: Writes[k126], k127: Writes[k127], k128: Writes[k128], k129: Writes[k129], k130: Writes[k130], k131: Writes[k131], k132: Writes[k132], k133: Writes[k133], k134: Writes[k134], k135: Writes[k135], k136: Writes[k136], k137: Writes[k137], k138: Writes[k138], k139: Writes[k139], k140: Writes[k140], k141: Writes[k141], k142: Writes[k142], k143: Writes[k143], k144: Writes[k144], k145: Writes[k145], k146: Writes[k146], k147: Writes[k147], k148: Writes[k148], k149: Writes[k149], k150: Writes[k150], k151: Writes[k151], k152: Writes[k152], k153: Writes[k153], k154: Writes[k154], k155: Writes[k155], k156: Writes[k156], k157: Writes[k157], k158: Writes[k158], k159: Writes[k159], k160: Writes[k160], k161: Writes[k161]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        val _1 = _0.tail; val _2 = _1.tail; val _3 = _2.tail; val _4 = _3.tail; val _5 = _4.tail; val _6 = _5.tail; val _7 = _6.tail; val _8 = _7.tail; val _9 = _8.tail; val _10 = _9.tail; val _11 = _10.tail; val _12 = _11.tail; val _13 = _12.tail; val _14 = _13.tail; val _15 = _14.tail; val _16 = _15.tail; val _17 = _16.tail; val _18 = _17.tail; val _19 = _18.tail; val _20 = _19.tail; val _21 = _20.tail; val _22 = _21.tail; val _23 = _22.tail; val _24 = _23.tail; val _25 = _24.tail; val _26 = _25.tail; val _27 = _26.tail; val _28 = _27.tail; val _29 = _28.tail; val _30 = _29.tail; val _31 = _30.tail; val _32 = _31.tail; val _33 = _32.tail; val _34 = _33.tail; val _35 = _34.tail; val _36 = _35.tail; val _37 = _36.tail; val _38 = _37.tail; val _39 = _38.tail; val _40 = _39.tail; val _41 = _40.tail; val _42 = _41.tail; val _43 = _42.tail; val _44 = _43.tail; val _45 = _44.tail; val _46 = _45.tail; val _47 = _46.tail; val _48 = _47.tail; val _49 = _48.tail; val _50 = _49.tail; val _51 = _50.tail; val _52 = _51.tail; val _53 = _52.tail; val _54 = _53.tail; val _55 = _54.tail; val _56 = _55.tail; val _57 = _56.tail; val _58 = _57.tail; val _59 = _58.tail; val _60 = _59.tail; val _61 = _60.tail; val _62 = _61.tail; val _63 = _62.tail; val _64 = _63.tail; val _65 = _64.tail; val _66 = _65.tail; val _67 = _66.tail; val _68 = _67.tail; val _69 = _68.tail; val _70 = _69.tail; val _71 = _70.tail; val _72 = _71.tail; val _73 = _72.tail; val _74 = _73.tail; val _75 = _74.tail; val _76 = _75.tail; val _77 = _76.tail; val _78 = _77.tail; val _79 = _78.tail; val _80 = _79.tail; val _81 = _80.tail; val _82 = _81.tail; val _83 = _82.tail; val _84 = _83.tail; val _85 = _84.tail; val _86 = _85.tail; val _87 = _86.tail; val _88 = _87.tail; val _89 = _88.tail; val _90 = _89.tail; val _91 = _90.tail; val _92 = _91.tail; val _93 = _92.tail; val _94 = _93.tail; val _95 = _94.tail; val _96 = _95.tail; val _97 = _96.tail; val _98 = _97.tail; val _99 = _98.tail; val _100 = _99.tail; val _101 = _100.tail; val _102 = _101.tail; val _103 = _102.tail; val _104 = _103.tail; val _105 = _104.tail; val _106 = _105.tail; val _107 = _106.tail; val _108 = _107.tail; val _109 = _108.tail; val _110 = _109.tail; val _111 = _110.tail; val _112 = _111.tail; val _113 = _112.tail; val _114 = _113.tail; val _115 = _114.tail; val _116 = _115.tail; val _117 = _116.tail; val _118 = _117.tail; val _119 = _118.tail; val _120 = _119.tail; val _121 = _120.tail; val _122 = _121.tail; val _123 = _122.tail; val _124 = _123.tail; val _125 = _124.tail; val _126 = _125.tail; val _127 = _126.tail; val _128 = _127.tail; val _129 = _128.tail; val _130 = _129.tail; val _131 = _130.tail; val _132 = _131.tail; val _133 = _132.tail; val _134 = _133.tail; val _135 = _134.tail; val _136 = _135.tail; val _137 = _136.tail; val _138 = _137.tail; val _139 = _138.tail; val _140 = _139.tail; val _141 = _140.tail; val _142 = _141.tail; val _143 = _142.tail; val _144 = _143.tail; val _145 = _144.tail; val _146 = _145.tail; val _147 = _146.tail; val _148 = _147.tail; val _149 = _148.tail; val _150 = _149.tail; val _151 = _150.tail; val _152 = _151.tail; val _153 = _152.tail; val _154 = _153.tail; val _155 = _154.tail; val _156 = _155.tail; val _157 = _156.tail; val _158 = _157.tail; val _159 = _158.tail; val _160 = _159.tail
        JsObject(Nil.::((A161,k161.writes(_160.head))).::((A160,k160.writes(_159.head))).::((A159,k159.writes(_158.head))).::((A158,k158.writes(_157.head))).::((A157,k157.writes(_156.head))).::((A156,k156.writes(_155.head))).::((A155,k155.writes(_154.head))).::((A154,k154.writes(_153.head))).::((A153,k153.writes(_152.head))).::((A152,k152.writes(_151.head))).::((A151,k151.writes(_150.head))).::((A150,k150.writes(_149.head))).::((A149,k149.writes(_148.head))).::((A148,k148.writes(_147.head))).::((A147,k147.writes(_146.head))).::((A146,k146.writes(_145.head))).::((A145,k145.writes(_144.head))).::((A144,k144.writes(_143.head))).::((A143,k143.writes(_142.head))).::((A142,k142.writes(_141.head))).::((A141,k141.writes(_140.head))).::((A140,k140.writes(_139.head))).::((A139,k139.writes(_138.head))).::((A138,k138.writes(_137.head))).::((A137,k137.writes(_136.head))).::((A136,k136.writes(_135.head))).::((A135,k135.writes(_134.head))).::((A134,k134.writes(_133.head))).::((A133,k133.writes(_132.head))).::((A132,k132.writes(_131.head))).::((A131,k131.writes(_130.head))).::((A130,k130.writes(_129.head))).::((A129,k129.writes(_128.head))).::((A128,k128.writes(_127.head))).::((A127,k127.writes(_126.head))).::((A126,k126.writes(_125.head))).::((A125,k125.writes(_124.head))).::((A124,k124.writes(_123.head))).::((A123,k123.writes(_122.head))).::((A122,k122.writes(_121.head))).::((A121,k121.writes(_120.head))).::((A120,k120.writes(_119.head))).::((A119,k119.writes(_118.head))).::((A118,k118.writes(_117.head))).::((A117,k117.writes(_116.head))).::((A116,k116.writes(_115.head))).::((A115,k115.writes(_114.head))).::((A114,k114.writes(_113.head))).::((A113,k113.writes(_112.head))).::((A112,k112.writes(_111.head))).::((A111,k111.writes(_110.head))).::((A110,k110.writes(_109.head))).::((A109,k109.writes(_108.head))).::((A108,k108.writes(_107.head))).::((A107,k107.writes(_106.head))).::((A106,k106.writes(_105.head))).::((A105,k105.writes(_104.head))).::((A104,k104.writes(_103.head))).::((A103,k103.writes(_102.head))).::((A102,k102.writes(_101.head))).::((A101,k101.writes(_100.head))).::((A100,k100.writes(_99.head))).::((A99,k99.writes(_98.head))).::((A98,k98.writes(_97.head))).::((A97,k97.writes(_96.head))).::((A96,k96.writes(_95.head))).::((A95,k95.writes(_94.head))).::((A94,k94.writes(_93.head))).::((A93,k93.writes(_92.head))).::((A92,k92.writes(_91.head))).::((A91,k91.writes(_90.head))).::((A90,k90.writes(_89.head))).::((A89,k89.writes(_88.head))).::((A88,k88.writes(_87.head))).::((A87,k87.writes(_86.head))).::((A86,k86.writes(_85.head))).::((A85,k85.writes(_84.head))).::((A84,k84.writes(_83.head))).::((A83,k83.writes(_82.head))).::((A82,k82.writes(_81.head))).::((A81,k81.writes(_80.head))).::((A80,k80.writes(_79.head))).::((A79,k79.writes(_78.head))).::((A78,k78.writes(_77.head))).::((A77,k77.writes(_76.head))).::((A76,k76.writes(_75.head))).::((A75,k75.writes(_74.head))).::((A74,k74.writes(_73.head))).::((A73,k73.writes(_72.head))).::((A72,k72.writes(_71.head))).::((A71,k71.writes(_70.head))).::((A70,k70.writes(_69.head))).::((A69,k69.writes(_68.head))).::((A68,k68.writes(_67.head))).::((A67,k67.writes(_66.head))).::((A66,k66.writes(_65.head))).::((A65,k65.writes(_64.head))).::((A64,k64.writes(_63.head))).::((A63,k63.writes(_62.head))).::((A62,k62.writes(_61.head))).::((A61,k61.writes(_60.head))).::((A60,k60.writes(_59.head))).::((A59,k59.writes(_58.head))).::((A58,k58.writes(_57.head))).::((A57,k57.writes(_56.head))).::((A56,k56.writes(_55.head))).::((A55,k55.writes(_54.head))).::((A54,k54.writes(_53.head))).::((A53,k53.writes(_52.head))).::((A52,k52.writes(_51.head))).::((A51,k51.writes(_50.head))).::((A50,k50.writes(_49.head))).::((A49,k49.writes(_48.head))).::((A48,k48.writes(_47.head))).::((A47,k47.writes(_46.head))).::((A46,k46.writes(_45.head))).::((A45,k45.writes(_44.head))).::((A44,k44.writes(_43.head))).::((A43,k43.writes(_42.head))).::((A42,k42.writes(_41.head))).::((A41,k41.writes(_40.head))).::((A40,k40.writes(_39.head))).::((A39,k39.writes(_38.head))).::((A38,k38.writes(_37.head))).::((A37,k37.writes(_36.head))).::((A36,k36.writes(_35.head))).::((A35,k35.writes(_34.head))).::((A34,k34.writes(_33.head))).::((A33,k33.writes(_32.head))).::((A32,k32.writes(_31.head))).::((A31,k31.writes(_30.head))).::((A30,k30.writes(_29.head))).::((A29,k29.writes(_28.head))).::((A28,k28.writes(_27.head))).::((A27,k27.writes(_26.head))).::((A26,k26.writes(_25.head))).::((A25,k25.writes(_24.head))).::((A24,k24.writes(_23.head))).::((A23,k23.writes(_22.head))).::((A22,k22.writes(_21.head))).::((A21,k21.writes(_20.head))).::((A20,k20.writes(_19.head))).::((A19,k19.writes(_18.head))).::((A18,k18.writes(_17.head))).::((A17,k17.writes(_16.head))).::((A16,k16.writes(_15.head))).::((A15,k15.writes(_14.head))).::((A14,k14.writes(_13.head))).::((A13,k13.writes(_12.head))).::((A12,k12.writes(_11.head))).::((A11,k11.writes(_10.head))).::((A10,k10.writes(_9.head))).::((A9,k9.writes(_8.head))).::((A8,k8.writes(_7.head))).::((A7,k7.writes(_6.head))).::((A6,k6.writes(_5.head))).::((A5,k5.writes(_4.head))).::((A4,k4.writes(_3.head))).::((A3,k3.writes(_2.head))).::((A2,k2.writes(_1.head))).::((A1,k1.writes(_0.head))))
      }


    def format[k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161, Z](f: Generic[Z]{ type Repr = k1 :: k2 :: k3 :: k4 :: k5 :: k6 :: k7 :: k8 :: k9 :: k10 :: k11 :: k12 :: k13 :: k14 :: k15 :: k16 :: k17 :: k18 :: k19 :: k20 :: k21 :: k22 :: k23 :: k24 :: k25 :: k26 :: k27 :: k28 :: k29 :: k30 :: k31 :: k32 :: k33 :: k34 :: k35 :: k36 :: k37 :: k38 :: k39 :: k40 :: k41 :: k42 :: k43 :: k44 :: k45 :: k46 :: k47 :: k48 :: k49 :: k50 :: k51 :: k52 :: k53 :: k54 :: k55 :: k56 :: k57 :: k58 :: k59 :: k60 :: k61 :: k62 :: k63 :: k64 :: k65 :: k66 :: k67 :: k68 :: k69 :: k70 :: k71 :: k72 :: k73 :: k74 :: k75 :: k76 :: k77 :: k78 :: k79 :: k80 :: k81 :: k82 :: k83 :: k84 :: k85 :: k86 :: k87 :: k88 :: k89 :: k90 :: k91 :: k92 :: k93 :: k94 :: k95 :: k96 :: k97 :: k98 :: k99 :: k100 :: k101 :: k102 :: k103 :: k104 :: k105 :: k106 :: k107 :: k108 :: k109 :: k110 :: k111 :: k112 :: k113 :: k114 :: k115 :: k116 :: k117 :: k118 :: k119 :: k120 :: k121 :: k122 :: k123 :: k124 :: k125 :: k126 :: k127 :: k128 :: k129 :: k130 :: k131 :: k132 :: k133 :: k134 :: k135 :: k136 :: k137 :: k138 :: k139 :: k140 :: k141 :: k142 :: k143 :: k144 :: k145 :: k146 :: k147 :: k148 :: k149 :: k150 :: k151 :: k152 :: k153 :: k154 :: k155 :: k156 :: k157 :: k158 :: k159 :: k160 :: k161 :: HNil })(implicit k1: Format[k1], k2: Format[k2], k3: Format[k3], k4: Format[k4], k5: Format[k5], k6: Format[k6], k7: Format[k7], k8: Format[k8], k9: Format[k9], k10: Format[k10], k11: Format[k11], k12: Format[k12], k13: Format[k13], k14: Format[k14], k15: Format[k15], k16: Format[k16], k17: Format[k17], k18: Format[k18], k19: Format[k19], k20: Format[k20], k21: Format[k21], k22: Format[k22], k23: Format[k23], k24: Format[k24], k25: Format[k25], k26: Format[k26], k27: Format[k27], k28: Format[k28], k29: Format[k29], k30: Format[k30], k31: Format[k31], k32: Format[k32], k33: Format[k33], k34: Format[k34], k35: Format[k35], k36: Format[k36], k37: Format[k37], k38: Format[k38], k39: Format[k39], k40: Format[k40], k41: Format[k41], k42: Format[k42], k43: Format[k43], k44: Format[k44], k45: Format[k45], k46: Format[k46], k47: Format[k47], k48: Format[k48], k49: Format[k49], k50: Format[k50], k51: Format[k51], k52: Format[k52], k53: Format[k53], k54: Format[k54], k55: Format[k55], k56: Format[k56], k57: Format[k57], k58: Format[k58], k59: Format[k59], k60: Format[k60], k61: Format[k61], k62: Format[k62], k63: Format[k63], k64: Format[k64], k65: Format[k65], k66: Format[k66], k67: Format[k67], k68: Format[k68], k69: Format[k69], k70: Format[k70], k71: Format[k71], k72: Format[k72], k73: Format[k73], k74: Format[k74], k75: Format[k75], k76: Format[k76], k77: Format[k77], k78: Format[k78], k79: Format[k79], k80: Format[k80], k81: Format[k81], k82: Format[k82], k83: Format[k83], k84: Format[k84], k85: Format[k85], k86: Format[k86], k87: Format[k87], k88: Format[k88], k89: Format[k89], k90: Format[k90], k91: Format[k91], k92: Format[k92], k93: Format[k93], k94: Format[k94], k95: Format[k95], k96: Format[k96], k97: Format[k97], k98: Format[k98], k99: Format[k99], k100: Format[k100], k101: Format[k101], k102: Format[k102], k103: Format[k103], k104: Format[k104], k105: Format[k105], k106: Format[k106], k107: Format[k107], k108: Format[k108], k109: Format[k109], k110: Format[k110], k111: Format[k111], k112: Format[k112], k113: Format[k113], k114: Format[k114], k115: Format[k115], k116: Format[k116], k117: Format[k117], k118: Format[k118], k119: Format[k119], k120: Format[k120], k121: Format[k121], k122: Format[k122], k123: Format[k123], k124: Format[k124], k125: Format[k125], k126: Format[k126], k127: Format[k127], k128: Format[k128], k129: Format[k129], k130: Format[k130], k131: Format[k131], k132: Format[k132], k133: Format[k133], k134: Format[k134], k135: Format[k135], k136: Format[k136], k137: Format[k137], k138: Format[k138], k139: Format[k139], k140: Format[k140], k141: Format[k141], k142: Format[k142], k143: Format[k143], k144: Format[k144], k145: Format[k145], k146: Format[k146], k147: Format[k147], k148: Format[k148], k149: Format[k149], k150: Format[k150], k151: Format[k151], k152: Format[k152], k153: Format[k153], k154: Format[k154], k155: Format[k155], k156: Format[k156], k157: Format[k157], k158: Format[k158], k159: Format[k159], k160: Format[k160], k161: Format[k161]): OFormat[Z] =
      OFormat(
        reads(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161),
        writes(f)(k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39, k40, k41, k42, k43, k44, k45, k46, k47, k48, k49, k50, k51, k52, k53, k54, k55, k56, k57, k58, k59, k60, k61, k62, k63, k64, k65, k66, k67, k68, k69, k70, k71, k72, k73, k74, k75, k76, k77, k78, k79, k80, k81, k82, k83, k84, k85, k86, k87, k88, k89, k90, k91, k92, k93, k94, k95, k96, k97, k98, k99, k100, k101, k102, k103, k104, k105, k106, k107, k108, k109, k110, k111, k112, k113, k114, k115, k116, k117, k118, k119, k120, k121, k122, k123, k124, k125, k126, k127, k128, k129, k130, k131, k132, k133, k134, k135, k136, k137, k138, k139, k140, k141, k142, k143, k144, k145, k146, k147, k148, k149, k150, k151, k152, k153, k154, k155, k156, k157, k158, k159, k160, k161)
      )
  }
