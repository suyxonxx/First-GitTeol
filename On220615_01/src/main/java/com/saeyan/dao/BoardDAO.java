package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private BoardDAO() {}
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {
		String sql = "SELECT * FROM BOARD ORDER BY NUM DESC";
		ResultSet rs = null;
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO bvo = new BoardVO();
				bvo.setNum(rs.getInt("num"));
				bvo.setPass(rs.getString("pass"));
				bvo.setName(rs.getString("name"));
				bvo.setEmail(rs.getString("email"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContent(rs.getString("content"));
				bvo.setReadcount(rs.getInt("readcount"));
				bvo.setWritedate(rs.getTimestamp("writedate"));
				list.add(bvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	} //end of selectAllBoards

	public boolean insertBoard(BoardVO bvo) {
		boolean flag = false;
		String sql = "INSERT INTO BOARD(NUM, NAME, EMAIL, PASS, TITLE, CONTENT) "
				+ "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bvo.getName());
			pstmt.setString(2, bvo.getEmail());
			pstmt.setString(3, bvo.getPass());
			pstmt.setString(4, bvo.getTitle());
			pstmt.setString(5, bvo.getContent());
			pstmt.executeUpdate();
			flag = true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return flag;
	} //end of insertBoard
	
	public void updateReadCount(String num) {
		String sql = "UPDATE BOARD SET READCOUNT=READCOUNT+1 WHERE NUM=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of updateReadCount
	
	public BoardVO selectOneBoardByNum(String num) {
		String sql = "SELECT * FROM BOARD WHERE NUM=?";
		BoardVO bvo = new BoardVO();
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bvo.setNum(rs.getInt("num"));
				bvo.setPass(rs.getString("pass"));
				bvo.setName(rs.getString("name"));
				bvo.setEmail(rs.getString("email"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContent(rs.getString("content"));
				bvo.setReadcount(rs.getInt("readcount"));
				bvo.setWritedate(rs.getTimestamp("writedate"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return bvo;
	} //end of selectOneBoardByNum
	
	public void updateBoard(BoardVO bvo) {
		String sql = "UPDATE BOARD SET NAME=?, PASS=?, EMAIL=?, TITLE=?, CONTENT=? WHERE NUM=?";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bvo.getName());
			pstmt.setString(2, bvo.getEmail());
			pstmt.setString(3, bvo.getPass());
			pstmt.setString(4, bvo.getTitle());
			pstmt.setString(5, bvo.getContent());
			pstmt.setInt(6, bvo.getNum());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of updateBoard

	public void deleteBoard(String num) {
		String sql = "DELETE FROM BOARD WHERE NUM=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeQuery();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	} //end of deleteBoard
} //end of class BoardDAO
