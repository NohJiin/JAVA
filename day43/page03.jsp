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
	session.setAttribute("view", 100);
	// 세션의 값으로는 아무 타입이나 다 넣어도 됨
	// => 주차장 생각! Car면 다 됨!
	// => Car(큰) : 트럭, 승용차, 버스 ...(작은)
%>
시작 현재 카운트 : <%= session.getAttribute("view") %>, ${view}
<hr color="red">
서버에 세션 속성등록함 <br>
<a href="page04.jsp">session속성가지고오기</a> <br>
</body>
</html>