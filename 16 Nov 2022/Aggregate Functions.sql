/*
Aggregate function
multiple row input  -> function() -> one output
sum(), count(),max(),min(),avg()
*/

select sum(salary) "Total Salary to Entire Organisation"
from employee;

select sum(salary) "Total Salary to HR Department"
from employee
where department="HR";

select min(salary) "Minimum Salary in Entire Organisation",
max(salary) "Maximum Salary in Entire Organisation",
avg(salary) "Average Salary in an Organisation"
from employee;

select min(salary) "Minimum Salary in HR Department",
max(salary) "Maximum Salary in HR Department",
avg(salary) "Average Salary in HR Department"
from employee
where department="HR";