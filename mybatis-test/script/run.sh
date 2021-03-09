#!/usr/bin/env bash
#사용 안하는중
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
service mysql restart
java -jar ./target/coeat-0.0.1-SNAPSHOT.jar
