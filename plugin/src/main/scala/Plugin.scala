package play.twentythree

import sbt._, Keys._

object Plugin extends sbt.Plugin {
  object TwentyThreeKeys {
    val twentyThreeSetting = TaskKey[Settings]("twentyThreeSetting")
    val twentyThreeGen = TaskKey[Map[FileName, String]]("twentyThreeGen")
    val twentyThreeShapeless = SettingKey[String]("twentyThreeShapelessVersion")
    val twentyThreePlay = SettingKey[String]("twentyThreePlayVersion")
  }

  type FileName = String

  import TwentyThreeKeys._

  val twentyThreeWithoutDependencies: Seq[Def.Setting[_]] = Seq(
    twentyThreeGen := twentyThreeGen.?.value.getOrElse{
      val setting = twentyThreeSetting.value
      Map(
        setting.objectName + ".scala" -> Generate.code(setting),
        "Sequencer.scala" -> GenSequencer.gen(setting.packageName)
      )
    },
    (sourceGenerators in Compile) <+= (twentyThreeGen, (sourceManaged in Compile)).map{
      case (sources, dir) =>
        sources.map{ case (fileName, code) =>
          val f = dir / fileName
          IO.write(f, code)
          f
        }.toSeq
    }
  )

  val twentyThreeSettings: Seq[Def.Setting[_]] = Seq(
    twentyThreePlay := twentyThreePlay.?.value.getOrElse("2.4.4"),
    twentyThreeShapeless := twentyThreeShapeless.?.value.getOrElse("2.2.5"),
    libraryDependencies ++= (
      ("com.typesafe.play" %% "play-json" % twentyThreePlay.value) ::
      ("com.chuusai" %% "shapeless" % twentyThreeShapeless.value) ::
      Nil
    )
  ) ++ twentyThreeWithoutDependencies
}
