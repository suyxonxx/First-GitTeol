package com.movie.dto;

import lombok.Data;

/*
	CREATE TABLE MOVIE (
		CODE NUMBER(4) PRIMARY KEY,
		TITLE VARCHAR2(50) NOT NULL,
		PRICE NUMBER(10),
		DIRECTOR VARCHAR2(20),
		ACTOR VARCHAR2(20),
		POSTER VARCHAR2(100),
		SYNOPSIS VARCHAR2(3000)
	);
 */

@Data
public class MovieVO {
	private Integer code;
	private String title;
	private Integer price;
	private String director;
	private String actor;
	private String poster;
	private String synopsis;
}
