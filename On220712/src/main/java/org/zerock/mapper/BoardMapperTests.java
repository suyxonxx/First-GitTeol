package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.zerock.domain.BoardVO;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board->log.info(board));
//		아래의 for문과 위의 식은 같은 역할을 함.
//		for(BoardVO vo : mapper.getList()) {
//			log.info(vo);
//		}
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제모옥");
		vo.setContent("내요옹");
		vo.setWriter("글쓴이");
		mapper.insert(vo);
		log.info("INSERT >>>>> " + vo);
	}
	
	@Test
	public void testSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제모오옥");
		vo.setContent("내요오옹");
		vo.setWriter("글쓰은이");
		mapper.insertSelectKey(vo);
		log.info("SELECT KEY >>>>> " + vo);
	}
	
	@Test
	public void testRead() {
		BoardVO vo = mapper.read(29L);
		log.info("READ >>>>> " + vo);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE >>>>> " + mapper.delete(28L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(30L);
		vo.setTitle("훙야");
		vo.setContent("뿡야");
		vo.setWriter("쿵야");
		mapper.update(vo);
		log.info("UPDATE >>>>> " + vo);
	}
}
