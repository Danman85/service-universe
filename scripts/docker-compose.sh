#!/bin/sh

# This script is responsible for setting up the infrastructure for the docker containers
# of service universe

#VOLUMES
# This only gets executed when a volume under the given name does not yet exist. Existing volumes will thus be untouched
docker volume create service-universe-volume

#NETWORKS