package com.oe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oe.domain.HeartBoardVO;
import com.oe.domain.MarketBoardVO;
import com.oe.mapper.HeartBoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class HeartBoardServiceImpl implements HeartBoardService {
	private HeartBoardMapper mapper;
	
	@Override
	public List<HeartBoardVO> getListHB(String he_id) {
		log.info("getListHB--------------------------");
		return mapper.readHB(he_id);
	}
	
	@Override
	public List<MarketBoardVO> getListMB(String he_id) {
		log.info("getListHB--------------------------");
		return mapper.readMB(he_id);
	}
	
//	@Override
//	public int getTotal(String he_id) {
//		log.info("getTotal---------------------------");
//		return mapper.getTotalCount(he_id);
//	}
	
	@Override
	public void removeHeart(HeartBoardVO vo) {
		log.info("removeHeart------------------------");
		mapper.deleteHeart(vo);
	}
}
