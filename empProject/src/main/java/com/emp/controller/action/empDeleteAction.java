package com.emp.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.empDAO;

public class empDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		empDAO dao = empDAO.getInstance();
		dao.empDelete(id);
		
		new empListFormAction().execute(request, response);
	}

}
