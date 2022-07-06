package com.springbook.biz.board;

import lombok.Data;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private String searchCondition, searchKeyword;
	private MultipartFile uploadFile;
	
	@JsonIgnore
	public String getSearchCondition() {
		return searchCondition;
	}
	
	@JsonIgnore
	public String getSearchKeyword() {
		return searchKeyword;
	}
	
	@JsonIgnore
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
}
