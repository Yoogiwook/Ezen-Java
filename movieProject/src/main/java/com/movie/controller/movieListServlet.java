package com.movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.movieDAO;
import com.movie.dto.movieVO;

@WebServlet("/movieList.do")
public class movieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		movieDAO dao = movieDAO.getInstance();
		List<movieVO> vo = dao.selectAllMovies();
		
		request.setAttribute("movieList", vo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("movie/movieList.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
