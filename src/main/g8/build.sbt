name := "$name$"

version := "$version$"

organization := "$organization$"

// Scala compiler settings

scalaVersion := "$scalaversion$"

scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked")

// Interactive settings

logLevel := Level.Info

shellPrompt <<= (name, version) { (n, v) => _ => n + " " + v + "> " }

// Execution

parallelExecution in Test := false

// Dependencies

libraryDependencies ++=
    Seq (
        "com.github.axel22" %% "scalameter" % "0.2"
    )

testFrameworks +=
    new TestFramework ("org.scalameter.ScalaMeterFramework")

logBuffered := false

resolvers ++= Seq (
    Resolver.sonatypeRepo ("releases"),
    Resolver.sonatypeRepo ("snapshots")
)

// Source code locations

// Specify how to find source and test files.  Main sources are
//    - in src directory
//    - all .scala files, except
// Test sources, which are
//    - files whose names end in Tests.scala, which are actual test sources

scalaSource in Compile <<= baseDirectory { _ / "src" }

scalaSource in Test <<= scalaSource in Compile

// Resources

unmanagedResourceDirectories in Compile <<= (scalaSource in Compile) { Seq (_) }

unmanagedResourceDirectories in Test <<= unmanagedResourceDirectories in Compile

// There are no compile resources
unmanagedResources in Compile := Seq ()

// Test resources are the non-Scala files in the source that are not hidden
unmanagedResources in Test <<= (scalaSource in Test) map { s => {
    (s ** (-"*.scala" && -HiddenFileFilter)).get
}}

