name := "ScalaBDDFinal"

version := "0.1"

scalaVersion := "2.12.7"



libraryDependencies ++= Seq(
  "org.seleniumhq.selenium"%"selenium-java"%"2.53.0",
  "org.seleniumhq.selenium"%"selenium-htmlunit-driver"%"2.52.0",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test",
  "io.cucumber" %% "cucumber-scala" % "2.0.0",
  "io.cucumber"%"cucumber-junit"%"2.0.0",
  "io.cucumber"%"cucumber-picocontainer"%"2.0.0",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.5.0"
)

parallelExecution in Test := false