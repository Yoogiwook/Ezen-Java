/*
집합 연산자 : union, union all, minus, intersect
*/

select employee_id, first_name, department_id from EMPLOYEES where department_id = 60
union 
select employee_id, first_name, department_id from EMPLOYEES where department_id = 100;

select employee_id, first_name, department_id from EMPLOYEES where department_id >=140
union
select employee_id, first_name, department_id from EMPLOYEES where department_id <=160;

select employee_id, first_name, department_id from EMPLOYEES where department_id <=100
minus
select employee_id, first_name, department_id from EMPLOYEES where department_id >=50;

select employee_id, first_name, department_id from EMPLOYEES where department_id <=100
intersect
select employee_id, first_name, department_id from EMPLOYEES where department_id >=50;


-- jobs 테이블에서 job_title 기준으로 정렬하여 직업 조회
select * from jobs;

select * from jobs order by job_title;

-- countries 테이블에서 country_name 기준 내림차순으로 정렬하여 조회
select * from countries order by country_name desc;

-- employees 테이블에서 salary가 10000에서 12000 사이인 직원 조회
select * from employees where salary between 10000 and 12000;
select * from employees where salary >= 10000 and salary <= 12000;

-- employees 테이블에서 job_id가 'IT_PROG'와 'ST_MAN'인 직원 조회
select * from employees where job_id = 'IT_PROG' or job_id = 'ST_MAN';
select * from EMPLOYEES where JOB_ID in('IT_PROG', 'ST_MAN');

-- employees 테이블에서 manager_id가 null인 직원 조회
select * from EMPLOYEES where manager_id is null;

-- departments 테이블에서 manager_id가 null이 아닌 부서 조회
select * from DEPARTMENTS where manager_id is not null;

-- employees 테이블에서 job_id가 'AD로 시작하는 직원 조회
select * from EMPLOYEES where job_id like 'AD%';

-- employees 테이블의 first_name에서 'ni'를 포함하는 직원 조회
select * from EMPLOYEES where first_name like '%ni%';

select first_name, lower(first_name), upper(first_name), initcap(first_name)
from EMPLOYEES;

select job_id, substr(job_id,1,2) as str1, substr(job_id, 4) as str2
from EMPLOYEES;

select job_id, replace(job_id, 'MGR', 'MANAGER') from EMPLOYEES;

select job_id, replace(job_id, 'PROG', 'PROGRAMMER') from EMPLOYEES;

select first_name, last_name, concat(first_name, concat(' ', last_name)) from EMPLOYEES;

select first_name, length(first_name) from EMPLOYEES;

select first_name, instr(first_name , 'a') from EMPLOYEES;

select LPAD(first_name, 10,'*'), RPAD(first_name, 10,'*') from EMPLOYEES;

select job_id, ltrim(job_id, 'A'), rtrim(job_id, 'T') from EMPLOYEES;

select LENGTH(trim('   길동   ')), length(trim('어사  박 문 수')) from dual;

-- jobs 테이블에서 job_title과 소문자와 대문자로 변환한 job_title을 조회
select job_title, lower(job_title), upper(job_title) from jobs;

-- employees 테이블에서 first_name 첫 1문자와 last_name 조회
select substr(first_name,1,1) as name, last_name from EMPLOYEES;

-- employees 테이블에서 job_id가 'REP' 인 부분을 'REPRESENTATIVE'로 바꿔서 조회
select job_id, replace(job_id, 'REP','REPRESENTATIVE') from employees;

-- employees 테이블에서 first_name 첫 1 문자와 last_name을 중간에 공백을 두고 하나로 결합하여 조회
select concat(substr(first_name,1,1), concat(' ', last_name)) from EMPLOYEES;

-- employees 테이블에서 first_name 과 last_name의 길이를 합쳐서 조회
select length(first_name || last_name) from EMPLOYEES;

-- employees 테이블에서 job_id와 job_id에 'A' 문자 위치 조회
select instr(job_id, 'A') from EMPLOYEES;

-- locations 테이블의 city를 15자리 문자열로 바꾸고, 빈 공간을 '.'으로 표현하여 조회
select LPAD(city,15,'.') from LOCATIONS;

-- locations 테이블에서 city의 왼쪽부터 'S' 문자를 지운 것과 오른쪽부터 'e' 문자를 지운 결과를 조회
select LTRIM(city,'S'), RTRIM(city,'e') from LOCATIONS;

select ceil(12.345), floor(12.345), round(12.345,2), trunc(12.345,1), mod(12,5), power(3,3),
sqrt(9), sign(10), sign(0), sign(-5) from dual;

select sysdate, sysdate+1, sysdate+2 from dual;

select sysdate, MONTHS_BETWEEN(sysdate, hire_date) from EMPLOYEES where EMPLOYEE_ID = 100;

select hire_date, add_months(hire_date, 2), add_months(hire_date, -2) from EMPLOYEES;

select to_char(sysdate, 'CC AD Q') from dual;

select to_char(sysdate, 'yyyy/MON/dd') from dual;

select salary, to_char(salary, '099999') from EMPLOYEES;