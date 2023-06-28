FROM openjdk:17-jdk-slim

MAINTAINER Danman85

ENV APP_HOME="/opt/app"
ENV ARTIFACT_NAME="discovery-service-0.0.1-SNAPSHOT.jar"
ENV SPRING_PROFILES_ACTIVE="docker"
# HTTP server port
ENV SERVER_PORT=8910
# Java debug port
ENV DEBUG_PORT=8911

# Expose default servlet container port
EXPOSE ${SERVER_PORT}

RUN mkdir $APP_HOME

COPY /image-entrypoint.sh /
COPY /target/*.jar $APP_HOME

# Give permissions
RUN chmod 755 image-entrypoint.sh

ENTRYPOINT ["/image-entrypoint.sh"]