# spring-boot-mvc-kotlin-tutorial

## How to build
`./gradlew build`

Then you can **run** the application with `java -jar build/libs/spring-boot-mvc-kotlin-tutorial-0.1.0-SNAPSHOT.jar`

Specify `--server.port=9000` on the command line to use port `9000` instead of `8080` (default value)

## How to run directly from Gradle
`./gradlew bootRun` (tomcat tries to start on port 8080)

`./gradlew bootRun -Dserver.port=9000` to use port 9000 instead