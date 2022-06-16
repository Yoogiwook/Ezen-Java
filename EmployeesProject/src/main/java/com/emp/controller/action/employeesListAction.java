package com.emp.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.employeesDAO;
import com.emp.dto.employeesVO;

public class employeesListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employees/employeesList.jsp";
		employeesDAO dao = employeesDAO.getInstance();
		List<employeesVO> emplist = dao.selectAllemployees();
		
		request.setAttribute("emplist", emplist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
