package com.it.dao;
// DBCP (톰캣)=> 웹에서만 사용이 가능 (웹애플리케이션의 데이터베이스 기본)
// 일반 JDBC 사용 
import java.util.*;
import java.sql.*;
/*
 *   MNO      NOT NULL NUMBER        
	CNO               NUMBER        
	TITLE    NOT NULL VARCHAR2(500) 
	GRADE    NOT NULL VARCHAR2(50)  
	RESERVE           VARCHAR2(20)  
	GENRE    NOT NULL VARCHAR2(200) 
	TIME              VARCHAR2(30)  
	REGDATE           VARCHAR2(200) 
	DIRECTOR NOT NULL VARCHAR2(100) 
	ACTOR             VARCHAR2(200) 
	SHOWUSER          VARCHAR2(20)  
	POSTER   NOT NULL VARCHAR2(260) 
	STORY             CLOB          
	KEY      NOT NULL VARCHAR2(50)  
	HIT               NUMBER        
	SCORE             NUMBER(3,2)   
 */
public class DataDAO {
   private Connection conn; /// mySQL로의 연결을 위한 변수 선언
   private PreparedStatement ps; // SQL 문장을 전송하기 위한 변수 선언
   private final String URL="jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC"; // mySQL과의 연결을 위한 경로
   private static DataDAO dao;
   // 드라이버 등록 
   public DataDAO()
   {
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
	   }catch(Exception ex){}
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"root","1234"); //경로, ID, PW
	   }catch(Exception ex) {}
   }
   //연결 해제
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 싱글턴 => DAO를 한번만 사용이 가능 (메모리 공간을 1개만 생성) = 재사용
   // 스프링에서는 기본 (싱글턴) => 필요시에는 여러개 객체 생성 => prototype
   public static DataDAO newInstance()
   {
//	   static 변수의 값이 변하면 변한 값이 공유되므로, dao == null일 때 DataDAO 객체를 최초로 생성한 이후에는
//	   dao가 다시 null이 될 수 없다. 따라서, 추가적인 객체 생성 과정이 이루어질 수 없게 되므로 하나의 메모리 공간을
//	   계속 재사용하게 되는 것이다.
	   if(dao==null)
		   dao=new DataDAO();
	   return dao;
   }
   // ==> 영화 => 맛집 => 레시피 => 명소 ,호텔 , 자연(관광) => 일정(코스) (추천)
   // 명소 
   /*
    *  NO      NOT NULL NUMBER         
	TITLE   NOT NULL VARCHAR2(200)  
	POSTER  NOT NULL VARCHAR2(500)  
	MSG     NOT NULL VARCHAR2(4000) 
	ADDRESS NOT NULL VARCHAR2(300)   
    */
   public void seoulLocationInsert(SeoulLocationVO vo)
   {
	   try
	   {
//		   1. DB 연결
		   getConnection();
//		   2. SQL 문장 작성 - 아래는 입력 과정에 해당하는 INSERT문이다.
		   String sql="INSERT INTO seoul_location VALUES(?,?,?,?,?)";
//		   3. mySQL로 SQL 문장 전송
//		   	3-1. 위에서 PreparedStatement 클래스의 변수인 ps를 선언하였으므로,
//		   	PreparedStatement 클래스의 메서드인 prepareStatement를 사용하였다.
		   ps=conn.prepareStatement(sql);
//		   	3-2. get 메서드를 통해 얻어온 값들을 set 메서드를 통해 전송
		   ps.setInt(1, vo.getNo());
		   ps.setString(2, vo.getTitle());
		   ps.setString(4, vo.getPoster());
		   ps.setString(5, vo.getMsg());
		   ps.setString(3, vo.getAddress());
//		   4. 전송된 값들을 업데이트 및 커밋
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
//		   자원 사용이 끝난 후에는 반드시 아래와 같이 자원 반환을 위한 연결 해제 메서드를 호출하여야 함
		   disConnection();
	   }
   }
   // 호텔
   /*
    *  CREATE TABLE SEOUL_HOTEL
   (	
     no int, 
	 name varchar(100), 
	 score double, 
	 address varchar(200), 
	 poster varchar(200),
	 images varchar(1000)
   );

    */
   public void seoulHotelInsert(SeoulHotelVO vo)
   {
	   try
	   {
		   getConnection();
		   String sql="INSERT INTO seoul_hotel VALUES(?,?,?,?,?,?)";
		   ps=conn.prepareStatement(sql);
		   ps.setInt(1, vo.getNo());
		   ps.setString(2, vo.getName());
		   ps.setDouble(3, vo.getScore());
		   ps.setString(4, vo.getAddress());
		   ps.setString(5, vo.getPoster());
		   ps.setString(6, vo.getImages());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   // 자연 
   /*
    * CREATE TABLE SEOUL_NATURE
   (	
       no int, 
       name varchar(100), 
       address varchar(200), 
	   poster varchar(200),
	   msg varchar(1000)
   );

    */
   public void seoulNatureInsert(SeoulNatureVO vo)
   {
	   try
	   {
		   getConnection();
		   String sql="INSERT INTO seoul_nature VALUES(?,?,?,?,?)";
		   ps=conn.prepareStatement(sql);
		   ps.setInt(1, vo.getNo());
		   ps.setString(2, vo.getTitle());
		   ps.setString(4, vo.getPoster());
		   ps.setString(5, vo.getMsg());
		   ps.setString(3, vo.getAddress());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   // 레시피 
   // 레시피 상세
   // 쉐프 
   
}
