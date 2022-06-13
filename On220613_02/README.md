WEB-STUDY-10

환경
01. Windows
02. STS Tool (Version : 3.9.17.RELEASE)
03. Oracle 11g
04. jdk11
05. Encoding : UTF-8
06. Git
07. jstl.jar
08. ojdbc6.jar
09. standard.jar
10. cos.jar (Version : cos-22.05) => 파일을 송수신 하는 역할을 함.
11. lombok.jar

DBCP 연결 (server.xml에 추가)
<Context docBase="web-study-10" path="/web-study-10"
	reloadable="true" source="org.eclipse.jst.jee.server:web-study-10">
	<Resource auth="Container"
		driverClassName="oracle.jdbc.OracleDriver" maxIdle="10"
		maxTotal="20" maxWaitMillis="-1" name="jdbc/myoracle"
		password="tiger" type="javax.sql.DataSource"
		url="jdbc:oracle:thin:@127.0.0.1:1521:xe" username="scott" />
</Context>

MYSQL 테이블 생성 및 데이터 입력
CREATE TABLE PRODUCT(
    CODE NUMBER(5),
    NAME VARCHAR2(100),
    PRICE NUMBER(8),
    PICTUREURL VARCHAR(50),
    DESCRIPTION VARCHAR(1000),
    PRIMARY KEY(CODE)
);

DESC PRODUCT;

CREATE SEQUENCE PRODUCT_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, '개념을 콕콕 잡아주는 데이터베이스', 27000, 'db.jpg', '데이터베이스에 관한 모든 것을 쉽고 재미있게 정리한 교재...');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, '웹표준을 위한 HTML5', 25000, 'html5.jpg', 'HTML5 가이드북. 홈페이지 제작을 위한 필수 선택 HTML 기본 문법...');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, 'Dynamic Programming book 시리즈-01 오라클 11g + PL/SQL', 25000, 'oracle.jpg','Dynamic 실무 코칭 프로그래밍 Book의 첫번째 책으로, 오라클 11g의 새로운 ...');
INSERT INTO product VALUES(product_seq.NEXTVAL, 'Visual C++ MFC 윈도우 프로그래밍', 26000, 'mfc.jpg', 'Visual C++를 처음 시작하는 독자의 눈높이에 맞춘 Visual C++...');
INSERT INTO product VALUES(product_seq.NEXTVAL, 'jQuery and jQuery Mobile : 이해하기 쉽게 풀어쓴', 25000, 'jquery.jpg', '소스 하나로 데스크탑과 모바일까지 HTML5와 함께 사용한다. 초보자들도 ...');

SELECT * FROM PRODUCT;

COMMIT;