Toy Project Setting Test

Java Version - 17
Spring Boot Version - 3.2.2
DB - MySql

#Test DataBase SQL

-- create sql
create table DEMOTEAT (
no int,
name varchar(10),
title varchar(500)
);

-- insert sql
insert into demoteat values(1, 'test', 'test입니다.');

-- select sql
select * from demoteat where no = 1;
