/*
For Selection : LIKE 
*/

select * from employee;

/*
% : replaces zero and more characters
_ : replaces 1 character
*/
select * from employee
where designation LIKE "Sr.%";

select * from employee
where department LIKE "_a%";

select * from employee
where department LIKE "_a%" LIMIT 2;

select * from employee
where salary>=50000 and salary<=100000;

/*
BETWEEN ... AND
*/

select * from employee
where salary BETWEEN 50000 and 100000;

/*
display all the employees working in either IT,HR and Marketing department
*/

select * from employee
where department="IT" or department="HR" or department="Marketing";

/*
IN(value 1,value 2.... value n)
*/

select * from employee
where department IN("IT","HR","Marketing");