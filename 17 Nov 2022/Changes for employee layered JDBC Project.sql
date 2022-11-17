use wileydi001;

select * from employee;

alter table employee
add doj date;

set SQL_SAFE_UPDATES=0;
update employee
set doj="2018-12-11"
where department="Sales";

update employee
set doj="2021-05-28"
where department="Marketing";
