/*
group by clause
*/

select * from employee;

select department, sum(salary) "Total Salary"
from employee
group by department;




/* name : 3 row output,group value : 1 row, sum(salary) : 1 row  
Incorrect output : as we are trying to display multi row output with single row output
*/
select name,department, sum(salary) "Total Salary"
from employee
group by department;   -- we created groups


select department, sum(salary) "Total Salary"
from employee
group by department
having sum(salary)>50000;