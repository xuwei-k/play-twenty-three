package com.example

import shapeless.Generic
import play.api.libs.json._

final case class Foo(
  _01: String,
  _02: List[Int],
  _03: Int,
  _04: Long,
  _05: Int,
  _06: Boolean,
  _07: String,
  _08: Int,
  _09: Int,
  _10: List[Int],
  _11: Int,
  _12: Long,
  _13: Int,
  _14: Boolean,
  _15: String,
  _16: Int,
  _17: Int,
  _18: Int,
  _19: List[Int],
  _20: Boolean,
  _21: Int,
  _22: String,
  _23: Int,
  _24: Int,
  _25: Long
)

object Foo {

  implicit val instance: Format[Foo] =
    play.twentythree.PlayJson.apply25(
      "_01",
      "_02",
      "_03",
      "_04",
      "_05",
      "_06",
      "_07",
      "_08",
      "_09",
      "_10",
      "_11",
      "_12",
      "_13",
      "_14",
      "_15",
      "_16",
      "_17",
      "_18",
      "_19",
      "_20",
      "_21",
      "_22",
      "_23",
      "_24",
      "_25"
    ).format(Generic[Foo])

}
