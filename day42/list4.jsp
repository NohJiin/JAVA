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
<h3>플레이리스트 전체목록</h3>
<hr color="red">
<!-- bag.getId()으로 private id변수에 직접 접근한것이 아님 -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
<input name="title">
	<button style="background: black; color: white;">검색</button> <br>
<table>
	<tr>
		<td class="top">id</td>
		<td class="top">title</td>
		<td class="top">artist</td>
		<td class="top">genre</td>
		<td class="top">album</td>
	</tr>
<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.id}</td>
		<td class="down">
			<a href="one4?title=${bag.title}">${bag.title}</a>
		</td>
		<td class="down">${bag.artist}</td>
		<td class="down">${bag.genre}</td>
		<td class="down"><img src="resources/img/${bag.img}" width="150px" height="150px"></td>
	</tr>
</c:forEach>
</table>
<a href="playlist.jsp">
	<button style="background: black; color: white;">첫페이지로</button>
</a>
</body>
</html>