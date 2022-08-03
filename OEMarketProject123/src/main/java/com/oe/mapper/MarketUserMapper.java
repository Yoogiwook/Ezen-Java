package com.oe.mapper;

import com.oe.domain.MarketUserVO;

public interface MarketUserMapper {
	
	public void joinUser(MarketUserVO vo);
	public void updateUser(MarketUserVO vo);
	public MarketUserVO readUser(String us_id);
	public MarketUserVO loginUser(MarketUserVO vo);
	public void findId(MarketUserVO vo);
	public void findPass(MarketUserVO vo);
	public void joinMypage(MarketUserVO vo);
	public void updateAdrr(MarketUserVO vo);
	public String checkID(String us_id);
	public String checkNickname(String us_nickname);
}
