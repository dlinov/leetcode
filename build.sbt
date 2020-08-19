lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.169.1553",
    scalaVersion := "2.13.3",
    scalacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-deprecation",
      "-unchecked",
      "-Xfatal-warnings",
      "-Xlint",
      "-Ywarn-dead-code"
    ),
    javacOptions ++= Seq(
      "-encoding", "utf8", // Option and arguments on same line
      "-Xlint",
      "-Werror"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-wordspec" % "3.2.1" % Test,
      "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.1" % Test,
    ),
    ThisBuild / turbo := true,
  )
