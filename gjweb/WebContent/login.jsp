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
	<div class="content">
		<form action="loginServlet" method="post">
			<table width=300 align=center >
				<tr>
					<td colspan=2 align=center>
					會員登入
				<tr>
					<td>帳號
					<td><input type="text" name="username">
				<tr>
					<td>密碼
					<td><input type="text" name="password">
				<tr>
					<td colspan=2 align=center>
					<input type="submit" value="ok">	
			
			</table>
		
		</form>
	
	
	</div>
	<div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>