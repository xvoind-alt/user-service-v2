package ru.users_service.v2.config

import cats.effect.IO
import org.flywaydb.core.Flyway

object Migrations:

  def run: IO[Unit] =
    IO.blocking {
      Flyway
        .configure()
        .dataSource(sys.env("DB_URL"), sys.env("DB_USER"), sys.env("DB_PASSWORD"))
        .load()
        .migrate()
    }.void