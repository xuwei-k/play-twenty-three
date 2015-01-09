import sbt._, Keys._
import sbtrelease.ReleasePlugin
import sbtbuildinfo.Plugin._
import xerial.sbt.Sonatype._
import com.typesafe.sbt.pgp.PgpKeys

object build extends Build {
  private def heartbeat = new Thread{
    override def run(): Unit = {
      if(sys.BooleanProp.valueIsTrue("heartbeat")){
        var i = 0
        while(true){
          println(i)
          i += 1
          Thread.sleep(60000)
        }
      }
    }
  }

  private val generateSources = taskKey[Unit]("generate main source files")
  private val generatedSourceDirBase = scalaSource in Compile in LocalProject(coreProjectId)
  private val generatedSourceDir = "generated"
  private val cleanSrc = taskKey[Unit]("clean generated sources")
  private final val coreProjectId = "play-twenty-three"
  private val checkGenerate = taskKey[Unit]("check generate")

  def gitHash: String = scala.util.Try(
    sys.process.Process("git rev-parse HEAD").lines_!.head
  ).getOrElse("master")

  private val commonSettings = ReleasePlugin.releaseSettings ++ ReleasePlugin.extraReleaseCommands ++ sonatypeSettings ++ buildInfoSettings ++ Seq(
    description := "generate over twenty three case classes play-json Reads/Writes/Format",
    buildInfoPackage := "play.twentythree",
    buildInfoKeys := Seq[BuildInfoKey](
      organization,
      name,
      version,
      scalaVersion,
      sbtVersion,
      scalacOptions,
      licenses
    ),
    scalacOptions ++= (
      "-language:postfixOps" ::
      "-language:implicitConversions" ::
      "-language:higherKinds" ::
      "-language:existentials" ::
      "-deprecation" ::
      "-unchecked" ::
      "-Xlint" ::
      Nil
    ),
    scalacOptions ++= (
      if (scalaVersion.value.startsWith("2.11")) {
        "-Ywarn-unused" ::
        "-Ywarn-unused-import" ::
        Nil
      } else Nil
    ),
    organization := "com.github.xuwei-k",
    licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php")),
    homepage := Some(url("https://github.com/xuwei-k/play-twenty-three")),
      credentials ++= PartialFunction.condOpt(sys.env.get("SONATYPE_USER") -> sys.env.get("SONATYPE_PASS")){
      case (Some(user), Some(pass)) =>
        Credentials("Sonatype Nexus Repository Manager", "oss.sonatype.org", user, pass)
    }.toList,
    scalacOptions in (Compile, doc) ++= {
      val tag = if(isSnapshot.value) gitHash else { "v" + version.value }
      Seq(
        "-sourcepath", (baseDirectory in LocalRootProject).value.getAbsolutePath,
        "-doc-source-url", s"https://github.com/xuwei-k/play-twenty-three/tree/${tag}€{FILE_PATH}.scala"
      )
    },
    scalacOptions ++= (
      "-Yrecursion" ::
      "256" ::
      Nil
    ),
    pomPostProcess := { node =>
      import scala.xml._
      import scala.xml.transform._
      def stripIf(f: Node => Boolean) = new RewriteRule {
        override def transform(n: Node) =
          if (f(n)) NodeSeq.Empty else n
      }
      val stripTestScope = stripIf { n => n.label == "dependency" && (n \ "scope").text == "test" }
      new RuleTransformer(stripTestScope).transform(node)(0)
    },
    commands += Command.command(updateReadmeCommand)(updateReadme),
    commands += Command.command("releaseBefore"){ state =>
      "release-check-snapshot-dependencies" ::
      "release-inquire-versions" ::
      "release-set-release-version" ::
      "release-commit-release-version" ::
      updateReadmeCommand ::
      "release-tag-release" ::
      state
    },
    commands += Command.command("releaseAfter"){ state =>
      "release-set-next-version" ::
      "release-commit-next-version" ::
      updateReadmeCommand ::
      state
    },
    pomExtra := (
      <developers>
        <developer>
          <id>xuwei-k</id>
          <name>Kenji Yoshida</name>
          <url>https://github.com/xuwei-k</url>
        </developer>
      </developers>
      <scm>
        <url>git@github.com:xuwei-k/play-twenty-three.git</url>
        <connection>scm:git:git@github.com:xuwei-k/play-twenty-three.git</connection>
        <tag>{if(isSnapshot.value) gitHash else { "v" + version.value }}</tag>
      </scm>
    )
  )

  private final val pluginModuleName = "play-twenty-three-plugin"
  private final val generatorModuleName = "play-twenty-three-generator"
  private final val mainModuleName = "play-twenty-three"

  final val updateReadmeCommand = "updateReadme"
  lazy val updateReadme = { state: State =>
    val extracted = Project.extract(state)
    val scalaV = extracted get scalaBinaryVersion
    val v = extracted get version
    val org =  extracted get organization
    val modules = List(pluginModuleName, generatorModuleName, mainModuleName)
    val snapshotOrRelease = if(extracted get isSnapshot) "snapshots" else "releases"
    val readme = "README.md"
    val readmeFile = file(readme)
    val newReadme = Predef.augmentString(IO.read(readmeFile)).lines.map{ line =>
      val matchReleaseOrSnapshot = line.contains("SNAPSHOT") == v.contains("SNAPSHOT")
      if(matchReleaseOrSnapshot){
        lazy val m = modules(modules.map("\"" + _ + "\"").indexWhere(line.contains))
        if(line.startsWith("libraryDependencies")){
          s"""libraryDependencies += "${org}" %% "$m" % "$v""""
        }else if(line.startsWith("addSbtPlugin")){
          s"""addSbtPlugin("${org}" %% "$m" % "$v")"""
        }else line
      }else line
    }.mkString("", "\n", "\n")
    IO.write(readmeFile, newReadme)
    val git = new sbtrelease.Git(extracted get baseDirectory)
    git.add(readme) ! state.log
    git.commit("update " + readme) ! state.log
    "git diff HEAD^" ! state.log
    state
  }

  private final val Scala211 = "2.11.5"

  lazy val root = Project(
    "root", file(".")
  ).settings(
    commonSettings : _*
  ).settings(
    checkGenerate := {
      val _ = (generateSources in generator).value
      val diff = sys.process.Process("git diff").lines_!
      assert(diff.size == 0, diff)
    },
    publishArtifact := false,
    publish := {},
    publishLocal := {}
  ).aggregate(generator, playTwentyThree, plugin)

  // https://groups.google.com/d/topic/simple-build-tool/_bBUQk4dIAE/discussion
  lazy val generator = Project(
    "generator", file("generator")
  ).settings(
    commonSettings: _*
  ).settings(
    sourceGenerators in Compile <+= buildInfo,
    buildInfoObject := "TwentyThreeGeneratorBuildInfo",
    name := generatorModuleName,
    scalaVersion := "2.10.4",
    crossScalaVersions := Scala211 :: scalaVersion.value :: Nil,
    generateSources := {
      val dir = (generatedSourceDirBase.value / generatedSourceDir).toString
      val cp = (fullClasspath in Compile).value
      val f = file(dir)
      IO.delete(f)
      IO.createDirectory(f)
      (runner in Compile).value.run("play.twentythree.Generate", Attributed.data(cp), Seq(dir), streams.value.log)
    }
  )

  lazy val plugin = Project(
    "plugin", file("plugin")
  ).settings(
    commonSettings ++ ScriptedPlugin.scriptedSettings : _*
  ).settings(
    sbtPlugin := true,
    scalaVersion := "2.10.4",
    name := pluginModuleName,
    ScriptedPlugin.scriptedBufferLog := false,
    ScriptedPlugin.scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
      a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
    ),
    ScriptedPlugin.scriptedLaunchOpts += ("-Dplugin.version=" + version.value),
    onLoadMessage := {
      assert(scalaVersion.value == "2.10.4")
      onLoadMessage.value
    }
  ).dependsOn(generator)

  lazy val playTwentyThree = Project(
    coreProjectId, file("play-twenty-three")
  ).settings(
    commonSettings : _*
  ).settings(
    name := mainModuleName,
    sourceGenerators in Compile <+= buildInfo,
    buildInfoObject := "TwentyThreeBuildInfo",
    scalaVersion := Scala211,
    onLoadMessage := {
      assert(scalaVersion.value == Scala211)
      onLoadMessage.value
    },
    resolvers += "typesafe" at "http://typesafe.artifactoryonline.com/typesafe/releases/",
    libraryDependencies ++= (
      ("com.typesafe.play" %% "play-json" % "2.3.6" % "provided") ::
      ("org.scalacheck" %% "scalacheck" % "1.11.6" % "test") ::
      ("com.chuusai" %% "shapeless" % "2.0.0") ::
      Nil
    ),
    packageSrc in Compile <<= (packageSrc in Compile).dependsOn(compile in Compile),
    watchSources ++= ((sourceDirectory in generator).value ** "*.scala").get,
    cleanSrc := IO.delete(generatedSourceDirBase.value / generatedSourceDir),
    clean <<= clean dependsOn cleanSrc,
    compile in Compile <<= (compile in Compile) dependsOn (generateSources in generator),
    initialize := heartbeat.start
  )
}
