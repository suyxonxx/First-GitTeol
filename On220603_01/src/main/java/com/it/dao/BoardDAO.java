package com.it.dao;

import java.util.*; //List
import java.sql.*; //Connection.PrepdaedStatment, ResultSet

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;

	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";

	// 드라이브 등록
	public BoardDAO() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 메모리 활당
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// MySql 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// MySql해제
	public void disConnection() {
		try {
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 1. 목록출력
	// 게시물 정보 한개 : BoardVO, 게시물 여러개 : (List)
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			// 1. 연결
			getConnection();
			// 2. SQL문장 작성
			int rowSize = 10;
			int start = (rowSize * page) - rowSize;
			// 10*1 - 10 = 0,10 ..... 10*2-10=10,10, 10*3-10=20,10....
			String sql = "select no, subject, name, DATE_FORMAT(regdate, '%Y-%m-%d'), hit " // 여기 한칸
					+ "from jspBoard order by no desc limit ?, ?";
			// 3. 전송
			ps = conn.prepareStatement(sql);
			// 4. 데이타 채우기
			ps.setInt(1, start);
			ps.setInt(2, rowSize);
			// 5. 데이타 실행
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
			// 6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	} //end of boardListData

	// 2. 총페이지()
	public int boardTotalPage() {
		int total = 0;

		try {

			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard";

			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				total = rs.getInt(1);
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return total;
	} //end of boardTotalPage
	
//	3. Insert(새글 입력)
	public void boardInsert(BoardVO vo) {
		try {
			getConnection();
			String sql = "insert into jspBoard(name, subject, content, pwd, regdate) "
						+"values(?, ?, ?, ?, now())";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	} //end of boardInsert
	
//	상세보기
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		
		try {
			getConnection();

//			조회수 증가시키기
			String sql = "update jspBoard set hit = hit + 1 " + "where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
			
			sql = "select no, name, subject, content, DATE_FORMAT(regdate, '%Y-%m-%d'), hit "
					+ "from jspBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return vo;
	} //end of boardDetailData
	
//	수정하기(Update)
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		
		try {
			getConnection();
			
			String sql = "select no, name, subject, content, DATE_FORMAT(regdate, '%Y-%m-%d'), hit "
					+ "from jspBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		return vo;
	} //end of boardUpdateData
	
	public boolean boardUpdate(BoardVO vo) {
		boolean chk = false;

		try {
			getConnection();
			
			String sql = "select pwd from jspBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ResultSet rs = ps.executeQuery();
			
			String chk_pwd = "";
			if(rs.next()) chk_pwd = rs.getString(1);
			rs.close();
			
			if(chk_pwd.equals(vo.getPwd())) {
				chk = true;
				sql = "update jspBoard set name = ?, subject = ?, content = ? where no = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setInt(4, vo.getNo());
				ps.executeUpdate();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return chk;
	} //end of boardUpdate
	
	public boolean boardDelete(int no, String pwd) {
		boolean chk = false;
		
		try {
			getConnection();
			
			String sql = "select pwd from jspBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			String chk_pwd = "";
			if(rs.next()) chk_pwd = rs.getString(1);
			rs.close();
			
			if(chk_pwd.equals(pwd)) {
				chk = true;
				sql = "delete from jspBoard where no = ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, no);
				ps.executeUpdate();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return chk;
	} //end of boardDelete
} //end of class BoardDAO