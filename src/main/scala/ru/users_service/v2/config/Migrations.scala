package ru.users_service.v2.config

import cats.effect.IO
import org.flywaydb.core.Flyway

object Migrations:

  def run(config: DbConfig): IO[Unit] =
    IO.blocking {
      Flyway
        .configure()
        .dataSource(config.url, config.user, config.password)
        .load()
        .migrate()
    }.void