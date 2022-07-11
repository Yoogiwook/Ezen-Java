package com.ezen.market.OEM;

import java.util.List;

public interface OEMarketBoardService {
	
	void insertBoard(OEMarketBoardVO vo);

	void updateBoard(OEMarketBoardVO vo);

	void deleteBoard(OEMarketBoardVO vo);

	OEMarketBoardVO getBoard(OEMarketBoardVO vo);

	List<OEMarketBoardVO> getBoardList(OEMarketBoardVO vo);

}