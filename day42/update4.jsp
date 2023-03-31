<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="com.multi.mvc01.PlayListDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: pink;
}
</style>
</head>
<body>
플레이리스트 수정 요청되었습니다.
<hr color="red">
title : <%= bag.getTitle() %> <br>
수정된 Album img <br>
<img src="resources/img/<%= bag.getImg() %>" width="200px" height="200px"><br>
<a href="playlist.jsp">
	<button style="background: black; color: white;">첫페이지로</button>
</a>
</body>
</html>