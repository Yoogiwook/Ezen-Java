package com.ezen.market.OEM;

import java.io.File;
import java.sql.Date;

import lombok.Data;

/*
create table marketboard(
    num number,
    id varchar2(30) primary key,
    pass varchar2(40) not null,
    name varchar2(20) not null,
    title varchar2(100) not null,
    price number not null,
    content varchar2(2000) not null,
    image varchar2(500), -- 상품 사진
    bdate date, -- 글 작성 일자
    count number,
    heart number -- 찜하기
);
 */
@Data
public class OEMarketBoardVO {
	private int num;
	private String id;
	private String pass;
	private String name;
	private String title;
	private int price;
	private String content;
	private File image;
	private Date bdate;
	private int count;
	private int heart;
}
