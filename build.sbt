name := "happy-scala-katas"

version := "0.1"

scalaVersion := "2.12.12"

lazy val library = new {
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.6" % Test
}

lazy val commonSettings = Seq(
  Test / parallelExecution := false
)

lazy val happyScalaKatasProject =
  project
    .in(file("."))
    .settings(commonSettings, libraryDependencies ++= Seq(library.scalaTest))
