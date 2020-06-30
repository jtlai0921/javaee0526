<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.memberDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=500 align=center border=1>
		<tr>
			<td align=center ><%@include file="Title.jsp" %>
		<tr>
				<td height=400 valign=top>
			
			
			<table width=400 align=center border=0>
					<tr>
						<td colspan=2 align=center>
						<h3>刪除會員</h3>
					<tr>
						<td colspan=2 align=center>
						<form action="deleteServlet" method="post">
						輸入id<input type="text" name="id">
						<input type="submit" value="ok">				
						
						
						</form>
		
					<tr>
						<td colspan=2 align=center>
						<hr>
					<tr>
						<td colspan=2 >
						<%=new memberDao().query() %>
						
						
					<tr>
						<td colspan=2 align=center>
				</table>
		<tr>
			<td align=center><%@include file="end.jsp" %>
	</table>

</body>
</html>