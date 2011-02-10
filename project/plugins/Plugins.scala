import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val codaRepo = "Coda Hale's Repository" at "http://repo.codahale.com/"

  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.2.0"
  val mavenSBT = "com.codahale" % "maven-sbt" % "0.1.1"
}