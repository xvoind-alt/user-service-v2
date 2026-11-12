package ru.users_service.v2

class UserRepository(users: Map[Long, User]){

  def findById(id: Long): Option[User] = users.get(id)

}
