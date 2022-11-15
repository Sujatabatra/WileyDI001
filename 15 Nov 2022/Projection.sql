/*
Selection : Selection of Rows
Projection : Selection of Columns
to view the content (record of the table)
SELECT columnName1,columnName 2,.....columnName n  (Projection List)
FROM <TABLE NAME>
WHERE <SELECTION CONDITION>
*/

select *  -- All the columns
from employee;

select employeeId,name,salary
from employee;

select employeeId as ID, name,salary 
from employee; 
-- or
select employeeId ID, name,salary 
from employee;
-- or
select employeeId "ID", name,salary 
from employee;
-- or
select employeeId "EMP ID", name,salary 
from employee;

select * from employee;

select 
concat("Mr./Ms.",name," works as ",designation," in ",department," department") as "Employee Details"
from employee;

/*
while opting for projection list, you can make use of calculative fields as well
*/

select name,salary "Monthly Salary",12*salary "Annual Salary"
from employee;

/*
Operators : +, -, *, /
*/

select
name,
salary "Basic Salary",
.10*salary "allowance",
.07*salary "deduction",
salary+.10*salary-0.07*salary "TotalSalary"
from employee;

select distinct department from employee;