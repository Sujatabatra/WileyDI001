/*
By default index got created for primary key and unique columns 
*/
create table person(
personId int primary key,
personName varchar(25) not null,
age int,
email varchar(30) unique not null,
address varchar(30));

insert into person
values(1,"Person A",78,"personA@something.com","Some Address");

-- person name cannot be null
insert into person
values(2,null,78,"personA@something.com","Some Address");

-- person email cannot be duplicated
insert into person
values(2,"Person B",45,"personA@something.com","Any Address");

insert into person
values(2,"Person B",45,"personB@something.com","Any Address");