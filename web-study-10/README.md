WEB-STUDY-10

사용 환경
0. WINDOWS OS
1. STS tool(Version: 3.9.17.RELEASE)
2. Oracle 11g
3. jdk(Version : 11)
4. 인코딩 UTF-8
5. GIT 활용
6. jstl.jar
7. ojbdc5.jar
8. standard.jar
9. cos.jar(version:cos-22.05.zip)
10. lombok-1.18.24.jar

--DBCP--
<Resource name="jdbc/myoracle" auth="Container"
  type="javax.sql.DataSource" driverClassName="oracle.jdbc.OracleDriver"
  url="jdbc:oracle:thin:@127.0.0.1:1521:XE"
  username="scott" password="tiger" maxTotal="20" maxIdle="10"
  maxWaitMillis="-1"/>
			              
			              
			              

MYSQL테이블 생성 및 데이타 입력
create table product(
    code number(5),
    name varchar2(100),
    price number(8),
    picture1 varchar(50),
    description varchar(1000),
    primary key(code)
);

create sequence product_seq start with 1 INCREMENT by 1;

insert into product values(product_seq.nextval, '개념을 콕콕 잡아주는 데이터베이스', 27000, 'db.jpg', '데이터베이스에 관한 모든 것을 쉽고 재미있게 정리한 교재...');
insert into product values(product_seq.nextval, '웹표준을 위한 HTML5', 25000, 'html5.jpg', 'HTML5 가이드북. 홈페이지 제작을 위한 필수 선택 HTML 기본 문법...');
insert into product values(product_seq.nextval, 'Dynamic Programming book 시리즈-01 오라클 11g + PL/SQL', 25000, 'oracle.jpg','Dynamic 실무 코칭 프로그래밍 Book의 첫번째 책으로, 오라클 11g의 새로운 ...');
insert into product values(product_seq.nextval, 'Visual C++ MFC 윈도우 프로그래밍', 26000, 'mfc.jpg', 'Visual C++를 처음 시작하는 독자의 눈높이에 맞춘 Visual C++...');
insert into product values(product_seq.nextval, 'jQuery and jQuery Mobile : 이해하기 쉽게 풀어쓴', 25000, 'jquery.jpg', '소스 하나로 데스크탑과 모바일까지 HTML5와 함께 사용한다. 초보자들도 ...');

* 특징
11. cos.jar (version: cos-22.05.zip)을 통한 파일 upload