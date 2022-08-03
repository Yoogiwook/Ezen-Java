package com.oe.mapper;

import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;

public interface MyPageMapper {
	public MyPageVO readMyPage(String my_id);
	public void updateMyPage(MyPageVO vo);
	public void deleteMember(MyPageVO vo);
	public MarketUserVO readMarketUser(String my_id);
	public int readCountHB(String my_id);
	public void updateNick_marketuser(MyPageVO vo);
	public void updateNick_marketboard(MyPageVO vo);
	public void updateNick_buyboard(MyPageVO vo);
	public void updateNick_sellboard(MyPageVO vo);
	public void updateNick_heartboard(MyPageVO vo);
	public void updateNick_center(MyPageVO vo);
	public void updatePreWithdrawal(MyPageVO vo);
	public void insertWithdrawal(MyPageVO vo);
}
