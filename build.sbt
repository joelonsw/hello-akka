ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val akkaVersion = "2.6.18"
val scalaTestVersion = "3.2.9"
val logbackVersion = "1.2.10"

lazy val root = (project in file("."))
    .settings(
        name := "hello-akka",
        libraryDependencies ++= Seq(
            "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
            "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion,
            "org.scalatest" %% "scalatest" % scalaTestVersion,
            "ch.qos.logback" % "logback-classic" % logbackVersion,
        )
    )