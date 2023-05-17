#!/bin/sh

set -e

echo "Starting service-universe:config-service: ${APP_HOME}/${ARTIFACT_NAME}"

if [ "$DEBUG" = true ]; then
  printf "Running the application in debug mode\n"
  JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:$DEBUG_PORT"
fi

echo "JAVA_OPTS: ${JAVA_OPTS}"
echo "Active profiles: ${SPRING_PROFILES_ACTIVE}"

exec java -jar $JAVA_OPTS \
       -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} \
       ${APP_HOME}/$ARTIFACT_NAME