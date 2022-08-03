package com.oe.mapper;

import java.util.List;

import com.oe.domain.DGVO;

public interface CrawlingMapper {
	
	public List<DGVO> getListCrawling();
	public int insert(DGVO vo);
	public void crawlingRemove();
}