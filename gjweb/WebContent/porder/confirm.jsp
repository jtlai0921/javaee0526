<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../st1.css">	
</head>
<%
	porder p=(porder)session.getAttribute("P");
%>
<body>
	<div class="header"><jsp:include page="../header.jsp"></jsp:include></div>
	<div class="content">
		<table width=400 align=center>
			<tr>
				<td colspan=2 align=center>
				<h3><%=p.getName() %></h3>這是你的訂單細目
			<tr>
				<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td>品名
				<td>數量
			<tr>
				<td>產品1
				<td><%=p.getProduct1() %>
			<tr>
				<td>產品2
				<td><%=p.getProduct2() %>
			<tr>
				<td>產品3
				<td><%=p.getProduct3() %>
			<tr>
				<td>原價
				<td><%=p.getSum() %>
			<tr>
				<td>折扣價
				<td><%=p.getDiscountprice() %>
			<tr>
				<tr>
				<td colspan=2>
			<tr>
				<td colspan=2 align=center>
				<a href="">確定</a>
		</table>
	
	
	
	</div>
	<div class="footer"><jsp:include page="../footer.jsp"></jsp:include></div>
</body>
</html>