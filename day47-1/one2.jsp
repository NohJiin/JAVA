<%@page import="com.multi.mvc300.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: beige;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">
<%-- <% 
	// 세션에서 값을 꺼내는 방법
	String id = (String)session.getAttribute("id");
	// 모델에서 값을 꺼내는 방법 (Controller에서 bag을 model로 되어있음)
	// model.addAttribute("bag", bag);
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer = bag.getWriter();
	
	if(id.equals(writer)) {%>
		<a href="update2">
			<button style="background: pink;">수정</button>
		</a>
		<a href="delete2?no=${bag.no}">
			<button style="background: pink;">삭제</button>
		</a>
		<hr color="red">
<% } %> --%>
<h3>게시글 검색이 완료되었습니다.</h3>
no : ${bag.no} <br>
title : ${bag.title} <br>
content : ${bag.content} <br>
writer : ${bag.writer} <br>
</body>
</html>