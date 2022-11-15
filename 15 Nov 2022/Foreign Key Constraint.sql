/*
Foreign Key : primary key of one table can be a foreign key to another table
*/
-- parent table
create table department(
departmentId varchar(10) primary key, -- primary key
departmentName varchar(35),
location varchar(25),
capacity int);

/*
Syntax:
constraint <constraint name>
foreign key(<fieldname>)
references <parenttablename>(<primarykeyname>);
On delete <Reference Option>
On update <Reference Option>

Reference Option :
CASCADE: if a row from the parent table is deleted or updated, the values of the matching rows in the child table automatically deleted or updated.
SET NULL:  if a row from the parent table is deleted or updated, the values of the foreign key column (or columns) in the child table are set to NULL.
RESTRICT:  if a row from the parent table has a matching row in the child table, MySQL rejects deleting or updating rows in the parent table.
NO ACTION: is the same as RESTRICT.
*/
create table emp(
empId int primary key,
name varchar(20),
departmentId varchar(10),
designation varchar(20),
salary double,
constraint deptId_FK
foreign key(departmentId)
references department(departmentId));

describe emp;
describe department;

insert into department
values("D001","Department A","Location X",100),
("D002","Department B","Location M",50),
("D003","Department C","Location A",190),
("D004","Department D","Location X",25),
("D005","Department E","Location R",178);

select * from department;

insert into emp
values(1,"AAAA","D003","Associate",67000),
(2,"BBBB","D002","Sr. Associate",89000),
(3,"CCCC","D003","Manager",287000),
(4,"DDDD","D004","Executive",47000),
(5,"EEEE","D002","Director",769000);

select * from emp;

insert into emp
values(6,"FFFF","D009","Associate",67000);