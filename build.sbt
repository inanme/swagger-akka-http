organization := "com.github.inanme"

name := "swagger-akka-http"

scalaVersion := "2.13.2"

crossScalaVersions := Seq("2.13.2", "2.12.11")

val akkaVersion = "2.6.5"
val swaggerVersion = "1.5.13"
val akkaHttpVersion = "10.1.12"
val jacksonVersion = "2.9.9"
val slf4jVersion = "1.7.22"

checksums in update := Nil

//EclipseKeys.withSource := true

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion % "test",
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % "test",
  "io.swagger" % "swagger-core" % swaggerVersion,
  "io.swagger" % "swagger-annotations" % swaggerVersion,
  "io.swagger" % "swagger-models" % swaggerVersion,
  "io.swagger" % "swagger-jaxrs" % swaggerVersion,
  "io.swagger" %% "swagger-scala-module" % "1.0.6",
  "org.slf4j" % "slf4j-api" % slf4jVersion,
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion,
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % jacksonVersion,
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.json4s" %% "json4s-native" % "3.6.8" % "test",
  "joda-time" % "joda-time" % "2.8" % "test",
  "org.joda" % "joda-convert" % "1.7" % "test",
  "org.slf4j" % "slf4j-simple" % slf4jVersion % "test",
  "javax.xml.bind" % "jaxb-api" % "2.3.1"
)

testOptions in Test += Tests.Argument("-oD")

parallelExecution in Test := false
logBuffered := false

publishMavenStyle := true

publishTo := sonatypePublishToBundle.value

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

parallelExecution in Test := false

homepage := Some(url("https://github.com/inanme/swagger-akka-http"))

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

releasePublishArtifactsAction := PgpKeys.publishSigned.value

pomExtra := (
  <scm>
    <url>git@github.com:inanme/swagger-akka-http.git</url>
    <connection>scm:git:git@github.com:inanme/swagger-akka-http.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mhamrah</id>
      <name>Michael Hamrah</name>
      <url>http://michaelhamrah.com</url>
    </developer>
    <developer>
      <id>efuquen</id>
      <name>Edwin Fuquen</name>
      <url>http://parascal.com</url>
    </developer>
    <developer>
      <id>rliebman</id>
      <name>Roberto Liebman</name>
      <url>https://github.com/rleibman</url>
    </developer>
    <developer>
      <id>pjfanning</id>
      <name>PJ Fanning</name>
      <url>https://github.com/pjfanning</url>
    </developer>
    <developer>
      <id>inanme</id>
      <name>M Inan</name>
      <url>https://github.com/inanme</url>
    </developer>
  </developers>)
