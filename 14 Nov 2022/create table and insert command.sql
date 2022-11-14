use wileydi001;

/* create table command
Syntax : 
create table <tablename>
(
<columnname> <datatype> <constraint>,
.
.
.
<columnname><datatype> <contraint>
)

contraint : Primary Key : field which is used to uniquely identify each and every record/row
*/
create table employee(
employeeId int primary key,
name varchar(30),
designation varchar(30),
department varchar(35),
salary double);

-- to add records in table
insert into employee(employeeId,designation,department,name,salary)
values(101,'Executive','IT','AAAAA',78000);

insert into employee(employeeId,designation,department,name,salary)
values(102,'Sr. Executive','Sales','BBBBB',85000);

insert into employee
values(103,'CCCC','Associate','Sales',120000);

-- to view table contents
select * from employee;

insert into employee
values(104,'DDDD','Manager','Sales',150000),
(105,'EEEE','Sr. Associate','HR',135000),
(106,'FFFF','Representative','Sales',25000);

-- command won't work as primary key is duplicate
insert into employee
values(105,'Helen','Executive','IT',65000);

insert into employee
values(107,'Helen','Executive',null,65000);

insert into employee(employeeId,name,salary)
values(108,"GGGG",89000);

-- Primary key means unique and not null
insert into employee
values(null,'Rehan','Executive',null,65000);


insert ignore into employee
values(109,'HHHHH','Manager','IT',250000),
(105,'IIII','Sr. Associate','HR',135000),
(110,'IIII','Associate','HR',125000);

select * from employee;