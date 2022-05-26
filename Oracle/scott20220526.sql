select * from emp;
select * from dept;
select * from SALGRADE;
select e.job, e.empno, e.ename, e.sal, e.deptno, d.dname from emp e, dept d 
where e.deptno = d.deptno and e.job = (select job from emp where ename = 'ALLEN');

select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade from emp e, dept d, salgrade s 
where d.DEPTNO = e.deptno and e.sal between s.losal and s.hisal and e.sal > (
select avg(sal) from emp) order by e.sal desc, e.empno;