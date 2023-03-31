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
북마크 검색이 완료되었습니다.
<hr color="red">
id : ${bag.id} <br>
title : ${bag.title} <br>
artist : ${bag.artist} <br>
genre : ${bag.genre} <br>
<img src="resources/img/${bag.img}" width="150px" height="150px"> <br>
<a href="playlist.jsp">
	<button style="background: black; color: white;">첫페이지로</button>
</a>
</body>
</html>