package com.oe.domain;

import lombok.Data;

/*
--고객센터
create table center(
    ce_num number primary key,
    ce_pass varchar(40),
    ce_nickname varchar2(20),
    ce_title varchar2(100),
    ce_content varchar2(2000),
    ce_id varchar2(30)
);
*/
@Data
public class CenterVO {
	private int ce_num;
	private String ce_pass;
	private String ce_nickname;
	private String ce_title;
	private String ce_content;
	private String ce_id;
}
