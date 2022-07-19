package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--상품 테이블
create table marketboard(
    bo_num number primary key,
    bo_title varchar2(100) not null,
    bo_nickname varchar2(20) unique,
    bo_price number not null,
    bo_content varchar(2000) not null,
    bo_image varchar2(500),
    bo_regdate date default sysdate,
    bo_count number default 0,
    bo_heart number,
    bo_heartcount number,
    bo_category varchar2(50),
    bo_address varchar2(100) not null,
    constraint fk_board_id foreign key (bo_num) references marketuser (us_id)
    on delete cascade
);
*/
@Data
public class MarketBoardVO {
	private int bo_num;
	private String bo_title;
	private String bo_nickname;
	private String bo_price;
	private String bo_content;
	private String bo_image;
	private Date bo_regdate;
	private int bo_count;
	private int bo_heart;
	private int bo_heartcount;
	private int bo_category;
	private int bo_address;
}
