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