package com.springbook.biz.user;

import lombok.Data;

/*
CREATE TABLE USERS(
	ID VARCHAR2(8) PRIMARY KEY,
	PASSWORD VARCHAR2(8),
	NAME VARCHAR2(20),
	ROLE VARCHAR2(5)
);
*/

@Data
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
}
