package com.movie.dto;

import lombok.Data;

@Data
public class movieVO {
	private Integer code;
	private String title;
	private Integer price;
	private String director;
	private String actor;
	private String poster;
	private String synopsis;
}
