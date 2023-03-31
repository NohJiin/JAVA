<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("Categori", "Exercise");
	Cookie c2 = new Cookie("Exercise", "Soccer");
	
	response.addCookie(c1);		// 브라우저에 쿠키를 심으라고 명령함
	response.addCookie(c2);
%>
<hr>
브라우저에 쿠키를 심었음 <br>
<a href="page02.jsp">쿠키심기완료</a>
</body>
</html>