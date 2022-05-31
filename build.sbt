import Dependencies._
import LiveReloadStartMode._

inThisBuild(Def.settings(
  scalaVersion := "2.13.8",
  version := "0.1.0-SNAPSHOT",
  organization := "com.potenciasoftware",
  organizationName := "rebel",
  scalacOptions ++= Seq(
    "-encoding", "utf8",
    "-deprecation",
    "-unchecked",
    "-feature",
    "-Xlint:unused",
    ),
  ))

Global / liveReloadStartMode := Manual

lazy val rebel = (project in file("."))
  .settings(
    name := "rebel",
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value,
    libraryDependencies += "dev.zio" %% "zio" % "2.0.0-RC6",
    libraryDependencies += scalaTest % Test,
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
