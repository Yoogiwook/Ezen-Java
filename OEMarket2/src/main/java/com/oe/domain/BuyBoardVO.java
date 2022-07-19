package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--구매내역
create table buyboard(
    buy_id varchar2(30),
    buy_title varchar2(100),
    buy_price number,
    buy_seller varchar2(30),
    buy_buydate default sysdate,
    constraint fk_buy_id foreign key (buy_id) references mypage (my_nickname)
    on delete cascade
);
*/
@Data
public class BuyBoardVO {
	private String buy_id;
	private String buy_title;
	private int buy_price;
	private String buy_seller;
	private Date buy_buydate;
}
