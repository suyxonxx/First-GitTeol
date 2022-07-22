package org.zerock.domain;

import lombok.Data;

@Data
public class Criteria {
//	페이지 번호
	private int pageNum;
//	한 페이지 당 노출되는 데이터의 개수
	private int amount;
	
	private String type;
	private String keyword;
	
	public String[] getTypeArr() {
		return type == null ? new String[] {} : type.split("");
	}
	
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum  = pageNum;
		this.amount = amount;
	}
}