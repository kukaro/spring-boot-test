#!/usr/bin/env bash
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
java -jar ./target/coeat-0.0.1-SNAPSHOT.jar
