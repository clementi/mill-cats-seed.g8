package example

import cats.effect.{IOApp, ExitCode}
import cats.effect.Console.io._

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    putStrLn("Hello").as(ExitCode.Success)
  }
}
