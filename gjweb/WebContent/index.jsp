<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="st1.css">
</head>
<body>
	<div class="header"><jsp:include page="header.jsp"></jsp:include></div>
	<div class="content" >
		<table width=300 align=center >
			<tr>
				<td><a href="login.jsp">1)登入</a>
			<tr>
				<td><a href="member/addmember.jsp">2)註冊</a>
			<tr>
				<td><a href="login.jsp">3)購物</a>
		</table>
	
	</div>
	<div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>