package com.employees.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employees.dto.EmployeesVO;

import util.DBManager;

public class EmployeesDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private EmployeesDAO() {}
	
	private static EmployeesDAO instance = new EmployeesDAO();
	
	public static EmployeesDAO getInstance() {
		return instance;
	}
	
	public List<EmployeesVO> employeesList() {
		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		String sql = "SELECT * FROM EMPLOYEES";
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmployeesVO vo = new EmployeesVO();
				vo.setId(rs.getString("id"));
				vo.setPass(rs.getString("pass"));
				vo.setName(rs.getString("name"));
				vo.setLev(rs.getString("lev"));
				vo.setEnter(rs.getTimestamp("enter"));
				vo.setGender(rs.getString("gender"));
				vo.setPhone(rs.getString("phone"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	} //end of employeesList

	public void employeesInsert(EmployeesVO vo) {
		String sql = "INSERT INTO EMPLOYEES VALUES(?, ?, ?, ?, SYSDATE, ?, ?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of employeesInsert
	
	public EmployeesVO selectOneEmpById(String id) {
		EmployeesVO vo = new EmployeesVO();
		
		String sql = "SELECT * FROM EMPLOYEES WHERE ID=?";
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setPass(rs.getString("pass"));
				vo.setName(rs.getString("name"));
				vo.setLev(rs.getString("lev"));
				vo.setEnter(rs.getTimestamp("enter"));
				vo.setGender(rs.getString("gender"));
				vo.setPhone(rs.getString("phone"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return vo;
	} //end of selectOneEmpById
	
	public void employeesUpdate(EmployeesVO vo) {
		String sql = "UPDATE EMPLOYEES SET PASS=?, NAME=?, LEV=?, GENDER=?, PHONE=? WHERE ID=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPass());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getLev());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getPhone());
			pstmt.setString(6, vo.getId());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of employeesUpdate
	
	public void employeesDelete(String id) {
		String sql = "DELETE FROM EMPLOYEES WHERE ID=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeQuery();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of employeesDelete
} //end of class EmployeesDAO
