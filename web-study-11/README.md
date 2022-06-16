****환경****
1. window 11
2. sts(Version: 3.9.17.RELEASE)
3. tomcat 9.0
4. oracle 11g
5. lombok(1.18.24.jar)
6. jstl.jar
7. standard.jar
8. ojdbc6.jar
9. cos.jar



****DB****
create table board(
    num number(5) primary key,
    pass varchar2(30),
    name varchar2(30),
    email varchar2(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate
);

create sequence board_seq start with 1 INCREMENT by 1;

insert into board(num, name, email, pass, title, content) values(BOARD_SEQ.NEXTVAL,
'성윤정', 'pinksung@nate.com', '1234', '첫방문', '반갑습니다.');
insert into board(num, name, email, pass, title, content) values(BOARD_SEQ.NEXTVAL,
'성윤정', 'pinksung@nate.com', '1234', '김밥', '맛있어요.');
insert into board(num, name, email, pass, title, content) values(BOARD_SEQ.NEXTVAL,
'전수빈', 'raccon@nate.com', '3333', '고등애', '일식입니다.');
insert into board(num, name, email, pass, title, content) values(BOARD_SEQ.NEXTVAL,
'전원지', 'one@nate.com', '4444', '갯골마을', '돼지삼겹살이 맛있습니다.');

commit;

****특징****
DBCP : 
<Resource name="jdbc/myoracle" auth="Container"
			type="javax.sql.DataSource"
			driverClassName="oracle.jdbc.OracleDriver"
			url="jdbc:oracle:thin:@127.0.0.1:1521:XE" username="scott"
			password="tiger" maxTotal="20" maxIdle="10" maxWaitMillis="-1" />