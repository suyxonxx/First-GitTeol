package com.it.dao;

import java.util.*; //List
import java.sql.*; //Connection, PreparedStatement, ResultSet

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";
	
//	드라이버 등록
	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 메모리 할당
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	MySQL 연결
	public void getConnection() {
		try {
			DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	연결 해제
	public void disConnection() {
		try {
			if(conn != null) conn.close();
			if(ps != null) ps.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	1. 목록 출력
//	게시물 정보가 한개일때 : BoardVO, 여러개일때 : (List)
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
//			1. 연결
			getConnection();
//			2. SQL 문장 작성
			int rowSize = 10;
			int start = rowSize * (page - 1);
			String sql = "select no, subject, name, DATE_FORMAT(regdate, %Y - %m - %d), hit" +
						 "from jspBoard order by no desc limit ?, ?";
//			3. 전송
			conn.prepareStatement(sql);
//			4.데이터 채우기
			ps.setInt(1, start);
			ps.setInt(2, rowSize);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				
				vo.setNo(rs.getInt(1)); //= vo.setNo(rs.getInt("no");
				vo.setSubject(rs.getString(2)); //= vo.setSubject(rs.getString("subject"));
				vo.setName(rs.getString(3)); //= vo.setName(rs.getString("name")); ...
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				
				list.add(vo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
//	총 페이지
	public int boardTotalPage() {
		int total = 0;
		
		try {
			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard";
			
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			rs.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return total;
	}
}
