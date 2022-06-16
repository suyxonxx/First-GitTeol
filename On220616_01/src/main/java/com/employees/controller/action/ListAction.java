package com.employees.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employees.dao.EmployeesDAO;
import com.employees.dto.EmployeesVO;

public class ListAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/employees/employeesList.jsp";
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		
		List<EmployeesVO> empList = dao.employeesList();
		
		request.setAttribute("empList", empList);
		
		request.getRequestDispatcher(url).forward(request, response);
	}
}
