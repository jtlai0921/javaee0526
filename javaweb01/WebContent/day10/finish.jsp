<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"%>
    
    <%
 porder p=(porder)session.getAttribute("P");
 
 String show=(p.getPdate().getYear()+1900)+"年"+(p.getPdate().getMonth()+1)+"月"+
 p.getPdate().getDate()+"日";
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<link href="st1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="header"><%@include file="header.jsp" %></div>
	<div class="content">
		<table width="400" align=center>
			<tr>
				<td colspan=2 align=center>
				<h3>訂單完成</h3>
				<%=show %>
			<tr>
				<td>品名
				<td>數量
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td>產品1
				<td><%=p.getProduct1() %>
			<tr>
				<td>產品2
				<td><%=p.getProduct2() %>
			<tr>
				<td>產品3
				<td><%=p.getProduct2() %>
			
			<tr>
				<td>共
				<td><%=p.getDiscountprice() %>元
		
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				
				<a href="index.jsp">回首頁</a>
		
		</table>
	
	
	</div>
	<div class="footer"><%@include file="footer.jsp" %></div>
	
</body>
</html>