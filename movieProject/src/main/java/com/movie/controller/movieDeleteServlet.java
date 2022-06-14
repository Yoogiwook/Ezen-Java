package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.movieDAO;
import com.movie.dto.movieVO;

@WebServlet("/movieDelete.do")
public class movieDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		
		movieDAO dao = movieDAO.getInstance();
		movieVO vo = dao.deleteMovie(code);
		
		request.setAttribute("movie", vo);
		response.sendRedirect("movieList.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
