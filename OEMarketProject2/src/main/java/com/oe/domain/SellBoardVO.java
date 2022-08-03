package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
CREATE TABLE SELLBOARD(
	sel_id VARCHAR2(30),
	sel_nickname VARCHAR2(30),
	sel_title VARCHAR2(100),
	sel_price NUMBER,
	sel_buyer VARCHAR2(30),
	sel_selldate DATE DEFAULT SYSDATE,
	CONSTRAINT fk_sell_id FOREIGN KEY (sel_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);
*/

@Data
public class SellBoardVO {
	private String sel_id;
	private String sel_nickname;
	private String sel_title;
	private Integer sel_price;
	private String sel_buyer;
	private Date sel_selldate;
}