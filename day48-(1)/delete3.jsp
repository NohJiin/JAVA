<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="com.multi.mvc300.BookDTO"></jsp:useBean>
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
북마크 삭제 요청되었습니다.
<hr color="red">
삭제된 항목 정보
삭제된 id : <%= bag.getId() %> <br>
</body>
</html>