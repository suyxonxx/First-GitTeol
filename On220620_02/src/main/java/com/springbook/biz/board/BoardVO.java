package com.springbook.biz.board;

import java.sql.Date;

import lombok.Data;

/*
CREATE TABLE BOARD(
	SEQ NUMBER(5) PRIMARY KEY,
	TITLE VARCHAR2(200),
	WRITER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REGDATE DATE DEFAULT SYSDATE,
	CNT NUMBER(5) DEFAULT 0
);
*/

@Data
public class BoardVO {
	private int seq, cnt;
	private String title, writer, content;
	private Date regdate;
}
