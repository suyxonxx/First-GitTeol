package com.shopmanager.dao;

import java.util.*;
import java.sql.*;
import javax.sql.*;

public class ShopDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	private final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private final String USERNAME = "system";
	private final String PASSWORD = "1234";
	
//	드라이버 등록 및 연결
	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection (URL, USERNAME, PASSWORD);
		} catch(Exception e) {
			e.printStackTrace();
		}
	} //end of getConnection
	
	public void disConnection() {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} //end of disConnection
	
	public void shopInsert(ShopVO vo) {
		try {
			getConnection();
			String sql = "INSERT INTO MEMBER_TBL_02 (CUSTNO, CUSTNAME, PHONE, ADDRESS, JOINDATE, GRADE, CITY) "
					+"VALUES(?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getCustno());
			pstmt.setString(2, vo.getCustname());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getAddress());
			pstmt.setString(5, vo.getJoindate());
			pstmt.setString(6, vo.getGrade());
			pstmt.setString(7, vo.getCity());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	} //end of shopInsert
	
	public int seqCustno(ShopVO vo) {
		String sql = "SELECT MAX(CUSTNO) FROM MEMBER_TBL_02";
		int custno = 100001;
		ResultSet rs = null;
		try {
			getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) custno = rs.getInt(1) + 1;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return custno;
	} //end of seqCustno

	public void shopUpdate(ShopVO vo) {
		try {
			getConnection();
			String sql = "UPDATE MEMBER_TBL_02 SET CUSTNAME=?, PHONE=?, ADDRESS=?, JOINDATE=?, GRADE=?, CITY=? "
					+"WHERE CUSTNO=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustname());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getJoindate());
			pstmt.setString(5, vo.getGrade());
			pstmt.setString(6, vo.getCity());
			pstmt.setInt(7, vo.getCustno());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	} //end of shopUpdate
} //end of class shopmanagerDAO
