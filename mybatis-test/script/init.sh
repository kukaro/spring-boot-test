#!/usr/bin/env bash
cd /root/project
service mysql start
pwd > /root/log.txt
java -jar /root/project/target/coeat-0.0.1-SNAPSHOT.jar