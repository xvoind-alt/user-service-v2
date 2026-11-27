ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.9.0"

lazy val root = (project in file("."))
  .settings(
    name := "user-service-v2",
    libraryDependencies ++= Seq(
      "org.tpolecat" %% "doobie-core" % "1.0.0-RC12",
      "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC12",
      "org.typelevel" %% "cats-effect" % "3.7-4972921",
      "org.postgresql" % "postgresql" % "42.7.11",
      "org.http4s" %% "http4s-ember-server" % "0.23.38",
      "org.flywaydb" % "flyway-database-postgresql" % "13.12.2",
      "org.flywaydb" % "flyway-core" % "13.12.2"
    )
  )