ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.8.0"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.32"
val circeVersion = "0.14.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
