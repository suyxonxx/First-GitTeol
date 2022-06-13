package com.shopmanager.dao;

import java.util.*;
import java.sql.*;
import javax.sql.*;

public class ShopDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

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
	
	public List<ShopVO> shopList() {
		List<ShopVO> list = new ArrayList<ShopVO>();
		
		try {
			getConnection();
			String sql = "SELECT * FROM MEMBER_TBL_02 ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ShopVO vo = new ShopVO();
				
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6));
				vo.setCity(rs.getString(7));
				
				list.add(vo);
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	} //end of shopList
	
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
		try {
			getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) custno = rs.getInt(1) + 1;
			rs.close();
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
	
	public ShopVO ShopUpdateData(int custno) {
		ShopVO vo = new ShopVO();
		
		try {
			getConnection();
			String sql = "SELECT CUSTNO, CUSTNAME, PHONE, ADDRESS, JOINDATE, GRADE, CITY "
					+"FROM MEMBER_TBL_02 WHERE CUSTNO=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6));
				vo.setCity(rs.getString(7));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return vo;
	} //end of ShopUpdateData
	
	public List<ShopVO> moneyList() {
		List<ShopVO> list = new ArrayList<ShopVO>();
		
		try {
			getConnection();
			String sql = "SELECT MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE, SUM(MON.PRICE) "
					+ "FROM MEMBER_TBL_02 MEM, MONEY_TBL_02 MON "
					+ "WHERE MEM.CUSTNO = MON.CUSTNO "
					+ "GROUP BY MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE "
					+ "ORDER BY SUM(MON.PRICE) DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ShopVO vo = new ShopVO();
				
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setGrade(rs.getString(3));
				vo.setPrice(rs.getInt(4));
				
				list.add(vo);
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	} //end of moneyList
	
	public List<ShopVO> searchList(String type, String search) {
		List<ShopVO> list = new ArrayList<ShopVO>();
		ShopVO vo = new ShopVO();
		try {
			getConnection();
			String sql = null;
			if(type.equalsIgnoreCase("custno")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE CUSTNO LIKE ?";
			else if(type.equalsIgnoreCase("custname")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE CUSTNAME LIKE ?";
			else if(type.equalsIgnoreCase("phone")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE PHONE LIKE ?";
			else if(type.equalsIgnoreCase("address")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE ADDRESS LIKE ?";
			else if(type.equalsIgnoreCase("joindate")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE JOINDATE LIKE ?";
			else if(type.equalsIgnoreCase("grade")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE GRADE LIKE ?";
			else if(type.equalsIgnoreCase("city")) sql = "SELECT * FROM MEMBER_TBL_02 WHERE CITY LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "'%" + search + "%'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new ShopVO();
				
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6));
				vo.setCity(rs.getString(7));
				
				list.add(vo);
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	} // end of searchList
} //end of class shopmanagerDAO
