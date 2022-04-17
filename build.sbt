ThisBuild / resolvers += Resolver.JCenterRepository
ThisBuild / turbo := true

lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.338.2246",
    scalaVersion := "3.1.1",
    scalacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfatal-warnings",
      //"-Xlint",
      //"-Ywarn-dead-code",
      //"-Ywarn-extra-implicit",
      //"-Ywarn-numeric-widen",
    ),
    javacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-Xlint",
      "-Werror"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-wordspec" % "3.2.11" % Test,
      "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.11" % Test,
    ),
  )
