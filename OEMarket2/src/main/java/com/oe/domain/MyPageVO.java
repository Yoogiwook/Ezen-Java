package com.oe.domain;

import lombok.Data;

/*
--마이페이지
create table mypage(
    my_id varchar2(30),
    my_image varchar2(500),
    my_intro varchar2(1000),
    my_nickname varchar2(20) unique,
    constraint fk_my_id foreign key (my_id) references marketuser (us_id)
    on delete cascade
);
 */
@Data
public class MyPageVO {
	private String my_id;
	private String my_image;
	private String my_intro;
	private String my_nickname;
}
