/*
 countries 테이블과 locations 테이블을 location의 country_id를 기준으로 외부 조인하여 
 country_id, country_name, city 를 조회
*/
select * from countries;
select C.country_id, C.country_name, L.city from countries C, locations L where C.country_id = L.COUNTRY_ID(+);

/*
 employees 테이블과 departments 테이블을 departments 테이블의 department_id를 기준으로 외부 조인하여 employees_id,
 first_name, last_name, department_name을 employee_id를 기준으로 정렬하여 조회
*/
select * from EMPLOYEES;
select E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME from EMPLOYEES E, DEPARTMENTS D 
where E.DEPARTMENT_ID = D.department_id(+) order by E.EMPLOYEE_ID;

/*
 employees 테이블을 manager_id와 employee_id를 기준으로 자체 조인한 뒤에 직원의 first_name과 last_name 을 결합하고 
 관리자의 first_name과 last_name을 결합하여 employee_id를 기준으로 정렬하여 조회
*/
select * from EMPLOYEES;
select E1.first_name || ' ' || E1.last_name, E2.first_name || ' ' || E2.last_name
from EMPLOYEES E1, EMPLOYEES E2 where E1.manager_id = E2.employee_id order by E1.employee_id;

/*
 서브쿼리
    >> 단일 행 서브쿼리
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