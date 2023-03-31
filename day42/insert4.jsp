<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String img = request.getParameter("img");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: yellow;
}
</style>
</head>
<body>
플레이리스트 등록 처리 요청되었습니다. <br>
<img src="resources/img/<%= img%>" width="250px" height="100px">
<a href="playlist.jsp">
	<button style="background: black; color: white;">첫페이지로</button>
</a>
</body>
</html>