package ru.users_service.v2

object Main {
  def main(args: Array[String]): Unit = {

    val people: Map[Long, User] = Map(1L -> User("tema", 1, "tem@mal.okno"),
      2L -> User("lada", 2, "lada@konn,pryan"))

    val repo = UserRepository(people)

    println(repo.findById(1))
    println(repo.findById(3))
    println(repo.findById(2))
  }
}