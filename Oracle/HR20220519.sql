select count(first_name), count(*) from EMPLOYEES;

select sum(salary), avg(salary) from EMPLOYEES;

select max(salary), min(salary) from EMPLOYEES;

select stddev(salary), variance(salary) from EMPLOYEES;

select job_id, sum(salary), avg(salary) from EMPLOYEES group by job_id;

select job_id, sum(salary), avg(salary) from EMPLOYEES where department_id = 50 group by job_id;

select department_id, max(salary), min(salary) from EMPLOYEES group by department_id;

select department_id, max(salary), min(salary) from EMPLOYEES 
where hire_date > '20070101' group by department_id;

select country_id, count(country_id) from LOCATIONS group by country_id;

select job_id, department_id, sum(salary), avg(salary) from EMPLOYEES group by job_id, department_id;

select job_id, max(salary), min(salary) from EMPLOYEES group by job_id;

select manager_id, department_id, sum(salary), avg(salary) from EMPLOYEES 
where department_id = 50 group by manager_id, department_id order by manager_id;

select department_id, manager_id, job_id, max(salary), min(salary) from EMPLOYEES
group by department_id, manager_id, job_id order by manager_id, department_id desc;

select job_id, sum(salary), avg(salary) from EMPLOYEES group by job_id having avg(salary) > 10000;

select department_id, min(salary), max(salary) from EMPLOYEES group by department_id 
having max(salary) > 7000 order by max(salary);

select country_id, count(country_id) from LOCATIONS group by country_id having count(country_id) >2;

select job_id, department_id, sum(salary), avg(salary) from EMPLOYEES
where department_id between 50 and 99 group by job_id, department_id having avg(salary) > 9000
order by avg(salary);

select manager_id, department_id, job_id, sum(salary), avg(salary), max(salary) from EMPLOYEES
where manager_id in(100, 101) group by manager_id, department_id, job_id
having sum(salary) between 10000 and 40000 order by sum(salary);

-- employees 테이블에서 salary가 8000이상인 직원의 수를 조회
select count(*) from EMPLOYEES where salary > 8000;

-- employees 테이블에서 hire_date가 2007년 1월 1일 이후인 직원의 수 조회
select count(*) from EMPLOYEES where hire_date > '20070101';

-- jobs 테이블에서 max_salary 값의 합계와 평균을 조회
select * from jobs;
select sum(max_salary), avg(max_salary) from jobs;

-- employees 테이블에서 job_id가 'IT_PROG'인 직원의 salary 합계와 평균을 조회
select * from EMPLOYEES;
select sum(salary), avg(salary) from EMPLOYEES where job_id = 'IT_PROG';

/* 
employees 테이블에서 hire_date 값이 2004년 1월 1일부터 2006년 12월 31일 사이의 데이터를 job_id 기준으로
그룹화 한 뒤에 job_id와 salary 최솟값과 최대값을 조회
*/
select job_id, min(salary), max(salary) from EMPLOYEES where hire_date
between '20040101' and '20061231' group by job_id;

/*
employees 테이블에서 department_id가 50과 80인 데이터를 department_id와 job_id 기준으로 그룹화 한 뒤에
department_id와 job_id, salary 합계, 최솟값, 최대값을 job_id 기준으로 정렬하여 조회
*/
select department_id, job_id, sum(salary), min(salary), max(salary) from EMPLOYEES 
where department_id in(50,80) group by department_id, job_id order by job_id;

/*
employees 테이블에서 department_id와 job_id 기준으로 그룹화한 뒤에 salary 평균값이 12000이상인 데이터만
department_id와 job_id, salary 최솟값, 최대값, 평균을 department_id 기준으로 정렬하여 조회
*/
select department_id, job_id, min(salary), max(salary), avg(salary) from EMPLOYEES
group by department_id, job_id having avg(salary) >= 12000 order by department_id;

select department_name, nvl(manager_id, 100) from departments;

select nvl(state_province, 'None') from locations order by state_province;

select department_name, nvl2(manager_id, '관리자', '무') from departments;

select min_salary, decode(min_salary, 2500, min_salary*1.1, min_salary) from jobs;

select min_salary, 
    case 
        when min_salary <4000 then min_salary*1.2
        when min_salary between 4000 and 6000 then min_salary*1.1
        else min_salary
    end as 최소급여변경
from jobs;

select first_name, salary,
    rank() over(order by salary desc) as rank
from EMPLOYEES;

select first_name, salary,
    rank() over(order by salary desc) as rank,
    dense_rank() over(order by salary desc) as dense_rank
from EMPLOYEES;

select first_name, salary,
    rank() over(order by salary desc) as rank,
    dense_rank() over(order by salary desc) as dense_rank,
    row_number() over(order by salary desc) as row_rank
from EMPLOYEES;
