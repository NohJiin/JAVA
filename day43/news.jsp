<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			reply = $("#reply").val()
			divTag = $("#result")
			if (reply.length > 0) {
				divTag.append(reply + "<br>")
			}
		})
	})
</script>
</head>
<body>
<h3>[ 📌 오늘의 뉴스 📌 ]</h3>
<img src="resources/img/news.png" width="350px" height="350px"> <br>
<%
	if(session.getAttribute("id") != null) { %>
		${id}님의 댓글 : <input id="reply"><button id="btn" style="background: black; color: white;">댓글달기</button>
	<hr color="red">
	<div id="result"></div>
	<% } %>
</body>
</html>