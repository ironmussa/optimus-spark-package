// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.11.0"

sparkVersion := "2.2.0"

version := "1.0.3"

// change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

licenses := Seq("Apache-2.0" -> url("https://github.com/ironmussa/Optimus/blob/master/LICENSE"))

// add any sparkPackageDependencies using sparkPackageDependencies.
sparkComponents ++= Seq("mllib", "sql", "core")

spName := "ironmussa/Optimus"