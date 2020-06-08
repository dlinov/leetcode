lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.132.1473",
    scalaVersion := "2.13.2",
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
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % Test,
    ThisBuild / turbo := true,
  )
