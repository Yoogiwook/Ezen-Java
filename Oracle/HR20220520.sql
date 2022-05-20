select * from EMPLOYEES;
select * from DEPARTMENTS;

/* 카티션 곱 : 모든 행에 대해서 조인*/
select * from EMPLOYEES, DEPARTMENTS;
/* 동등조인 : 조인하는 테이블에서 조인 조건이 일치하는 것만 조회 >> 내부 조인 */
select * from jobs, job_history where jobs.JOB_ID = job_history.JOB_ID;

select C.region_id, L.location_id, L.country_id from countries C, locations L 
where C.country_id = L.country_id;

select * from EMPLOYEES e, DEPARTMENTS d where e.DEPARTMENT_ID = d.DEPARTMENT_ID;

select * from EMPLOYEES;
select * from jobs;

select e.salary, min_salary, max_salary from EMPLOYEES e, jobs j 
where e.salary between j.min_salary and j.max_salary;

select e.first_name, e.hire_date,j.start_date, j.end_date from EMPLOYEES e, JOB_HISTORY j
where e.hire_date between j.start_date and j.end_date;

select hire_date from EMPLOYEES where hire_date between '20070101' and '20071231';

/* 외부조인 : 조인하는 테이블에서 조인 조건을 만족하지 않는 행도 출력 동등조인 조건을 만족하지
못하고 누락된 행을 출력할 때 사용 */
select * from jobs j, job_history h where j.job_id = h.job_id(+);

select * from countries c, locations l where c.country_id = l.country_id(+);

select a.first_name, a.last_name, b.first_name, b.last_name from EMPLOYEES a, EMPLOYEES b 
where a.manager_id = b.EMPLOYEE_ID;

select * from EMPLOYEES;

/* 
 courtries 테이블과 locations 테이블을 country_id 를 기준으로 조인하여 country_name, state_province, 
 street_address를 조회
*/
select * from countries;
select * from LOCATIONS;
select C.country_name, L.state_province, L.street_address from COUNTRIES C, LOCATIONS L 
where L.COUNTRY_ID = C.COUNTRY_ID;

/*
 jobs 테이블과 job_history 테이블을 job_id를 기준으로 조인하여 job_id, job_title, start_date,
 end_date 를 조회
*/
select * from jobs;
select J.job_id, J.job_title, JH.start_date, JH.end_date from jobs J, job_history JH 
where JH.JOB_ID = J.JOB_ID;

/*
 employees 테이블과 departments 테이블을 department_id 기준으로 조인하고, employees 테이블과 
 jobs 테이블을 job_id 기준으로 조인하여 first_name, last_name, department_name, job_title을 조회
*/
select * from EMPLOYEES;
select E.first_name, E.last_name, D.department_name, J.job_title 
from EMPLOYEES E, DEPARTMENTS D, JOBS J 
where E.job_id = J.job_id and E.DEPARTMENT_ID = D.DEPARTMENT_ID;

/*
 countries 테이블과 locations 테이블을 locations의 country_id를 기준으로 외부 조인하여 country_id,
 country_name, city 를 조회
*/
select * from COUNTRIES;
select * from LOCATIONS;
select C.COUNTRY_ID, C.COUNTRY_NAME, L.CITY from COUNTRIES C, LOCATIONS L 
where L.COUNTRY_ID(+) = C.COUNTRY_ID;

