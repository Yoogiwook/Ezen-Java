package org.zerock.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private int total;
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
							// ceil -> 소숫점 있으면 무조건 올림 해주는것 11.1->12 / 11.9->12
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) * 10;
		this.startPage = endPage-9;
									//1.0 곱한 이유는 소숫점 만들기 위해 정수/정수의 결과는 정수가 나와서
		int realEnd = (int)(Math.ceil(total*1.0)/cri.getAmount());
		
		if(endPage > realEnd) {
			endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
