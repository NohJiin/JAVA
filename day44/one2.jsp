<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: beige;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

<h3>게시글 검색이 완료되었습니다.</h3>
no : ${bag.no} <br>
title : ${bag.title} <br>
content : ${bag.content} <br>
writer : ${bag.writer} <br>
<hr>
[ 댓글 ]
<hr color="red">
댓글 : <input id="reply"> <button>댓글달기</button> <br>
<div id="result">
	<c:forEach items="${list}" var="x">
		${x.writer} : ${x.content} <br>
	</c:forEach>
</div>
</body>
</html>