package com.oe.mapper;

import java.util.List;

import com.oe.domain.HeartBoardVO;
import com.oe.domain.MarketBoardVO;

public interface HeartBoardMapper {
	public List<HeartBoardVO> readHB(String he_id);
	public List<MarketBoardVO> readMB(String he_id);
//	public int getTotalCount(String he_id);
	public void deleteHeart(HeartBoardVO vo);
}
