package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--상품 테이블
CREATE TABLE MARKETBOARD(
   bo_num NUMBER PRIMARY KEY,
   bo_id VARCHAR2(30),
   bo_title VARCHAR2(100) NOT NULL,
   bo_nickname VARCHAR2(20),
   bo_price NUMBER NOT NULL,
   bo_content VARCHAR(2000) NOT NULL,
   bo_regdate DATE DEFAULT SYSDATE,
   bo_image VARCHAR2(2000),
   bo_count NUMBER DEFAULT 0,
   bo_heart NUMBER,
   bo_heartcount NUMBER,
   bo_category VARCHAR2(50),
   bo_address1 VARCHAR2(50) NOT NULL,-- 시군구
   bo_address2 VARCHAR2(30) NOT NULL, -- 동
   CONSTRAINT fk_board_id FOREIGN KEY (bo_id) REFERENCES MARKETUSER (us_id)
   ON DELETE CASCADE
);
 */

@Data
public class MarketBoardVO {
	
	private Long bo_num, bo_price, bo_count, bo_heart, bo_heartcount;
	private String bo_id, bo_title, bo_nickname, bo_image ,bo_content, bo_category, bo_address1, bo_address2;
	private Date bo_regdate;

}