package com.oe.service;

import java.util.List;

import com.oe.domain.MarketUserVO;

public interface MarketUserService {
	
	public void register(MarketUserVO vo);//회원가입
	public MarketUserVO get(String us_id); //마이페이지, 관리자페이지
	public List<MarketUserVO> getList();// 관리자페이지
	public void modify(MarketUserVO vo); //마이페이지, 관리자페이지
	public void remove(String us_id);// 마이페이지, 관리자페이지
	public MarketUserVO userCheck(MarketUserVO vo);
	public void findId(MarketUserVO vo);
	public void findPass(MarketUserVO vo);
	public void MyRegister(MarketUserVO vo);//회원가입(마이페이지테이블) 
	public void modifyAdrr(MarketUserVO vo);// 개인정보수정 시 해당 유저의 상품 주소 바뀌도록
	public String checkID(String us_id);
	public String checkNickname(String us_nickname);
}
