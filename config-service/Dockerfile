FROM openjdk:17-jdk

MAINTAINER Danman85

ENV APP_HOME="/opt/app"
ENV ARTIFACT_NAME="config-service-0.0.1-SNAPSHOT.jar"
ENV SPRING_PROFILES_ACTIVE="docker"
# HTTP server port
ENV SERVER_PORT=8900
# Java debug port
ENV DEBUG_PORT=8901

# Expose default servlet container port
EXPOSE ${SERVER_PORT}

RUN mkdir $APP_HOME

COPY /image-entrypoint.sh /
COPY /target/*.jar $APP_HOME

# Give permissions
RUN chmod 755 image-entrypoint.sh

ENTRYPOINT ["/image-entrypoint.sh"]

# WHERE DID I LEAVE OFF?
# In orde tostart discovery service, we need to start config service first.
# therefore a health check needs to be added.
# Since the openJDK image does not have curl or anything similar, I am testing with a new base image.
# Currently using alpine and see if that works.
# See OBST for examples