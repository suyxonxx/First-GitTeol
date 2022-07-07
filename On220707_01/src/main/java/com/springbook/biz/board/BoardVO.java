package com.springbook.biz.board;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

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

public class BoardVO {
	private int seq, cnt;
	private String title, writer, content;
	private Date regdate;
	private String searchCondition, searchKeyword;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	private MultipartFile uploadFile;

//	@JsonIgnore
//	public String getSearchCondition() {
//		return searchCondition;
//	}
//	
//	@JsonIgnore
//	public String getSearchKeyword() {
//		return searchKeyword;
//	}
//	
//	@JsonIgnore
//	public MultipartFile getUploadFile() {
//		return uploadFile;
//	}
	
	@Override
	public String toString() {
		return "BoardVO [seq = " + seq + ", title = " + title
				+ ", writer = " + writer + ", content = " + content
				+ ", regdate = " + regdate + ", cnt = " + cnt + "]";
	}
}
