lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.313.1746",
    scalaVersion := "2.13.4",
    scalacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfatal-warnings",
      "-Xlint",
      "-Ybackend-parallelism", java.lang.Runtime.getRuntime.availableProcessors().toString,
      "-Ywarn-dead-code",
      "-Ywarn-extra-implicit",
      "-Ywarn-numeric-widen",
    ),
    javacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-Xlint",
      "-Werror"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-wordspec" % "3.2.3" % Test,
      "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.3" % Test,
    ),
    ThisBuild / turbo := true,
  )
