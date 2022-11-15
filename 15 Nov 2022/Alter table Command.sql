/*
Alter table <tablename>
add <newcolumn> <column defination>
*/

alter table person
add nationality varchar(35) not null;

select * from person;

alter table person
add bloodgroup varchar(20),
add profession varchar(25);

alter table person
modify bloodgroup varchar(15);

alter table person
change profession role varchar(20);

alter table person
drop column nationality;

-- rename table
alter table person
rename to people;

SELECT TABLE_NAME, CONSTRAINT_TYPE, CONSTRAINT_NAME
FROM information_schema.table_constraints
WHERE table_name='people';

use wileydi001;

alter table people
drop constraint email;

alter table people
add constraint email unique(email); 

