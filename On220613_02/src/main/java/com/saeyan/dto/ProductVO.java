package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;

/*CREATE TABLE PRODUCT(
    CODE NUMBER(5),
    NAME VARCHAR2(100),
    PRICE NUMBER(8),
    PICTUREURL VARCHAR(50),
    DESCRIPTION VARCHAR(1000),
    PRIMARY KEY(CODE)
);
*/
@Setter
@Getter
public class ProductVO {
	private Integer code;
	private String name;
	private Integer price;
	private String pictureurl;
	private String description;
}
