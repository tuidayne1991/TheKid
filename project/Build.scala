import sbt._
import Keys._
import play.Project

object ApplicationBuild extends Build {
  val appName         = "TheKid"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" %% "webjars-play" % "2.1.0-3",
    "org.webjars" % "bootstrap" % "2.1.1"
  )

  val main = Project(appName, appVersion, appDependencies).settings()
}