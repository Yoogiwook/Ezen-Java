package com.oe.service;

import java.util.List;

import com.oe.domain.HeartBoardVO;
import com.oe.domain.MarketBoardVO;

public interface HeartBoardService {
	public List<HeartBoardVO> getListHB(String he_id);
	public List<MarketBoardVO> getListMB(String he_id);
//	public int getTotal(String he_id);
	public void removeHeart(HeartBoardVO vo);
}
