<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="java.util.Date"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
Date d=new Date();
%>
<body>
<%=d.getYear()+1900 %>年<%=d.getMonth()+1 %>月<%=d.getDate() %>日

</body>
</html>