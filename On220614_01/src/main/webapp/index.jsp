<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<form method="post" action="#" name="frm">
		&nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-primary" value="주소 검색" onclick="goPopup()"><br>
		주소 : <input type="text" name="addr" id="address" size="100">
	</form>
	<script type="text/javascript">
		function goPopup(){
			var pop = window.open("http://localhost:9090/On220614_01/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
		}
		function jusoCallBack(roadFullAddr){
				document.frm.addr.value = roadFullAddr;
		}
</script>
</body>
</html>