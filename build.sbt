lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.1023.31",
    scalaVersion := "2.12.8",
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
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % Test
  )
