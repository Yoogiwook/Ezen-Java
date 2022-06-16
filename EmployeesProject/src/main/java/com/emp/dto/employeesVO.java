package com.emp.dto;

import java.sql.Timestamp;

import lombok.Data;

/*
 create table employees(
    id varchar2(10) not null primary key,
    pass varchar2(10) not null,
    name varchar2(24),
    lev char(1) default 'A',
    enter date default sysdate,
    gender char(1) default '1',
    phone varchar2(30)
); 
 */

@Data
public class employeesVO {
	private String id;
	private String pass;
	private String name;
	private String lev;
	private Timestamp enter;
	private String gender;
	private String phone;
}
