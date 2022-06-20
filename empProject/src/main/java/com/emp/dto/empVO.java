package com.emp.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class empVO {
	private String id;
	private String pass;
	private String name;
	private String lev;
	private Timestamp enter;
 	private String gender;
	private String phone;
}
