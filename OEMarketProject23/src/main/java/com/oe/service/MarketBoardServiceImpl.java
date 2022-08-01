package com.oe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oe.domain.DGVO;
import com.oe.domain.FileUploadVO;
import com.oe.domain.MarketBoardVO;
import com.oe.mapper.CrawlingMapper;
import com.oe.mapper.MarketBoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class MarketBoardServiceImpl implements MarketBoardService {

	private CrawlingMapper mapper;
	
	private MarketBoardMapper boardMapper;
	
	@Override
	public void register(DGVO vo) {
		log.info("등록 완료 ======================= ");
		mapper.insert(vo);
	}

	@Override
	public List<DGVO> getListCrawling() {
		log.info("getList============================");
		return mapper.getListCrawling();
	}

	@Override
	public void crawlingDelete() {
		log.info("crawlingDelete============================");
		mapper.crawlingRemove();
	}

	/*-- 새로운 상품 등록 --*/

	@Override
	public void register(MarketBoardVO vo) {
		boardMapper.insert(vo);
	}

	@Override
	public MarketBoardVO get(Long bo_num) {
		return null;
	}

	@Override
	public int modify(MarketBoardVO vo) {
		return 0;
	}

	@Override
	public int remove(Long bo_num) {
		return 0;
	}

	@Override
	public List<MarketBoardVO> getListBoard() {
		return boardMapper.getListBoard();
	}

	@Override
	public void fileUpload(FileUploadVO fvo) {
		boardMapper.insertFile(fvo);
	}
	
	

}