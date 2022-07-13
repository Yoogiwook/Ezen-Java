package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceImplTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testregister() {
		log.info("testregister-----------------");
		BoardVO vo = new BoardVO();
		vo.setTitle("test");
		vo.setContent("testtesttest");
		vo.setWriter("tester");
		service.register(vo);
	}
	
	@Test
	public void testread() {
		log.info("testread-------------------------------");
		service.get(5L);
	}
	
	@Test
	public void testgetList() {
		log.info("testgetList-------------------------------");
		service.getList();
	}

	@Test
	public void testremove() {
		log.info("testremove---------------------");
		log.info(service.remove(10L));
	}
	
	@Test
	public void testmodify() {
		log.info("testmodify----------------------");
		BoardVO vo = new BoardVO();
		vo.setBno(5L);
		vo.setTitle("test2");
		vo.setContent("testtesttest2");
		vo.setWriter("tester2");
		service.modify(vo);
	}
	
	
}
