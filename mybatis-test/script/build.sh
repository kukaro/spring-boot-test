#!/usr/bin/env bash
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
mvn clean
mvn install
service mysql start
java -jar /root/project/target/coeat-0.0.1-SNAPSHOT.jar