-- countires ���̺��� �÷��� country_id�� ����id, country_name�� ���������� ��ȸ
select country_id as ����ID, country_name as ������ from countries;

-- countries ���̺��� region_id�� �ߺ� �����ϰ� ��ȸ
select distinct REGION_ID from countries;

-- jobs ���̺��� job_title, min_salary, max_salary �÷��� �ּҿ����� �ִ뿬����
-- 10% �λ�� ���·� ��ȸ
select job_title, min_salary*1.1 as �ּҿ���, max_salary*1.1 as �ִ뿬�� from jobs;

-- employees ���̺��� first_name�� 'David' �� ���� ��ȸ
select * from EMPLOYEES where first_name = 'David';

-- jobs ���̺��� �ּ� ������ 8000 �ʰ��� ���� ��ȸ
select job_title from jobs where MIN_SALARY > 8000;

-- jobs ���̺��� �ּ� ������ 4000 �̻��̰� �ִ� ������ 10000 ������ ���� ��ȸ
select job_title from jobs where MIN_SALARY >= 4000 and MAX_SALARY <= 10000;

-- employees ���̺��� job_id�� 'IT_PROG'�̸鼭 salary�� 5000 �ʰ��� ���� ��ȸ
select * from EMPLOYEES where job_id = 'IT_PROG' and salary > 5000;

-- between >> �� ���� ������ �ش��ϴ� �����͸� ����� �� ���Ǵ� Ȯ�� ������
select * from EMPLOYEES where EMPLOYEE_ID BETWEEN 120 and 130;
select * from EMPLOYEES where EMPLOYEE_ID >= 120 and EMPLOYEE_ID <=130;
-- �� �� ������ ���� ����

-- in ������ > () �ȿ� �Էµ� ���ڿ� �ش��ϴ� �����͸� ���
select * from EMPLOYEES where FIRST_NAME in('Steven', 'John', 'Peter', 'Payam');
select * from COUNTRIES where COUNTRY_ID in('US', 'IL', 'SG');
select * from COUNTRIES where COUNTRY_ID not in('US', 'IL', 'SG');

-- is null >> �����Ͱ� null ���� �����͸� ��� 
select * from EMPLOYEES where COMMISSION_PCT is null;
select * from EMPLOYEES where COMMISSION_PCT is not null;

-- like ������ >> ���ڿ� �Ӽ����� �κ������� ��ġ�ϴ� �����͸� ��� �� �� ���
-- % > 0�� �̻��� ����(������ ����� ������ ��� ����)
-- _ > 1���� ����
-- Like 'data%' >> data�� �����ϴ� ���ڿ�
-- Like '%data' >> data�� ������ ���ڿ�
-- Like '%data%' >> data�� ���� �� ���ڿ�
-- Like 'data____'( _ 4��) >> data�� �����ϴ� 8�� ���ڿ�
-- Like '____data'( _ 4��) >> data�� ������ 8�� ���ڿ�
select * from LOCATIONS where CITY like 'South%';
select * from LOCATIONS where STREET_ADDRESS like '%St';
select * from LOCATIONS where city like 'South____';

