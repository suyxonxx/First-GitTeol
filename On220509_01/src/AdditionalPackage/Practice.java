package AdditionalPackage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Practice {
	private Connection con; //mySQL 연결
	private PreparedStatement pstmt; // SQL 문장 전송
	
	private final String URL = "";
	
//	드라이버 등록 : 한 번만 등록하면 됨.
	public Practice() {
		try {
			Class.forName("");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "", ""); //경로, ID, PW
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
	
	public static void main(String[] args)  throws IOException {
//		1. 크롤링(crawling)
		int pages = 5;
		
		for(int i = 1; i < pages; i++) {
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20220502&page=" + i;
			
			Document doc = Jsoup.connect(url).get(); //예외처리 안하면 빨간줄 뜸
//			System.out.println(doc);
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);
//			System.out.println(element);
			
//			배열을 연상시킬 것
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
//			System.out.println(photoElements);
			
			for(int j = 0; j < photoElements.size(); j++) {		
//				1차 필터링
				Element articleElement = photoElements.get(j);
//				System.out.println(articleElement);
				
//				2차 필터링
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
//				System.out.println(aElements);
				
//				기사들의 링크만 추출
				String newsUrl = aElement.attr("href");
//				System.out.println(newsUrl);
				
//				기사에 첨부된 이미지들의 링크만 추출
				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src");
//				System.out.println(imgUrl);
				
//				기사들의 제목만 추출
				String title = imgElement.attr("alt");
//				System.out.println(title);
				
//				링크, 제목, 내용은 아주 짧게 도입부분만!!
//				기사들의 내용만 추출
				Document detailDoc = Jsoup.connect(newsUrl).get();
				Element contentElement = detailDoc.getElementById("dic_area");
//				System.out.println(contentElement);
				String content = contentElement.text(); //html tag들을 제거해줌.
				System.out.println(content);
				
				//여기에 SQL에 데이터를 집어넣는 과정 추가하기(Method 호출)
				
				System.out.println();
			} //end of for j
		} //end of for i
		
		Practice db = new Practice();
		db.getConnection();
		System.out.println("-------------------------------");
		
		db.mydbListData();
	}//end of main
}
