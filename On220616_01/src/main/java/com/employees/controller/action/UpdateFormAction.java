package com.employees.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employees.dao.EmployeesDAO;
import com.employees.dto.EmployeesVO;

public class UpdateFormAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/employees/employeesUpdate.jsp";
		
		String id = request.getParameter("id");
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		
		EmployeesVO vo = dao.selectOneEmpById(id);
		
		request.setAttribute("employees", vo);
		
		request.getRequestDispatcher(url).forward(request, response);
	}
}
