package com.employees.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employees.dao.EmployeesDAO;
import com.employees.dto.EmployeesVO;

public class WriteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeesVO vo = new  EmployeesVO();
		
		vo.setId(request.getParameter("id"));
		vo.setPass(request.getParameter("pass"));
		vo.setName(request.getParameter("name"));
		vo.setLev(request.getParameter("lev"));
		vo.setGender(request.getParameter("gender"));
		vo.setPhone(request.getParameter("phone"));
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		dao.employeesInsert(vo);
		new ListAction().execute(request, response);
	}
}
