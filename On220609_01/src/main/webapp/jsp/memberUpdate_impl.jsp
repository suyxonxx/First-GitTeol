<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<jsp:useBean id="vo" class="com.shopmanager.dao.ShopVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<script type="text/javascript" src="../script/shop.js">
	let result = memberCheck();
	if(result == false) {
		history.back();
	} else {
		<%
		dao.shopUpdate(vo);
		response.sendRedirect("memberList.jsp");
		%>
		alert('회원 등록이 완료되었습니다.');
	}
</script>