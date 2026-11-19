package ru.users_service.v2

import cats.effect.{IO, IOApp}
import com.comcast.ip4s.{host, port}
import org.http4s.ember.server.EmberServerBuilder

object Application extends IOApp.Simple{

  def run: cats.effect.IO[Unit] =
    EmberServerBuilder
      .default[IO]
      .withPort(port"8080")
      .withHost(host"localhost")
      .build
      .useForever
}