<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="day8.member"
    
    
    %>
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

member m=new member();
m.setName("teacher");

%>
<br>
x*y=<%=x*y%><br>
20*5=<%=cal(20,5) %><br>
會員名稱=<%=m.getName() %>
<a href="ex3.jsp">ex3</a>
<hr>
<%@include file="message.jsp" %>
</body>
</html>