create database if not exists mydb;
create table if not exists mydb.person(
    no int primary key auto_increment,
    name varchar(30) not null,
    id varchar(30) not null
);

insert into mydb.person(name,id) values('KIM DU SU','kukaro');

alter user 'root'@'localhost' identified with mysql_native_password by 'root';