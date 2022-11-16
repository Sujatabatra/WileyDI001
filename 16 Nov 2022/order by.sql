

select * from employee;
/*
Default sort order is : Ascending
use desc for descending order sorting
*/
select * 
from employee
order by department;

select * 
from employee
order by department desc;

select *
from employee
order by department desc,designation;

select *
from employee
order by department desc,designation desc;

select name
from employee
where department="Sales"
order by salary;

/*
select <projection column list>
from <tablename>
where <selection condition>
order by <column list for sort order> asc/desc
*/