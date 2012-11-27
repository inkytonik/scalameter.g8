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
    > run
    Hello from $organization$.$name$ Main!
    Factorial 4 = 24

where `$organization$` and `$name$` are the values you entered when
running the `g8` command.
