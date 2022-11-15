/*
primary key (unique and not null)=> index created
not null
unique => index created
default
check
*/

use wileydi001;

create table users(
userId int auto_increment primary key,
userName varchar(25) not null unique,
age int,
password varchar(25) default "MyPassword");

insert into users(userName,age,password)
values("User1",34,"user123");

select * from users;

insert into users(userName,password)
values("User2","userpassword123");

insert into users(userName,age)
values("User3",34);

select * from users;

create table Voters(
voterId int auto_increment primary key,
voterName varchar(25),
address varchar(40),
age int check(age>=18));

insert into voters(voterName,address,age)
values("AAAA","Address 1",34);

select * from voters;

insert into voters(voterName,address,age)
values("BBBB","Address 2",14);

-- show the name of tables in current database
show tables;

-- shows the structure of the table
describe voters;