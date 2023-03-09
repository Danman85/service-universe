FROM openjdk:17-jdk-slim

MAINTAINER Danman85

ARG JAR_FILE=target/config-service-0.0.1-SNAPSHOT.jar

WORKDIR /usr/src

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]