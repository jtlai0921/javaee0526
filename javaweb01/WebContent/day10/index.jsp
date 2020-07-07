<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
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
		
			<form action="../addServlet" method="post">
			<table width=600 align=center border=0>
			<tr>
				<td colspan=3 align=center>
				<h1>請選產品</h1>
			<tr>
				<td colspan=3 align=center>
				<hr>
			<tr>
				<td width=200 valign=top align=center>
					<img src="../pic/p1.jpg"><br>
					<select name="product1">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9					
					</select>				
			   <td width=200 valign=top align=center>
			    	<img src="pic\p2.jpg">
			    	<select name="product2"><br>
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9					
					</select>						
			    <td width=200 valign=top align=center>
			    	<img src="pic\p3.jpg"><br>
			    	<select name="product3">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9					
					</select>						
			 <tr>
				<td colspan=3 align=center>
				<hr>
			 <tr>
			 	<td colspan=3 align=center>
				<input type="submit" value="送出">
		</table>
		</form>
	</div>
	<div class="footer"><%@include file="footer.jsp" %></div>

</body>
</html>