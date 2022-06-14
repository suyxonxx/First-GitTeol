package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

import com.saeyan.dto.ProductVO;

public class ProductDAO {
//	싱글톤 객체 생성
	private ProductDAO() {}
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
//	c Read u d
	public List<ProductVO> selectAllProducts() {
//		최근 등록한 상품 먼저 출력하기
		String sql = "SELECT * FROM PRODUCT ORDER BY CODE DESC";
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setCode(rs.getInt("code"));
				pvo.setName(rs.getString("name"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setPictureurl(rs.getString("pictureurl"));
				pvo.setDescription(rs.getString("description"));
				list.add(pvo);
			} //end of while
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	} //end of selectAllProducts
	
//	Create r u d
	public int insertProduct(ProductVO pvo) {
		int result = 0;
		String sql = "INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pvo.getName());
			pstmt.setInt(2, pvo.getPrice());
			pstmt.setString(3, pvo.getPictureurl());
			pstmt.setString(4, pvo.getDescription());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	} //end of insertProduct
	
	public ProductVO selectProductByCode(String code) {
		String sql = "SELECT * FROM PRODUCT WHERE CODE=?";
		ProductVO pvo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pvo = new ProductVO();
				pvo.setCode(rs.getInt("code"));
				pvo.setName(rs.getString("name"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setPictureurl(rs.getString("pictureurl"));
				pvo.setDescription(rs.getString("description"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return pvo;
	} //end of selectProductByCode
	
//	c r Update d
	public int updateProduct(ProductVO pvo) {
		int result = 0;
		String sql = "UPDATE PRODUCT SET NAME=?, PRICE=?, PICTUREURL=?, DESCRIPTION=? WHERE CODE=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pvo.getName());
			pstmt.setInt(2, pvo.getPrice());
			pstmt.setString(3, pvo.getPictureurl());
			pstmt.setString(4, pvo.getDescription());
			pstmt.setInt(5, pvo.getCode());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	} //end of updateProduct
	
//	c r u Delete
	public void deleteProduct(String code) {
		String sql = "DELETE FROM PRODUCT WHERE CODE=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
	} //end of deleteProduct
} //end of class ProductDAO
