#!/bin/bash

export EXTERNAL_IP=$(ifconfig ens34 | sed -En 's/127.0.0.1//;s/.*inet (addr)?(([0-9]*\.){3}[0-9]*).*/\2/p')

exec docker-compose $@