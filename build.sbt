// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.11.0"

sparkVersion := "2.2.0"

version := "0.7.5"

spAppendScalaVersion := true

// change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

licenses := Seq("Apache-2.0" -> url("https://github.com/brkyvz/demo-scala-python/blob/master/LICENSE"))

sparkComponents ++= Seq("mllib", "sql", "core")

// add any sparkPackageDependencies using sparkPackageDependencies.
spName := "ironmussa/Optimus"