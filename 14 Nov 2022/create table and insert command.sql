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