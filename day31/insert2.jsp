<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1. 전달된 값 받기 (request사용) -->
<!-- 2. sql만들어서 dao에게 갑 전달(DAO이용) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에 HTML로 보내기 -->
<%
	String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 등록 요청되었음
	<hr color="red">
	게시판 번호 :
	<%=no%> <br>
	게시판 제목 :
	<%=title%> <br>
	작성자 이름 :
	<%=writer%> <br>
	게시판 내용 :
	<%=content%> <br>
</body>
</html>