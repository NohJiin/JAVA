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
			$.ajax({
				url : "movie",
				data : {
					title : $("#title").val(),
					price : $("#price").val()
				},
				success : function(x) {
					alert("성공!")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("오류 발생")
				}	// error
			})	// ajax
		})	// btn2
		
		// 과일
		$("#btn2").click(function() {
			$.ajax({
				url : "fruit",
				success : function(x) {
					alert("성공!")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("오류 발생")
				}	// error
			})	// ajax
		})	// btn
		
		// 여행
		$("#btn3").click(function() {
			$.ajax({
				url : "tour",
				success : function(x) {
					alert("성공!")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("오류 발생")
				}	// error
			})	// ajax
		})	// btn3
	})	// $fun
</script>
</head>
<body>
영화제목 : <input id="title" value="타이타닉"> <br>
영화관람료 : <input id="price" value="80000"> <br>
<input id="btn" type="button" value="영화 관람 확인"> 
<br>
<input id="btn2" type="button" value="과일 목록 가져오기"> 
<br>
<input id="btn3" type="button" value="여행 목록 가져오기">
<hr color="red">
<h3>내역</h3>
<div id="result"></div>
</body>
</html>