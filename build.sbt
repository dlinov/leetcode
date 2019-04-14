lazy val root = (project in file("."))
  .settings(
    name := "leetcode",
    version := "0.1023.31",
    scalaVersion := "2.12.8",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % Test
  )
