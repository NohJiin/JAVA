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
	color: balck;
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
<h3>게시물 검색이 완료되었습니다.</h3>
<hr color="red">
<!-- bag.getId()으로 private id변수에 직접 접근한것이 아님 -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
<table>
	<tr>
		<td class="top">no</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.no}</td>
		<td class="down">
			<a href="one2?no=${bag.no}">${bag.title}</a>
		</td>
		<td class="down">${bag.content}</td>
		<td class="down">${bag.writer}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>