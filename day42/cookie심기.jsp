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
	// 1. 쿠키 객체 생성. 브라우저에 저장할 정보 1개당 쿠키 1개 (공백을 포함한 값을 넣으면 안된다)
	Cookie c1 = new Cookie("name", "honggilldong");
	Cookie c2 = new Cookie("age", "100");
	
	// 2. 쿠키를 서버에서 브라우저로 보낸다
	response.addCookie(c1);
	response.addCookie(c2);
%>
<hr>브라우저에 쿠키를 심었음
<a href="cookie리스트가지고오기.jsp">쿠키리스트 가지고오기</a>
</body>
</html>