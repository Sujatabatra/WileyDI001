/*
Relational operator : >, <, >=, <=, !=, =
Logical oerator : and, or, not
*/
select * from employee;

select *
from employee
where department="Sales";

select *
from employee
where not department="Sales";

select *
from employee
where salary>100000;

select *
from employee
where not salary>100000;

-- display all the Executives working in IT Department
select *
from employee
where designation="Executive" and department="IT";

-- display all the employees working either in IT or HR Department
select *
from employee
where department="IT" or Department="HR";

-- display name and department of all the employees working in Sales department
select name,department
from employee
where department="Sales";

select *
from employee
where department IS NOT null;

select * 
from employee
where department IS null;