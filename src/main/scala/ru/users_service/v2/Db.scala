package ru.users_service.v2

import cats.effect.IO
import doobie.*

object Db:
  val xa: Transactor[IO] = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver",
    "jdbc:postgresql://localhost:5432/user_api",
    "postgres",
    "u"
  )