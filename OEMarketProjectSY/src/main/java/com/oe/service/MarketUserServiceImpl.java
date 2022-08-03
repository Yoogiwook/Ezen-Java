package com.oe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oe.domain.MarketUserVO;
import com.oe.mapper.MarketUserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class MarketUserServiceImpl implements MarketUserService{
	
	private MarketUserMapper usermapper;
	@Override
	public void register(MarketUserVO vo) {
		log.info("join====================");
		usermapper.joinUser(vo);
	}

	@Override
	public List<MarketUserVO> getList() {
		return null;
	}

	@Override
	public void modify(MarketUserVO vo) {
		log.info("update====================");
		usermapper.updateUser(vo);
	}

	@Override
	public void remove(String us_id) {
	}

	@Override
	public MarketUserVO get(String us_id) {
		log.info("get====================");
		return usermapper.readUser(us_id);
	}

	@Override
	public MarketUserVO userCheck(MarketUserVO vo) {
		log.info("userCheck===============");
		MarketUserVO uVO = usermapper.loginUser(vo);
		return uVO;
	}

	@Override
	public void findId(MarketUserVO vo) {
		log.info("findId===================");
		usermapper.findId(vo);
	}

	@Override
	public void findPass(MarketUserVO vo) {
		log.info("findPass===================");
		usermapper.findPass(vo);
	}

	@Override
	public void MyRegister(MarketUserVO vo) {
		log.info("joinMY================");
		usermapper.joinMypage(vo);
	}
	
	@Override
	public void modifyAdrr(MarketUserVO vo) {
		log.info("update====================");
		usermapper.updateAdrr(vo);
	}

	@Override
	public String checkID(String us_id) {
		log.info("checkID===================");
		return usermapper.checkID(us_id);
	}

	@Override
	public String checkNickname(String us_nickname) {
		log.info("checkNickname===================");
		return usermapper.checkNickname(us_nickname);
	}
	
	
}
