package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

@WebServlet("/join.do")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("member/join.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		MemberVO mVo = new MemberVO();
		mVo.setName(request.getParameter("name"));
		mVo.setUserid(request.getParameter("userid"));
		mVo.setPwd(request.getParameter("pwd"));
		mVo.setEmail(request.getParameter("email"));
		mVo.setPhone(request.getParameter("phone"));
		mVo.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result =  mDao.insertMember(mVo);
		
		HttpSession session = request.getSession();
		if(result == 1) {
			session.setAttribute("userid", mVo.getUserid());
			request.setAttribute("message", "회원가입에 성공했습니다.");
		}else if(result == -1) {
			request.setAttribute("message", "회원가입에 실패했습니다.");
		}
		RequestDispatcher dis = request.getRequestDispatcher("member/login.jsp");
		dis.forward(request, response);
				
	}

}
