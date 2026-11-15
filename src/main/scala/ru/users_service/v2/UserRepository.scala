package ru.users_service.v2

import doobie.ConnectionIO
import doobie.implicits.*

object UserRepository{

  def findById(id: Long): ConnectionIO[Option[User]] =
    sql"SELECT id, name, email FROM users WHERE id = $id"
      .query[User]
      .option
}
