/*
 departments ���̺��� manager_id�� null�� �ƴ� department_id�� ��ġ�ϴ� employees ���̺��� first_name,
 last_name, job_id, salary�� ��ȸ
*/
select first_name, last_name, job_id, salary from EMPLOYEES where department_id in (
    select department_id from departments where manager_id is not null);
    
/*
 locations ���̺��� city�� 'Seattle'�� �������� �ʴ� location_id�� ��ġ�ϴ� departments ���̺��� 
 department_id, department_name �� ��ȸ
*/
select department_id, department_name from departments where location_id in (
    select location_id from locations where city != 'Seattle');
    
/*
 regions ���̺��� region_name �� 'Europe'�� region_id�� ��ġ�ϴ� countries ���̺��� country_id��
 ���Ե� locations ���̺��� city, state_province, street_address�� ��ȸ
*/
desc locations;
desc countries;
select city, state_province, street_address from locations where country_id in (
    select country_id from countries where region_id = (
       select region_id from regions where region_name = 'Europe'));
    
/*
DML (data manipulation language)
select
insert
update
delete
CRUD (Create Read Update Delete)
*/

insert into countries values('KR', 'North Korea', 3);
select * from countries;

insert into countries(country_id, country_name, region_id)
values('KP', 'South Korea', 3);
desc countries;
insert into countries(country_id, country_name)
values('KM', 'South Korea');

commit;

update countries set COUNTRY_NAME='South Korea' where COUNTRY_ID = 'KR';
update countries set COUNTRY_NAME='North Korea' where COUNTRY_ID = 'KP';

select * from jobs where job_id = 'IT_PROG';

update jobs set MIN_SALARY=10000, MAX_SALARY=20000 where job_id = 'IT_PROG';

delete from countries where country_id = 'KM';

/*
 countries ���̺�
 COUNTRY_ID COUNTRY_NAME REGION_ID
 AT Austria 1
 NO Norway 1
 ID Indonesia 3
 TR Turkey 4
*/
insert into countries values('AT', 'Austria', 1);
insert into countries values('NO', 'Norway', 1);
insert into countries values('ID', 'Indonesia', 3);
insert into countries values('TR', 'Turkey', 4);
select * from countries;

