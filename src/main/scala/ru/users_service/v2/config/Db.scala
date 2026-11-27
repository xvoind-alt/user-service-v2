package ru.users_service.v2.config

import cats.effect.IO
import doobie.util.transactor.Transactor

object Db {
  
  def transactor(config: DbConfig): Transactor[IO] = Transactor.fromDriverManager(
    driver = "org.postgresql.Driver",
    url = config.url,
    user = config.user,
    password = config.password,
    logHandler = None
  )
} 