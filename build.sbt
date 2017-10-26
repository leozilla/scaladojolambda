name := "scalacodingdojo"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "junit" % "junit" % "4.12",
  "org.scalaz" %% "scalaz-core" % "7.2.0",
  "org.scalaz" %% "scalaz-effect" % "7.2.0")
    