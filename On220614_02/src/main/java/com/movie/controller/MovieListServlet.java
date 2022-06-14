package com.movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieVO;
import java.util.*;

@WebServlet("/movieList.do")
public class MovieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieDAO dao = MovieDAO.getInstance();
		
		List<MovieVO> movieList = dao.movieList_All();
		request.setAttribute("movieList", movieList);
		
		RequestDispatcher dis = request.getRequestDispatcher("jsp/movieList.jsp");
		dis.forward(request, response);
	}
}
