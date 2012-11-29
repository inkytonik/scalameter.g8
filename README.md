This is a giter8 template for sbt 0.11.x (or later) ScalaMeter benchmarking projects
in the style that I (inkytonik) commonly use.

### Properties

* scalac options `-deprecation` and `-unchecked` turned on

* sbt log level is warning

* sbt shell prompt contains project name and version

* no project sub-directory

* sources and resources located directly under `src`

* stub `Main` object with a dummy `main` method

* tests located with sources with suffix `Tests.scala`

* Mercurial `.hgignore` file

* simple example of ScalaTest test

### Usage

Install [giter8 (g8)](http://github.com/n8han/giter8#readme) and [sbt
0.11.x](https://github.com/harrah/xsbt/wiki/Setup) (or later).

In a shell run the following:

    g8 inkytonik/scalameter

The `g8` command will prompt you for information needed to setup the
project.

Run the generated project as follows:

    cd $name$
    sbt
    > test
    [info] ::Benchmark Range.map::
    [info] cores: 8
    [info] hostname: Oogishima.local
    [info] jvm-name: Java HotSpot(TM) 64-Bit Server VM
    [info] jvm-vendor: Oracle Corporation
    [info] jvm-version: 23.5-b02
    [info] os-arch: x86_64
    [info] os-name: Mac OS X
    [info] Parameters(size -> 300000): 3.82
    [info] Parameters(size -> 600000): 7.627
    [info] Parameters(size -> 900000): 11.451
    [info] Parameters(size -> 1200000): 15.271
    [info] Parameters(size -> 1500000): 19.087
    [info]
    [info] Passed: : Total 0, Failed 0, Errors 0, Passed 0, Skipped 0
    >

where `$name$` is the values you entered when running the `g8` command.
