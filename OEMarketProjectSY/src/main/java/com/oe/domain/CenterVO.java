package com.oe.domain;

import lombok.Data;

/*
CREATE TABLE CENTER(
	ce_id VARCHAR2(30),
	ce_num NUMBER PRIMARY KEY,
	ce_pass VARCHAR(40),
	ce_nickname VARCHAR2(20),
	ce_title VARCHAR2(100),
	ce_content VARCHAR2(2000),
	CONSTRAINT fk_center_id FOREIGN KEY (ce_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);
*/

@Data
public class CenterVO {
	private String ce_id;
	private Integer ce_num;
	private String ce_pass;
	private String ce_nickname;
	private String ce_title;
	private String ce_content;
}