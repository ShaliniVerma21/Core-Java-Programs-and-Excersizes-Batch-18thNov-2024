-- Single line comment 
# this is also used as single line comment 
/*
Multiline commnet 
*/

# SQL is not a case sensitive language 

-- create your database first (press ctrl+enter to execute query )

create database Company2025;

-- to work on it you need to use this database 
use Company2025;


create table emp(
id int primary key, 
name char(50) not null, 
salary float);

-- show table data 
select * from emp;

-- insert values 
insert into emp(id, name,salary) values
(101, "Tejas" , 10000000),
(102, "Gaurav", 100000),
(103, "Yogesh", 10000000);