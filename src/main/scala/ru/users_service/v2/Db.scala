package ru.users_service.v2

import cats.effect.IO
import doobie.*

object Db:
  val xa: Transactor[IO] = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver",
    sys.env("DB_URL"),
    sys.env.getOrElse("DB_NAME", "postgres"),
    sys.env("DB_PASSWORD")
  )