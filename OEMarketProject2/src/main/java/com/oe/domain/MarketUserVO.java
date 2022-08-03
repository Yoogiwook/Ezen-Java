package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--유저테이블
create table marketuser(
    us_num number,
    us_id varchar2(30) primary key,
    us_pass varchar2(40) not null,
    us_name varchar2(20) not null,
    us_nickname varchar2(20) unique,
    us_birth char(8),
    us_email varchar2(30),
    us_gender varchar2(8), --남성(male), 여성(female)
    us_address varchar2(100) not null,
    us_phone char(13) not null,
    us_joindate date default sysdate,
    us_grade number(1) default 1 -- 관리자(0), 일반회원(1)
);
*/
@Data
public class MarketUserVO {
	private int us_num;
	private String us_id;
	private String us_pass;
	private String us_name;
	private String us_nickname;
	private String us_birth;
	private String us_email;
	private String us_gender;
	private String us_address1;
	private String us_address2;
	private String us_phone;
	private Date us_joindate;
	private String us_grade;
}