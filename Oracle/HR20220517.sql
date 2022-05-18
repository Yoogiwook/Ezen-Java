-- countires 테이블에서 컬럼명 country_id를 국가id, country_name을 국가명으로 조회
select country_id as 국가ID, country_name as 국가명 from countries;

-- countries 테이블에서 region_id를 중복 제거하고 조회
select distinct REGION_ID from countries;

-- jobs 테이블에서 job_title, min_salary, max_salary 컬럼을 최소연봉과 최대연봉을
-- 10% 인상된 상태로 조회
select job_title, min_salary*1.1 as 최소연봉, max_salary*1.1 as 최대연봉 from jobs;

-- employees 테이블에서 first_name이 'David' 인 직원 조회
select * from EMPLOYEES where first_name = 'David';

-- jobs 테이블에서 최소 월급이 8000 초과인 직업 조회
select job_title from jobs where MIN_SALARY > 8000;

-- jobs 테이블에서 최소 월급이 4000 이상이고 최대 월급이 10000 이하인 직업 조회
select job_title from jobs where MIN_SALARY >= 4000 and MAX_SALARY <= 10000;

-- employees 테이블에서 job_id가 'IT_PROG'이면서 salary가 5000 초과인 직원 조회
select * from EMPLOYEES where job_id = 'IT_PROG' and salary > 5000;

-- between >> 두 값의 범위에 해당하는 데이터만 출력할 때 사용되는 확장 연산자
select * from EMPLOYEES where EMPLOYEE_ID BETWEEN 120 and 130;
select * from EMPLOYEES where EMPLOYEE_ID >= 120 and EMPLOYEE_ID <=130;
-- 위 두 문장은 같은 문장

-- in 연산자 > () 안에 입력된 문자에 해당하는 데이터만 출력
select * from EMPLOYEES where FIRST_NAME in('Steven', 'John', 'Peter', 'Payam');
select * from COUNTRIES where COUNTRY_ID in('US', 'IL', 'SG');
select * from COUNTRIES where COUNTRY_ID not in('US', 'IL', 'SG');

-- is null >> 데이터가 null 값인 데이터만 출력 
select * from EMPLOYEES where COMMISSION_PCT is null;
select * from EMPLOYEES where COMMISSION_PCT is not null;

-- like 연산자 >> 문자열 속성에서 부분적으로 일치하는 데이터만 출력 할 때 사용
-- % > 0개 이상의 문자(문자의 내용과 갯수는 상관 없음)
-- _ > 1개의 문자
-- Like 'data%' >> data로 시작하는 문자열
-- Like '%data' >> data로 끝나는 문자열
-- Like '%data%' >> data가 포함 된 문자열
-- Like 'data____'( _ 4개) >> data로 시작하는 8개 문자열
-- Like '____data'( _ 4개) >> data로 끝나는 8개 문자열
select * from LOCATIONS where CITY like 'South%';
select * from LOCATIONS where STREET_ADDRESS like '%St';
select * from LOCATIONS where city like 'South____';

