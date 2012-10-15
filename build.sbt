/**
 * Project
 *
 * sbt documentation: https://github.com/harrah/xsbt/wiki
 */
name := "XMLPrettyPrinter"

//Remember: also change the version in XMLPrettyPrinter
version := "0.2.1"

organization := "com.jmcejuela.scala.xml"

crossPaths := false //disable using the Scala version in output paths and artifacts


/** Configuration */
//sbteclipse: include resources in classpath
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

//sbteclipse: download dependency packages' sources if available
EclipseKeys.withSource := true


/** Publish */
// publish to local maven
publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath+"/.m2/repository")))


/** Repositories */
// use local maven
resolvers += "Local Maven Repository" at "file://" + (Path.userHome / ".m2" / "repository").absolutePath


/** Dependencies */
libraryDependencies ++= Seq(
    /* Test */
    "org.scalatest" %% "scalatest" % "2.0.M2" % "test"
    /* Main */
)
