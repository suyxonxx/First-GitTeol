package com.employees.dto;

import java.sql.Timestamp;

import lombok.Data;

/*
CREATE TABLE EMPLOYEES (
    ID VARCHAR2(10) NOT NULL,
    PASS VARCHAR2(10) NOT NULL,
    NAME VARCHAR2(24),
    LEV CHAR(1) DEFAULT 'A',
    ENTER DATE DEFAULT SYSDATE,
    GENDER CHAR(1) DEFAULT '1',
    PHONE VARCHAR2(30),
    PRIMARY KEY(ID)
);
*/

@Data
public class EmployeesVO {
	private String id;
	private String pass;
	private String name;
	private String lev;
	private Timestamp enter;
	private String gender;
	private String phone;
}
