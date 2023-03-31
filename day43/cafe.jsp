<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>[ 📌 공지 : 카페회원 대상 공동구매 📌 ]</h3>
<img src="resources/img/else.jpg" width="350px" height="350px"> <br>
<%
	if(session.getAttribute("id") != null) { %>
		${id}님
		<a href="bbb">
			<button style="background: black; color: white;">공동구매 참여</button>
		</a>
<% } %>
</body>
</html>