package com.emp.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.empDAO;
import com.emp.dto.empVO;

public class empListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<empVO> list = new ArrayList<empVO>();
		empDAO dao = empDAO.getInstance();
		String url = "emp/empList.jsp";
		list = dao.selectAllemps();
		
		request.setAttribute("emplist", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
