package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	public BoardVO read(Long bno);
	
	/*1(≒true) 일때만 실행 가능하도록 반환타입을 int으로 처리.*/
	public int delete(Long bno);
	public int insert(BoardVO vo);
	public int insertSelectKey(BoardVO vo);
	public int update(BoardVO vo);
}
