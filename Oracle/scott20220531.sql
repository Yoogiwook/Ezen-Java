create table member(
    name varchar2(10) not null,
    userid varchar2(10),
    pwd varchar2(10) not null,
    email varchar2(20),
    phone char(13),
    admin number(1) DEFAULT 0,
    PRIMARY key(userid)
);

desc member;

insert into member(name, userid, pwd, email, phone, admin)
values ('ÀÌ¼Ò¹Ì','somi','1234','gmd@naver.com','010-2362-5157',0);
insert into member(name, userid, pwd, email, phone, admin)
values ('ÇÏ»ó¿À','sang12','1234','ha12@naver.com','010-5629-8888',1);
insert into member(name, userid, pwd, email, phone, admin)
values ('±èÀ±½Â','light','1234','youn1004@naver.com','010-9999-8282',0);

insert into member(name, userid, pwd)
values ('È«±æµ¿', 'hong', '1234');
select * from member;

commit;

update member set phone='011-765-4321' where userid='somi';

alter table member modify(name varchar(20));

create table employee(
    name varchar2(20),
    address varchar2(100),
    ssn varchar2(15)
    );
    
insert into employee values('duke', 'seoul','970224-1039234');
insert into employee values('pororo','pusan','001222-1038782');
insert into employee values('candy','daejeon','981221/1829192');

select * from employee;

commit;

create table item(
    name varchar2(20),
    price number(8),
    description varchar2(100)
    );

commit;

select * from item;



create table emp_ddl(
    empno number(4),
    ename varchar2(10),
    job varchar2(9),
    mgr number(4),
    hiredate date,
    sal number(7,2),
    comm number(7,2),
    detpno number(2)
    );
    
desc emp_ddl;
select * from emp_ddl;

create table dept_ddl as select * from dept;
select * from dept_ddl;

create table emp_ddl_30 as select * from emp where deptno=30;
select * from emp_ddl_30;

create table empdept_ddl as
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc
from emp e, dept d where 1 <> 1;

desc empdept_ddl;

create table emp_alter as select * from emp;

select * from emp_alter;

alter table emp_alter add hp varchar2(20);

alter table emp_alter rename column hp to tel;

alter table emp_alter modify empno number(5);

alter table emp_alter drop column tel;4

desc emp_alter;

rename emp_alter to emp_rename;

select * from emp_rename;

delete from emp_rename;

desc emp_rename;
rollback;

truncate table emp_rename;

drop table emp_rename;