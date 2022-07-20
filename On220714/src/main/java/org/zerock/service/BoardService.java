package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	public void register(BoardVO vo);
	public BoardVO get(Long bnos);
	public int modify(BoardVO vo);
	public int remove(Long bno);
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
