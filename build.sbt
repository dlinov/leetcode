ThisBuild / resolvers += Resolver.JCenterRepository
ThisBuild / turbo := true

lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.325.1938",
    scalaVersion := "3.0.2",
    scalacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfatal-warnings",
      //"-Xlint",
      //"-Ybackend-parallelism", java.lang.Runtime.getRuntime.availableProcessors().toString,
      //"-Ywarn-dead-code",
      //"-Ywarn-extra-implicit",
      //"-Ywarn-numeric-widen",
      //"-rewrite",
      //"-source:3.0-migration",
    ),
    javacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-Xlint",
      "-Werror"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-wordspec" % "3.2.10" % Test,
      "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.10" % Test,
    ),
  )
