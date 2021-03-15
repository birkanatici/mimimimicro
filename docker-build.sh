#!/usr/bin/env bash

set -eo pipefail

modules=(api-gateway-service config-service registry-service service-a service-b)

for module in "${modules[@]}"; do
  mvn spring-boot:build-image -DskipTests -f "${module}"
  docker build -t "${module}:latest" "${module}"
done
