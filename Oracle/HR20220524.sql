/* 다중 서브 쿼리*/
select salary from EMPLOYEES where salary in (select max(salary) from EMPLOYEES group by department_id)
order by salary;

select salary from EMPLOYEES where salary not in (select max(salary) from EMPLOYEES group by department_id)
order by salary;

select * from EMPLOYEES where EXISTS(select * from EMPLOYEES where employee_id = 100);

select * from EMPLOYEES where salary <> any(6000,10000,12000);

select * from EMPLOYEES where salary < any( select salary from EMPLOYEES where hire_date > '08/01/01');

/*
 departments 테이블에서 department_name이 'IT' 인 department_id와 일치하는 employees 테이블의 first_name,
 last_name, job_id, salary를 조회
*/
select * from DEPARTMENTS;
select * from EMPLOYEES;

select first_name, last_name, job_id, salary, department_id from EMPLOYEES where department_id = (
    select department_id from departments where department_name = 'IT');

/*
 locations 테이블에서 state_province이 'California'인 location_id 와 일치하는 departments 테이블의
 department_id, department_name 을 조회
*/
select department_id, department_name, location_id from departments where location_id = (
    select location_id from locations where state_province = 'California');
    
/*
 countries 테이블에서 region_id 가 3인 country_id가 포함된 locations 테이블의 city, state_province,
 street_adderss 를 조회
*/
select city, state_province, street_address, country_id from locations where country_id in (
    select country_id from countries where region_id = 3);