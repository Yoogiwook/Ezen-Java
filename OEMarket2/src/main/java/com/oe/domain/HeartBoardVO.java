package com.oe.domain;

import lombok.Data;

/*
--찜목록
create table heartboard(
    he_id varchar2(30),
    he_title varchar2(100),
    he_price number,
    he_seller varchar2(30),
    constraint fk_heart_id foreign key (he_id) references mypage (my_nickname)
    on delete cascade
);
*/
@Data
public class HeartBoardVO {
	private String he_id;
	private String he_title;
	private int he_price;
	private String he_seller;
}
