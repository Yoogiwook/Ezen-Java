package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("-------------------");
		log.info("info1 : " + timeMapper.getClass().getName());
		log.info("info2 : " + timeMapper.getTime());
	}
	@Test
	public void testGetTime2() {
		log.info("-------------------");
		log.info("info1 : " + timeMapper.getClass().getName());
		log.info("getTime2 : " + timeMapper.getTime2());
	}
}
