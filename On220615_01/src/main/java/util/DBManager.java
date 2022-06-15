package util;

import java.sql.*;
import javax.naming.*;
import javax.sql.DataSource;

public class DBManager {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
//			jdbc/myoracle이란 이름을 객체를 찾아서 DataSource가 받는다.
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
//			ds가 생성되었으므로 Connection을 구한다.
			conn = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	} //end of getConnection
	
//	select 작업을 수행한 후 리소스 해제를 위한 메서드
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	insert, update, delete 작업을 수행한 후 리소스 해제를 위한 메서드
	public static void close(Connection conn, Statement stmt) {
		try {
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
} //end of class DBManager
