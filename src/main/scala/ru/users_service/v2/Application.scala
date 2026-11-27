package ru.users_service.v2

import cats.effect.{IO, IOApp}
import com.comcast.ip4s.{host, port}
import org.http4s.ember.server.EmberServerBuilder
import ru.users_service.v2.config.{DbConfig, Migrations}

object Application extends IOApp.Simple {

  def run: cats.effect.IO[Unit] =
    for {
      config <- DbConfig.load
      migrations <- Migrations.run(config)
      _ <- EmberServerBuilder
        .default[IO]
        .withPort(port"8080")
        .withHost(host"localhost")
        .build
        .useForever
    } yield ()
}