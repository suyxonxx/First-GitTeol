package com.saeyan.dto;

import java.sql.*;
import lombok.Data;

/*
CREATE TABLE BOARD (
    NUM NUMBER(5) PRIMARY KEY,
    PASS VARCHAR2(30),
    NAME VARCHAR2(30),
    EMAIL VARCHAR2(30),
    TITLE VARCHAR2(50),
    CONTENT VARCHAR2(1000),
    READCOUNT NUMBER(4) DEFAULT 0,
    WRITEDATE DATE DEFAULT SYSDATE
);
*/

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
