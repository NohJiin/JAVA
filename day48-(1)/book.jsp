<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>북마크 화면입니다.</h3>
	<a href="list3">북마크 전체목록</a>
	<hr color="red">
	<form action="insert3">
		name : <input name="name" value="naver"> <br> 
		url : <input name="url" value="https://www.naver.com"> <br> 
		img : <input name="img" value="naver.png"> <br>
		<button type="submit">북마크 등록</button>
	</form>
	<hr color="red">
	
	<h3>북마크 수정화면입니다.</h3>
	<hr color="red">
	<form action="update3">
		name : <input name="name" value="naver"> <br> 
		url : <input name="url" value="https://www.daum.net"> <br>
		<button type="submit">수정 데이터 전송</button>
	</form>
	<hr color="red">
	
	<h3>북마크 삭제화면입니다.</h3>
	<hr color="red">
	<form action="delete3">
		id : <input name="id" value="1"> <br> 
		<button type="submit">삭제할 데이터 전송</button>
	</form>
	
	<h3>북마크 검색화면입니다.</h3>
	<hr color="red">
	<form action="one3">
		id : <input name="id" value="40"> <br> 
		<button type="submit">검색할 데이터 전송</button>
	</form>
	<hr color="red">
</body>
</html>