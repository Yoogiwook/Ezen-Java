/* ���� ���� ����*/
select salary from EMPLOYEES where salary in (select max(salary) from EMPLOYEES group by department_id)
order by salary;

select salary from EMPLOYEES where salary not in (select max(salary) from EMPLOYEES group by department_id)
order by salary;

select * from EMPLOYEES where EXISTS(select * from EMPLOYEES where employee_id = 100);

select * from EMPLOYEES where salary <> any(6000,10000,12000);

select * from EMPLOYEES where salary < any( select salary from EMPLOYEES where hire_date > '08/01/01');

/*
 departments ���̺��� department_name�� 'IT' �� department_id�� ��ġ�ϴ� employees ���̺��� first_name,
 last_name, job_id, salary�� ��ȸ
*/
select * from DEPARTMENTS;
select * from EMPLOYEES;

select first_name, last_name, job_id, salary, department_id from EMPLOYEES where department_id = (
    select department_id from departments where department_name = 'IT');

/*
 locations ���̺��� state_province�� 'California'�� location_id �� ��ġ�ϴ� departments ���̺���
 department_id, department_name �� ��ȸ
*/
select department_id, department_name, location_id from departments where location_id = (
    select location_id from locations where state_province = 'California');
    
/*
 countries ���̺��� region_id �� 3�� country_id�� ���Ե� locations ���̺��� city, state_province,
 street_adderss �� ��ȸ
*/
select city, state_province, street_address, country_id from locations where country_id in (
    select country_id from countries where region_id = 3);