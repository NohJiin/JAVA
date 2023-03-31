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
	background: beige;
}
</style>
</head>
<body>
플레이리스트 삭제 요청되었습니다.
<hr color="red">
삭제된 항목 정보
삭제된 title : <%= bag.getTitle() %> <br>
<a href="playlist.jsp">
	<button style="background: black; color: white;">첫페이지로</button>
</a>
</body>
</html>