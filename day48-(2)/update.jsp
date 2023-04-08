<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="com.multi.mvc700.Movie0407VO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
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
<h3>id : <%= bag.getId() %>이 수정되었습니다.</h3>
<hr color="red">
id : <%= bag.getId() %> <br>
title : <%= bag.getTitle() %> <br>
</body>
</html>