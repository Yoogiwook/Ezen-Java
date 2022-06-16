1. window 11
2. sts(Version: 3.9.17.RELEASE)
3. tomcat 9.0
4. oracle 11g
5. lombok(1.18.24.jar)
6. jstl.jar
7. standard.jar
8. ojdbc6.jar

****DB****
create table employees(
    id varchar2(10) not null primary key,
    pass varchar2(10) not null,
    name varchar2(24),
    lev char(1) default 'A',
    enter date default sysdate,
    gender char(1) default '1',
    phone varchar2(30)
);

insert into employees values('pinksung','3333','성윤정','A','20140417','2','010-2222-2222');
insert into employees values('subin','1234','전원지','B','20140417','1','010-9999-9999');
insert into employees values('admin','1111','정운영','A','20140417','1','010-1111-1111');

commit;


****특징****
DBCP : 
<Resource name="jdbc/myoracle" auth="Container"
			type="javax.sql.DataSource"
			driverClassName="oracle.jdbc.OracleDriver"
			url="jdbc:oracle:thin:@127.0.0.1:1521:XE" username="scott"
			password="tiger" maxTotal="20" maxIdle="10" maxWaitMillis="-1" />