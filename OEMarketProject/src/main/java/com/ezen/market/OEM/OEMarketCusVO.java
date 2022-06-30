package com.ezen.market.OEM;

import lombok.Data;

/*
create table customercenter(
    num number,
    id varchar2(30) primary key,
    pass varchar2(40) not null,
    name varchar2(20) not null,
    title varchar2(100) not null,
    content varchar2(2000) not null
);
*/
@Data
public class OEMarketCusVO {
	private int num;
	private String id;
	private String pass;
	private String name;
	private String title;
	private String content;
}
