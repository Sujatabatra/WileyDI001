use wileydi001;

select * from employee;

update employee
set salary=salary+100
where employeeId=101;

SET SQL_SAFE_UPDATES = 0;

update employee
set designation=concat("Sr.",designation)
where name="DDDD";

update employee
set department="Marketing"
where designation="Representative";

delete from employee
where employeeId=110;

delete from employee LIMIT 2;

select * from employee;
/*
Limit offset rowcount
offset starts with 0
*/
select * from employee LIMIT 3,2;

update employee
set salary=salary+100
LIMIT 3;


update employee 
set department="Sales"
where employeeId=109;

SET SQL_SAFE_UPDATES = 0;
update employee
set department="HR"
where department IS NULL;

update employee 
set designation="Associate"
where employeeId=108;