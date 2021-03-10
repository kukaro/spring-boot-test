#!/usr/bin/env bash
#원래 이게 원본이였음
RELATIVE_DIR=`dirname "$0"`
cd "$RELATIVE_DIR" && cd ..
mvn clean
mvn install
service mysql start
mysql -uroot -proot < /root/project/sql/init.sql
java -jar /root/project/target/coeat-0.0.1-SNAPSHOT.jar
