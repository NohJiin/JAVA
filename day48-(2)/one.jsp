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
<h3>id : ${bag.id} 검색 완료</h3>
<hr color="red">
<table>
	<tr>
		<td>id</td>
		<td>title</td>
		<td>genre</td>
		<td>grade</td>
		<td>director</td>
	</tr>
	<tr>
		<td>${bag.id}</td>
		<td>${bag.title}</td>
		<td>${bag.genre}</td>
		<td>${bag.grade}</td>
		<td>${bag.director}</td>
	</tr>
</table>
</body>
</html>