select * from EMPLOYEES;
select * from DEPARTMENTS;

/* īƼ�� �� : ��� �࿡ ���ؼ� ����*/
select * from EMPLOYEES, DEPARTMENTS;
/* �������� : �����ϴ� ���̺��� ���� ������ ��ġ�ϴ� �͸� ��ȸ >> ���� ���� */
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

/* �ܺ����� : �����ϴ� ���̺��� ���� ������ �������� �ʴ� �൵ ��� �������� ������ ��������
���ϰ� ������ ���� ����� �� ��� */
select * from jobs j, job_history h where j.job_id = h.job_id(+);

select * from countries c, locations l where c.country_id = l.country_id(+);

select a.first_name, a.last_name, b.first_name, b.last_name from EMPLOYEES a, EMPLOYEES b 
where a.manager_id = b.EMPLOYEE_ID;

select * from EMPLOYEES;

/* 
 courtries ���̺�� locations ���̺��� country_id �� �������� �����Ͽ� country_name, state_province, 
 street_address�� ��ȸ
*/
select * from countries;
select * from LOCATIONS;
select C.country_name, L.state_province, L.street_address from COUNTRIES C, LOCATIONS L 
where L.COUNTRY_ID = C.COUNTRY_ID;

/*
 jobs ���̺�� job_history ���̺��� job_id�� �������� �����Ͽ� job_id, job_title, start_date,
 end_date �� ��ȸ
*/
select * from jobs;
select J.job_id, J.job_title, JH.start_date, JH.end_date from jobs J, job_history JH 
where JH.JOB_ID = J.JOB_ID;

/*
 employees ���̺�� departments ���̺��� department_id �������� �����ϰ�, employees ���̺�� 
 jobs ���̺��� job_id �������� �����Ͽ� first_name, last_name, department_name, job_title�� ��ȸ
*/
select * from EMPLOYEES;
select E.first_name, E.last_name, D.department_name, J.job_title 
from EMPLOYEES E, DEPARTMENTS D, JOBS J 
where E.job_id = J.job_id and E.DEPARTMENT_ID = D.DEPARTMENT_ID;

/*
 countries ���̺�� locations ���̺��� locations�� country_id�� �������� �ܺ� �����Ͽ� country_id,
 country_name, city �� ��ȸ
*/
select * from COUNTRIES;
select * from LOCATIONS;
select C.COUNTRY_ID, C.COUNTRY_NAME, L.CITY from COUNTRIES C, LOCATIONS L 
where L.COUNTRY_ID(+) = C.COUNTRY_ID;

