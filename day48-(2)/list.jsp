<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h3>전체 목록</h3>
<hr color="red">
<table>
	<tr>
		<td>id</td>
		<td>title</td>
		<td>genre</td>
		<td>grade</td>
		<td>director</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<tr>
			<td>${bag.id}</td>
			<td>${bag.title}</td>
			<td>${bag.genre}</td>
			<td>${bag.grade}</td>
			<td>${bag.director}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>