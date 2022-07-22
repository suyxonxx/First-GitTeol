package org.zerock.domain;

import lombok.Data;

@Data
public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private int total;
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
//		①  ②  ③  ④  ⑤  ⑥  ⑦  ⑧  ⑨  ⑩  >  >>
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = endPage - 9;
		
		int readEnd = (int)(Math.ceil(total * 1.0) / cri.getAmount());
		
		if(endPage > readEnd) {
			endPage = readEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < readEnd;
	}
}
