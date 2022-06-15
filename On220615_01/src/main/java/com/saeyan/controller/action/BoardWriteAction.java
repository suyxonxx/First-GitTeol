package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardWriteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO bvo = new BoardVO();
		
		bvo.setName(request.getParameter("name"));
		bvo.setPass(request.getParameter("pass"));
		bvo.setEmail(request.getParameter("email"));
		bvo.setTitle(request.getParameter("title"));
		bvo.setContent(request.getParameter("content"));
		
		BoardDAO bdao = BoardDAO.getInstance();
		boolean flag = bdao.insertBoard(bvo);
		
		if(flag == true) {
			new BoardListAction().execute(request, response);
		} else {
			response.sendRedirect("/BoardServlet?command=board_write_form");
		}
	}
}
