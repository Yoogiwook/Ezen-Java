package com.ezen.market.OEM;

import java.io.File;
import java.sql.Date;

import lombok.Data;

/*
 create table marketuser(
 	  num number,
	  id varchar2(30) primary key,
	  pass varchar2(40) not null,
	  uname varchar2(20) not null,
	  nickname varchar2(20) UNIQUE,
	  birth char(8), -- 생년월일 (YYYYMMDD)
	  email varchar2(30) UNIQUE,
	  address varchar2(100) not null,
	  phone char(13) not null,
	  profile varchar2(500), -- 프로필 사진
	  udate date -- 가입일자
	  admin number default 1 -- 관리자 0, 일반 회원 1
);
 * */
@Data
public class OEMarketUserVO {
	private int num;
	private String id;
	private String pass;
	private String uname;
	private String nickname;
	private String birth;
	private String email;
	private String address;
	private String phone;
	private File profile;
	private Date udate;
	private int admin;
}
