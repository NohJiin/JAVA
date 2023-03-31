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
.top {
	background: pink;
	color: black;
}
.down {
	background: yellow;
}
a{
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
<h3>북마크 전체목록</h3>
<hr color="red">
<!-- bag.getId()으로 private id변수에 직접 접근한것이 아님 -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
<table>
	<tr>
		<td class="top">id</td>
		<td class="top">name</td>
		<td class="top">url</td>
		<td class="top">img</td>
	</tr>
<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.id}</td>
		<td class="down">
			<a href="one3?id=${bag.id}">${bag.name}</a>
		</td>
		<td class="down">${bag.url}</td>
		<td class="down"><img src="resources/img/${bag.img}" width="250px" height="100px"></td>
	</tr>
</c:forEach>
</table>
</body>
</html>