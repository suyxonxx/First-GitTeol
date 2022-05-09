import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
	private Connection con; //mySQL 연결
	private PreparedStatement pstmt; // SQL 문장 전송
	
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	
//	드라이버 등록 : 한 번만 등록하면 됨.
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("된건가?");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "1234"); //경로, ID, PW
			System.out.println("아아아 된건가?");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	연결 해제 (자원 회수)
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	정보 가져오기
	public void mydbListData() {
		try {
//			1. 연결
			getConnection();
//			2. SQL 문장 작성
			String sql = "select * from member";
//			3. mySQL로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
//			4. 실행결과 받아오기
			ResultSet rs = pstmt.executeQuery(); //executeQuery : db 값 조회
//			5. 결과 출력
//			no integer auto_increment,
//		    name varchar(34) not null,
//		    sex varchar(10) not null,
//		    content text,
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + 
									rs.getString(2) + ", " +
									rs.getString(3) + ", " +
									rs.getString(4) + " ");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	추가(Insert)
	public void mydbInsert(int no, String name, String sex, String content) {
		try {
//			1. db 연결
			getConnection();
//			2. SQL 문장 작성
			String sql = "insert into member(no, name, sex, content)"
						+"values(?, ?, ?, ?)";
//			3. MySQL로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
//			4. ?, ?, ?, ?에 값 채우기
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setString(4, content);
//			5. 실행
			pstmt.executeUpdate(); //executeUpdate : db 값 변경
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	수정
	public void mydbUpdate(int no, String name, String sex, String content) {
		try {
			getConnection();
			String sql = "update member set name=?, sex=?, content=?"
						+"where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, sex);
			pstmt.setString(3, content);
			pstmt.setInt(4, no);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	삭제
	public void mydbDelete(int no) {
		try {
			getConnection();
			String sql = "delete from member where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	검색
	public void mydbSelect(int no) {
		try {
			getConnection();
			String sql = "select * from member where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			ResultSet rs = pstmt.executeQuery();
			
//			하나만 불러오면 되므로, while문 돌릴 필요 X
			rs.next();
			System.out.println(rs.getInt(1) + ", " + 
							rs.getString(2) + ", " +
							rs.getString(3) + ", " +
							rs.getString(4) + " ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public static void main(String[] args) {
		Database db = new Database();
		db.getConnection();
		System.out.println("-------------------------------");
		
//		db.mydbInsert(2, "허준", "남자", "동의보감 사상체질");
//		db.mydbListData();
		
		db.mydbUpdate(12, "안용복", "남성", "독도는 우리땅");
		db.mydbListData();
		
//		db.mydbDelete(2);
//		db.mydbListData();
		
		db.mydbSelect(1);
	}
}
