import sbt._

class FlowDb(info: ProjectInfo) extends DefaultProject(info)
                                         with IdeaProject
                                         with maven.MavenDependencies {
  /**
   * Publish the source as well as the class files.
   */
  override def packageSrcJar = defaultJarPath("-sources.jar")
  val sourceArtifact = Artifact.sources(artifactID)
  override def packageToPublishActions = super.packageToPublishActions ++ Seq(packageSrc)

  /**
   * Repositories
   */
  val codasRepo = "Coda's Repo" at "http://repo.codahale.com"
  val oracleRepo = "Oracle Maven Repo" at "http://download.oracle.com/maven/"

  /**
   * Dependencies
   */
  val bdb = "com.sleepycat" % "je" % "4.1.7"
  val logula = "com.codahale" %% "logula" % "2.1.0"
  val jerkson = "com.codahale" %% "jerkson" % "0.1.4"

  /**
   * Test Dependencies
   */
  val simplespec = "com.codahale" %% "simplespec" % "0.2.0" % "test"
  val mockito = "org.mockito" % "mockito-all" % "1.8.4" % "test"
}
