package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
CREATE TABLE WITHDRAWAL (
	wd_id VARCHAR2(30),
	wd_reason VARCHAR2(200), --탈퇴사유
	wd_remark VARCHAR2(2000), --하고싶은말
	wd_date DATE DEFAULT SYSDATE,
	CONSTRAINT fk_withdrawal_id FOREIGN KEY (wd_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);
*/

@Data
public class WithdrawalVO {
	private String wd_id;
	private String wd_reason;
	private String wd_remark;
	private Date wd_date;
}
