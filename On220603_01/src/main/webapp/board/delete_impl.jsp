<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*"%>
<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	String pwd = request.getParameter("pwd");

	boolean chk = dao.boardDelete(no, pwd);
	
	if(chk == true) {
%>
		<script type="text/javascript">
			alert("삭제가 완료되었습니다.");
			location.href="list.jsp";
		</script>
<%
	} else {
%>
		<script type="text/javascript">
			alert("비밀번호를 바르게 입력해주세요.");
			history.back();
		</script>
<%
	}
%>