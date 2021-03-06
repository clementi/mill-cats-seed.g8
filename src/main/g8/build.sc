import mill._, scalalib._

object $moduleName$ extends ScalaModule {
  def scalaVersion = "$scala_version$"
  
  def ivyDeps = Agg(
    ivy"org.typelevel::cats-core:2.4.2",
    ivy"org.typelevel::cats-effect:2.3.3",
    ivy"dev.profunktor::console4cats:0.8.1"
  )

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalameta::munit:$munit_version$")
    def testFrameworks = Seq("munit.Framework")
  }
}
