package com.movie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieVO;

@WebServlet("/movieDelete.do")
public class MovieDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		MovieDAO dao = MovieDAO.getInstance();
		MovieVO vo = dao.selectMovieByCode(code);
		
		request.setAttribute("movie", vo);
		request.getRequestDispatcher("jsp/movieDelete.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String code = request.getParameter("code");
		MovieDAO dao = MovieDAO.getInstance();
		
		dao.movieDelete(code);
		response.sendRedirect("movieList.do");
	}
}
