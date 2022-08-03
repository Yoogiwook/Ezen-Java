package com.oe.domain;

import lombok.Data;

/*
CREATE TABLE HEARTBOARD(
    he_bo_num NUMBER,
	he_id VARCHAR2(30),
	he_nickname VARCHAR2(30),
	he_title VARCHAR2(100),
	he_price NUMBER,
	he_seller VARCHAR2(30),
	CONSTRAINT fk_heart_id FOREIGN KEY (he_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE,
	CONSTRAINT fk_heart_bo_num FOREIGN KEY (he_bo_num) REFERENCES MARKETBOARD (bo_num)
	ON DELETE CASCADE
);
*/

@Data
public class HeartBoardVO {
	private Integer he_bo_num;
	private String he_id;
	private String he_nickname;
	private String he_title;
	private Integer he_price;
	private String he_seller;
}