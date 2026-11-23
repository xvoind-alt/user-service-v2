package ru.users_service.v2.config

import cats.effect.IO

case class DbConfig(url: String, user: String, password: String)

object DbConfig:

  private def env(name: String): IO[String] =  IO.fromOption(sys.env.get(name))(new RuntimeException(s"Не задана переменная $name"))

  def load: IO[DbConfig] =
    for {
      url <- env("DB_URL")
      user <- env("DB_USER")
      password <- env("DB_PASSWORD")
    } yield DbConfig(url, user, password)