#!/usr/bin/env bash

set -eo pipefail

modules=(api-gateway-service config-service registry-service service-a service-b)

for module in "${modules[@]}"; do
  docker build -t "${module}:latest" "${module}"
done
