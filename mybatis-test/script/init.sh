#!/usr/bin/env bash
cd /root/project
service mysql start
mysql -uroot -proot < /root/project/sql/init.sql
#/usr/sbin/apache2ctl -D FOREGROUND
java -jar /root/project/target/coeat-0.0.1-SNAPSHOT.jar