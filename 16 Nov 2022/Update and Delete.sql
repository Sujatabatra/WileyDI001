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