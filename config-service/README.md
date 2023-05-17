# Config-Service

## Introduction

This service services the configuration for all applications in this Spring Cloud Implementation.

## How to run

### Locally

Running locally can be done in two ways. One is through Intellij/Maven. However, this consumes a lot of memory and
cumbersome. The other way is to directly run the built jars e.g.: `service-universe/config-service/target/config-service-0.0.1-SNAPSHOT.jar`.
To this end, a script has been provided which will do this. It can be found in the `scripts` folder under the module
root folder.  
On top of that, there is a single 'root' script, that starts the scripts of the so called 'core applications':
- config-service
- discovery-service
- admin-service  

This gives you the possibility to start 'service-universe' with a single 'button'.  

Possible tenants will have to be started manually.

**Requirements**
* Java17 Runtime. In case JAVA_HOME is set to a lower version, one can provide a custom
JDK location by adding it to `project.properties`, which needs to be placed directly in
the root folder of the parent roject (Service-Universe).  

Example:
```
jdk=C:\java\jdk-17.0.2
```
* Start with the 'local' profile. The local profile is intended to be used in a non-docker, Windows environment.

### Docker

1. Create a volume and insert it into the 'config-service' container, under path: `/service-universe`  

Example:
```
1: docker volume create <volume-name>

2: docker run -v <volume-name>:/service-universe -d -p 8900:8900 -p 8901:8901 --name su-config-service su-config-service:latest
```

2. Copy the configuration from the project 'service-universe-config' to the volume, located under `/service-universe` 
inside the container.  

Example
```
3. docker cp <local config repo location> su-config-service:/service-universe
```

At this point, the 'config-service' is considered up-and-running, serving all the necessary config.