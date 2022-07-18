package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		log.info("--------------------------------------");
		log.info(mapper.getList());
//		for(BoardVO vo : mapper.getList()) log.info(vo);
	}
	
	@Test
	public void testRead() {
		log.info("--------------------------------------");
		log.info(mapper.read(6L));
	}
	
	@Test
	public void testDelete() {
		log.info("--------------------------------------");
		log.info(mapper.delete(7L));
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("springspring");
		vo.setContent("springspringspring");
		vo.setWriter("spring");
		log.info("--------------------------------------");
		log.info(mapper.insert(vo));
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("springspring");
		vo.setContent("springspringspring");
		vo.setWriter("spring");
		log.info("--------------------------------------");
		log.info(mapper.insertSelectKey(vo));
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(9L);
		vo.setTitle("스프링");
		vo.setContent("스프링링");
		vo.setWriter("스프");
		log.info("--------------------------------------");
		log.info(mapper.update(vo));
	}
	
	@Test 
	public void testGetListWithPagging() {
		Criteria cri = new Criteria();
		cri.setPageNum(3);
		cri.setAmount(10);
		List<BoardVO> list = mapper.getListWithPagging(cri);
		log.info(list);
	}
}
