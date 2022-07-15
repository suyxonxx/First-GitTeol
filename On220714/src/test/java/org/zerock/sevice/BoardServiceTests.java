package org.zerock.sevice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;
	
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("뿡");
		vo.setContent("빵");
		vo.setWriter("뽕");
		service.register(vo);
		log.info("생성된 게시글의 번호 : " + vo.getBno());
	}
	
	@Test
	public void testRead() {
		service.get(24L);
		log.info("검색된 데이터 : " + service.get(24L));
	}
	
	@Test
	public void testDelete() {
		log.info("삭제된 데이터 갯수 : " + service.remove(25L));
	}
}
