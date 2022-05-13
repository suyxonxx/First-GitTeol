package groupProject;

import java.sql.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SqlSoup {
	private Connection con; // mySQL 연결
	private PreparedStatement pstmt; // SQL 문장 전송
	
	private final String URL = "jdbc:mysql://localhost:3306/naverCrolling?serverTimezone=UTC";
	
//	드라이버 등록
	public SqlSoup() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "1234"); //경로, ID, PW
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
			String sql = "select * from elements";
			
//			3. mySQL로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
			
//			4. 실행결과 받아오기
			ResultSet rs = pstmt.executeQuery(); //executeQuery : db 값 조회
			
//			5. 결과 출력
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + 
									rs.getString(2) + ", " +
									rs.getString(3) + ", ");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	추가(Insert)
	public void mydbInsert(int no, String title, String content) {
		try {
//			1. db 연결
			getConnection();
//			2. SQL 문장 작성
			String sql = "insert into elements(no, title, content)"
						+"values(?, ?, ?)";
//			3. MySQL로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
			
//			4. values(?, ?, ?)에 값 채우기
			pstmt.setInt(1, no);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			
//			5. 실행
			pstmt.executeUpdate(); //executeUpdate : db 값 변경
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public static void main(String[] args) {
//		1. db 연결
		SqlSoup db = new SqlSoup();
		db.getConnection();
		
//		2. 크롤링(crawling) 및 데이터 입출력
		int pages = 5;
		int index = 0;
		
		try {
			for(int i = 1; i < pages; i++) {
				String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20220502&page=" + i;
				
				Document doc = Jsoup.connect(url).get();
				Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
				Element element = elements.get(0);
				Elements photoElements = element.getElementsByAttributeValue("class", "photo");
				
				for(int j = 0; j < photoElements.size(); j++) {		
//					1차 필터링
					Element articleElement = photoElements.get(j);
//					System.out.println(articleElement);
					
//					2차 필터링
					Elements aElements = articleElement.select("a");
					Element aElement = aElements.get(0);
//					System.out.println(aElements);
					
//					기사들의 링크만 추출
					String newsUrl = aElement.attr("href");
//					System.out.println(newsUrl);
					
//					기사에 첨부된 이미지들의 링크만 추출
					Element imgElement = aElement.select("img").get(0);
//					String imgUrl = imgElement.attr("src");
//					System.out.println(imgUrl);
					
//					기사들의 제목만 추출
					String title = imgElement.attr("alt");
//					System.out.println(title);
					
//					기사들의 내용만 추출
					Document detailDoc = Jsoup.connect(newsUrl).get();
					Element contentElement = detailDoc.getElementById("dic_area");
//					System.out.println(contentElement);
					String content = contentElement.text(); //html tag들을 제거해줌.
//					System.out.println(content);
					
					db.mydbInsert(++index, title, content);
					db.mydbListData();
				} //end of for j
			} //end of for i
		} catch(Exception e) {
			e.printStackTrace();
			db.disConnection();
		}
	}//end of main
}
