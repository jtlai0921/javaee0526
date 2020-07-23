<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../st1.css">
</head>
<body>
	<div class="header"><jsp:include page="../header.jsp"></jsp:include></div>
	<div class="content">
		<table width=300 align=center>
			<tr>
				<td colspan=2 align=center>
				<h3>訂單管理</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td><a href="addPorder.jsp">1)購物</a>
			<tr>
				<td><a href="porderUpdate.jsp">2)修改訂單</a>
			<tr>
				<td><a href="porderDelete.jsp">3)刪除訂單</a>
		
		</table>
	
	
	</div>
	<div class="footer"><jsp:include page="../footer.jsp"></jsp:include></div>
</body>
</html>