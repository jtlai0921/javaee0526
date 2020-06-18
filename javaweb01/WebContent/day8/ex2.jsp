<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<%!
int abc=10;
int cal(int a,int b)
{
	return a*b;
}
%>
</head>
<body>
int x=10;
int y=20;
System.out.println("x*y="+x*y);
<%
int x=10;
int y=20;
System.out.println("x*y="+x*y);
%>
<br>
x*y=<%=x*y%><br>
20*5=<%=cal(20,5) %>
</body>
</html>