package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceimpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;
//	private LogAdvice log;
	
//	public BoardServiceimpl() {
//		log = new LogAdvice();
//	}
	
	@Override
	public void insertBoard(BoardVO vo) {
//		log.printLog();
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(vo);
	}
	
	@Override
	public void updateBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.updateBoard(vo);
	}
	
	@Override
	public void deleteBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.deleteBoard(vo);
	}
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoard(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoardList(vo);
	}
}
