<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: orange;
}
</style>
</head>
<body>
회원검색이 완료되었습니다. <br>
<!-- bag.getId()으로 private id변수에 직접 접근한것이 아님 -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
${bag.id} <br> <!-- 출력용(expression language - EL) -->
${bag.pw} <br>
${bag.name} <br>
${bag.tel} <br>
</body>
</html>