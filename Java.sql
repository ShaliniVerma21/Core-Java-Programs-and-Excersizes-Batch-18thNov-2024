Create database Java;
use Java;

create table student(
id int primary key,
name varchar(10)
);

select * from student;

insert into student(id,name)
values(1, "palak"),
(2, "Tejas"),
(3,'mansi');