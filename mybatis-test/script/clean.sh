#!/usr/bin/env bash
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
docker-compose down