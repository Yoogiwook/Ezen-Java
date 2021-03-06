package com.saeyan.dto;

import java.sql.Timestamp;

import lombok.Data;

/*
create table board(
    num number(5) primary key,
    pass varchar2(30),
    name varchar2(30),
    email varchar2(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate
);
 * */
@Data
public class BoardVO {
 private Integer num;
 private String pass;
 private String name;
 private String email;
 private String title;
 private String content;
 private Integer readcount;
 private Timestamp writedate;
 
}
