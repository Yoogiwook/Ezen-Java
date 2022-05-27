desc emp;
desc dept;
desc salgrade;
desc bonus;
select * from dept;
select * from emp;
select * from salgrade;
select E.job, E.empno, E.ename, E.sal, E.deptno, D.dname from emp E, dept D 
    where E.deptno = D.deptno and job = (select job from emp where ename='ALLEN');

select E.empno, E.ename, D.dname, E.hiredate, D.loc, E.sal, G.grade from emp E, dept D, salgrade G
    where E.deptno = D.deptno and E.sal between G.losal and G.hisal and E.sal > (
    select avg(sal) from emp) order by E.sal desc, E.empno;
    
select E.empno, E.ename, E.job, E.deptno, D.dname, D.loc from emp E, dept D
    where E.deptno = D.deptno and E.deptno = 10 and job not in (
    select job from emp where deptno=30);
-- 다중행 함수 사용 안한것
select E.empno, E.ename, E.sal, G.grade from emp E, salgrade G where E.sal between G.losal and G.hisal and sal > ( 
    select max(sal) from emp where job = 'SALESMAN') order by empno;
-- 다중행 함수 사용 한것
select E.empno, E.ename, E.sal, G.grade from emp E, salgrade G where E.sal between G.losal and G.hisal and sal > all ( 
    select sal from emp where job = 'SALESMAN') order by empno;

select D.deptno, D.dname, E.empno, E.ename, E.sal from dept D, emp E where E.DEPTNO = D.DEPTNO and sal > 2000;

select E.deptno, dname, trunc(avg(sal)) as AVG_SAL, max(sal) as MAX_SAL, min(sal) as MIN_SAL, count(sal) as CNT
    from dept D, emp E where E.DEPTNO = D.DEPTNO group by E.deptno, dname;
    
select D.deptno, D.dname, E.empno, E.ename, E.job, E.sal from dept D, emp E where E.DEPTNO(+) = D.DEPTNO order by d.deptno, ename;

select D.deptno, D.dname,E.empno, E.ename, E.mgr, E.sal, D.deptno as deptno_1, G.losal, G.hisal, G.grade, m.empno as mgr_empno, m.ename as mgr_ename 
    from DEPT D, EMP E, SALGRADE G, emp m where E.DEPTNO(+) = D.DEPTNO and E.sal between G.losal(+) and G.hisal(+) and e.mgr = m.empno(+) order by D.deptno, E.empno;