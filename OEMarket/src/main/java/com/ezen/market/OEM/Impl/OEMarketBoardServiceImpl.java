package com.ezen.market.OEM.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.market.OEM.OEMarketBoardService;
import com.ezen.market.OEM.OEMarketBoardVO;


@Service("boardService")
public class OEMarketBoardServiceImpl implements OEMarketBoardService{
	@Autowired
	private OEMarketDAO boardDAO;

	@Override
	public void insertBoard(OEMarketBoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(OEMarketBoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(OEMarketBoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public OEMarketBoardVO getBoard(OEMarketBoardVO vo) {
		return boardDAO.getBoard(vo);
		
	}

	@Override
	public List<OEMarketBoardVO> getBoardList(OEMarketBoardVO vo) {
		return boardDAO.getBoardList(vo);
	
	}
}