package play.twentythree

import play.api.libs.json.{JsPath, Format, Reads, Writes, OFormat, OWrites, JsResult, KeyPathNode, JsObject}
import shapeless.{HNil, HList, ::, Generic}
import PlayJson._
import Sequencer._


  final case class Builder1 (A1: String) {
    def reads[k1, Z](f: Generic[Z]{ type Repr = k1 :: HNil })(implicit k1: Reads[k1]): Reads[Z] =
      Reads[Z]( j =>
        sequence1[k1](Reads.at(JsPath(KeyPathNode(A1) :: Nil))(k1).reads(j) :: HNil).map(f.from)
      )


    def writes[k1, Z](f: Generic[Z]{ type Repr = k1 :: HNil })(implicit k1: Writes[k1]): OWrites[Z] =
      OWrites[Z]{ z =>
        val _0 = f.to(z)
        
        JsObject(Nil.::((A1,k1.writes(_0.head))))
      }


    def format[k1, Z](f: Generic[Z]{ type Repr = k1 :: HNil })(implicit k1: Format[k1]): OFormat[Z] =
      OFormat(
        reads(f)(k1),
        writes(f)(k1)
      )
  }
