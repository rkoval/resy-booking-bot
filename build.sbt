name := "resy-booking-bot"

scalaVersion := "2.12.4"

lazy val root = project in file(".")

libraryDependencies ++= Seq("com.typesafe.play" %% "play-ahc-ws" % "2.6.11")
