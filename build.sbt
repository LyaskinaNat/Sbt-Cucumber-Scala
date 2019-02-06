name := "ScalaBDDFinal"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium"%"selenium-java"%"2.53.0",
  "org.seleniumhq.selenium"%"selenium-htmlunit-driver"%"2.52.0",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.4",
  "info.cukes"%"cucumber-junit"%"1.2.5",
  "info.cukes"%"cucumber-picocontainer"%"1.2.5",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.5.0"
)