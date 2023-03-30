<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 화면입니다.</h3>
	<hr color="red">
	<form action="insert2">
		no : <input name="no" value="17"> <br> 
		title : <input name="title" value="화요일 수업"> <br> 
		content : <input name="content" value="어렵다"> <br> 
		writer : <input name="writer" value="noh"> <br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	<h3>게시물 수정화면입니다.</h3>
	<hr color="red">
	<form action="update2">
		no : <input name="no" value="17"> <br> 
		content : <input name="content" value="정말 어렵다"> <br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	<h3>게시물 삭제화면입니다.</h3>
	<hr color="red">
	<form action="delete2">
		no : <input name="no" value="17"> <br> 
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	<h3>게시물 검색화면입니다.</h3>
	<hr color="red">
	<form action="one2">
		no : <input name="no" value="17"> <br> 
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
</body>
</html>