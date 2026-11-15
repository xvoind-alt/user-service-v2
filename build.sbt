ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.9.0"

lazy val root = (project in file("."))
  .settings(
    name := "user-service-v2",
    libraryDependencies ++= Seq(
      "org.tpolecat" %% "doobie-core"     % "1.0.0-RC2",
      "org.typelevel" %% "cats-effect"    % "3.3.14",
      "org.postgresql" % "postgresql" % "42.5.1"
    )
  )