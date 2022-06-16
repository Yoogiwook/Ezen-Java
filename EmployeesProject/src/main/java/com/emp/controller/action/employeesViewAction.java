package com.emp.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.employeesDAO;
import com.emp.dto.employeesVO;

public class employeesViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employees/employeesView.jsp";
		String name = request.getParameter("name");
		
		employeesDAO dao = employeesDAO.getInstance();
		employeesVO vo =  dao.selectOneByName(name);
		request.setAttribute("emp", vo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
