#!/usr/bin/env bash
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
./script/clean.sh
./script/docker.sh