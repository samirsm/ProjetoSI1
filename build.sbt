name := """caronaUFCG20152"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  "commons-io" % "commons-io" % "2.4",
  "org.apache.directory.api" % "api-all" % "1.0.0-M14",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
 // "org.postgresql" % "postgresql" % "9.3-1100-jdbc41",
  "org.hibernate" % "hibernate-core" % "5.1.0.Final",
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final"

)

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)



fork in run := false