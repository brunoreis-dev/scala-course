ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "scala-api",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.5.0",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0",
      "io.spray" %%  "spray-json" % "1.3.6",
      "com.typesafe.akka" %% "akka-stream" % "2.8.0"
    )
  )
