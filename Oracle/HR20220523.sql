/*
 countries ���̺�� locations ���̺��� location�� country_id�� �������� �ܺ� �����Ͽ� 
 country_id, country_name, city �� ��ȸ
*/
select * from countries;
select C.country_id, C.country_name, L.city from countries C, locations L where C.country_id = L.COUNTRY_ID(+);

/*
 employees ���̺�� departments ���̺��� departments ���̺��� department_id�� �������� �ܺ� �����Ͽ� employees_id,
 first_name, last_name, department_name�� employee_id�� �������� �����Ͽ� ��ȸ
*/
select * from EMPLOYEES;
select E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME from EMPLOYEES E, DEPARTMENTS D 
where E.DEPARTMENT_ID = D.department_id(+) order by E.EMPLOYEE_ID;

/*
 employees ���̺��� manager_id�� employee_id�� �������� ��ü ������ �ڿ� ������ first_name�� last_name �� �����ϰ� 
 �������� first_name�� last_name�� �����Ͽ� employee_id�� �������� �����Ͽ� ��ȸ
*/
select * from EMPLOYEES;
select E1.first_name || ' ' || E1.last_name, E2.first_name || ' ' || E2.last_name
from EMPLOYEES E1, EMPLOYEES E2 where E1.manager_id = E2.employee_id order by E1.employee_id;

/*
 ��������
    >> ���� �� ��������
*/
select * from EMPLOYEES where PHONE_NUMBER = '515.123.4567';
select PHONE_NUMBER from EMPLOYEES where EMPLOYEE_ID = 100;
select * from EMPLOYEES where PHONE_NUMBER = (
    select PHONE_NUMBER from EMPLOYEES where EMPLOYEE_ID = 100
);

select * from EMPLOYEES where hire_date = '03/06/17';
select hire_date from EMPLOYEES where email = 'SKING';
select * from EMPLOYEES where hire_date = (
    select hire_date from EMPLOYEES where email = 'SKING'
);

select * from EMPLOYEES where hire_date < (
    select hire_date from EMPLOYEES where email = 'SKING'
);

select salary from EMPLOYEES where EMPLOYEE_ID = 100;
select first_name, salary from EMPLOYEES where salary < (
    select salary from EMPLOYEES where EMPLOYEE_ID = 100
);
    
-- hire_date 06/01/03 --> salary
select * from EMPLOYEES where salary = (
    select salary from EMPLOYEES where hire_date = '06/01/03'
);
select * from EMPLOYEES where salary > (
    select salary from EMPLOYEES where hire_date = '06/01/03'
);