package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * create table product(
    code number(5),
    name varchar2(100),
    price number(8),
    picture1 varchar(50),
    description varchar(1000),
    primary key(code)
 */
@Getter
@Setter
@ToString
public class ProductVO {

	private Integer code;
	private String name;
	private Integer price;
	private String pictureUrl;
	private String description;
	
}
