CREATE TABLE members (
    member_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (member_id)
);

CREATE TABLE committees (
    committee_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (committee_id)
);

INSERT INTO members(name)
VALUES('John'),('Jane'),('Mary'),('David'),('Amelia');

INSERT INTO committees(name)
VALUES('John'),('Mary'),('Amelia'),('Joe');

select * from members;

select * from committees;

select member_id,m.name,committee_id,c.name
from members m inner join committees c
USING(name);

select * from emp;

select * from department;

select empId,name,e.departmentId,departmentName,location,designation,salary
from emp e inner join department d
USING(departmentId);

SELECT TABLE_NAME, CONSTRAINT_TYPE, CONSTRAINT_NAME
FROM information_schema.table_constraints
WHERE table_name='emp';

alter table emp
change departmentId dept_id varchar(10);

select * from department;

select * from emp;

select empId,name,dept_id,departmentName,location,designation,salary
from emp e inner join department d
on e.dept_id=d.departmentId;