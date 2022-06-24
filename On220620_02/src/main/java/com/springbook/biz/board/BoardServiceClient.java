package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
//		1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext12.xml");
//		2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup
		BoardService boardService = (BoardService)container.getBean("boardService");
		//3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목2");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용");
		
		boardService.insertBoard(vo);
		
		List<BoardVO> list = boardService.getBoardList(vo);
		for(BoardVO l : list) System.out.println(l);
		
		container.close();
	}
}
