package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.movie.dto.MovieVO;

import util.DBManager;

public class MovieDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	private MovieDAO() {}
	private static MovieDAO instance = new MovieDAO();
	public static MovieDAO getInstance() {return instance;}
	
	public List<MovieVO> movieList_All() {
		List<MovieVO> list = new ArrayList<MovieVO>();
		String sql = "SELECT * FROM MOVIE ORDER BY CODE DESC";
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MovieVO vo = new MovieVO();
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setDirector(rs.getString("director"));
				vo.setActor(rs.getString("actor"));
				vo.setPoster(rs.getString("poster"));
				vo.setSynopsis(rs.getString("synopsis"));
				list.add(vo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	} //end of movieList
	
	public int movieInsert(MovieVO vo) {
		int result = 0;
		String sql = "INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getDirector());
			pstmt.setString(4, vo.getActor());
			pstmt.setString(5, vo.getPoster());
			pstmt.setString(6, vo.getSynopsis());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	} //end of movieInsert
	
	public MovieVO selectMovieByCode(String code) {
		String sql = "SELECT * FROM MOVIE WHERE CODE=?";
		MovieVO vo = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new MovieVO();
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setDirector(rs.getString("director"));
				vo.setActor(rs.getString("actor"));
				vo.setPoster(rs.getString("poster"));
				vo.setSynopsis(rs.getString("synopsis"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return vo;
	} //end of selectMovieByCode
	
	public int movieUpdate(MovieVO vo) {
		int result = 0;
		String sql = "UPDATE MOVIE SET TITLE=?, PRICE=?, DIRECTOR=?, ACTOR=?, POSTER=?, SYNOPSIS=? WHERE CODE=?";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getDirector());
			pstmt.setString(4, vo.getActor());
			pstmt.setString(5, vo.getPoster());
			pstmt.setString(6, vo.getSynopsis());
			pstmt.setInt(7, vo.getCode());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	} //end of movieUpdate
	
	public void movieDelete(String code) {
		String sql = "DELETE FROM MOVIE WHERE CODE=?";
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
	} //end of movieDelete
} //end of class MovieDAO