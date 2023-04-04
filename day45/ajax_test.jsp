<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			// 기존에 있던것 삭제됨 (원래 append되어 있던 것)
			$("#result").empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$("#result").append(x)
				},
				error : function() {
					
				}	// error
			})	// ajax
		})	// b1
		
		$("#b2").click(function() {
			$("#result").empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 17
				},
				success : function(y) {
					$("#result").append(y)
				},
				error : function() {
					
				}	// error
			})	// ajax
		})	// b2
		
		$("#b3").click(function() {
			$("#result").empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 18
				},
				success : function(y) {
					$("#result").append(y)
				},
				error : function() {
					
				}	// error
			})	// ajax
		})	// b3
		
		$("#b4").click(function() {
			$("#result").empty()
			$.ajax({
				url : "one",
				data : {
					id : "apple"
				},
				success : function(y) {
					$("#result").append(y)
				},
				error : function() {
					
				}	// error
			})	// ajax
		})	// b4
		
		<!-- one6, no:1, views/one6.jsp -->
		$("#b5").click(function() {
			$("#result").empty()
			$.ajax({
				url : "one6",
				data : {
					no : 1
				},
				success : function(y) {
					$("#result").append(y)
				},
				error : function() {
					alert("실행 오류발생")
				}	// error
			})	// ajax
		})	// b4
		
		<!-- list7, views/list7.jsp -->
		$("#b6").click(function() {
			$("#result").empty()
			$.ajax({
				url : "list7",
				success : function(y) {
					$("#result").append(y)
				},
				error : function() {
					alert("실행 오류발생")
				}	// error
			})	// ajax
		})	// b4
	})	// $func
</script>
</head>
<body>
<button id="b1">Bbs리스트 가지고 오기</button>
<button id="b2">Bbs 17번 Reply리스트 가지고 오기</button>
<button id="b3">Bbs 18번 Reply리스트 가지고 오기</button>
<button id="b4">Member Id가 apple인 사람의 정보 가지고 오기</button>
<!-- one, id:apple, views/one.jsp -->
<button id="b5">Bbs no가 1인 게시물의 상세정보 가지고 오기</button>
<!-- one6, no:1, views/one6.jsp -->
<button id="b6">Member의 모든 리스트 가지고 오기</button>
<!-- list7, views/list7.jsp -->
<hr color="red">
<div id="result" class="w3-container"></div>
</body>
</html>