lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
<<<<<<< HEAD
    version := "0.72.1406",
=======
    version := "0.1406.67",
>>>>>>> [java] Task 122, Best Time to Buy and Sell Stock II
    scalaVersion := "2.13.1",
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
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test,
    ThisBuild / turbo := true,
  )
