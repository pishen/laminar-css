enablePlugins(ScalaJSPlugin)

name := "laminar-css"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.raquo" %%% "laminar" % "0.3",
  "com.lihaoyi" %%% "scalatags" % "0.6.5",
  "com.github.japgolly.scalacss" %%% "ext-scalatags" % "0.5.3"
)

scalaJSUseMainModuleInitializer := true
