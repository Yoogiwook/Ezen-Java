package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
create table crawlingTest(
    no number,
    title varchar2(100),
    content varchar2(500),
    poster varchar2(500),
    address varchar2(500),
    heart varchar2(500),
    price varchar2(500),
    category varchar2(500),
    regdate DATE default sysdate 
);
alter table crawlingTest add CONSTRAINT pk_crawlingTest PRIMARY key(no);
select * from CRAWLINGTEST;
 
*/


@Data
public class DGVO {
	
	private int no;
	private String title, content, poster, address, price, heart, category;
	private Date regdate;

}