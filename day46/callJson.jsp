<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Content Delivery Network : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			$.ajax({
				url: "json.jsp",
				dataType: "json",
				success: function(json) {
					$("#result").append(json.id + "<br>")
				}	//	success
			})	// ajax
		})	// b1
		
		$("#b2").click(function() {
			$.ajax({
				url: "json2.jsp",
				success: function(json) {
					$("#result").append(json + "<br>")
				}	//	success
			})	// ajax
		})	// b2
		
		$("#b3").click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType: "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$("#result").append(today + " " + temp + " " + hu + " " + "<br>")
					if(today == 'rain'){
						$("#result").append("<img src=resources/img/rain.png><br>")
					} else {
						$("#result").append("<img src=resources/img/sun.jpg><br>")
					}
				}	//	success
			})	// ajax
		})	// b3
		
		$("#b4").click(function() {
			$.ajax({
				url: "json4.jsp",
				success: function(json) {
					high = json[0].highest
					low = json[0].lowest
					date = json[0].date
					high2 = json[1].highest
					low2 = json[1].lowest
					date2 = json[1].date
					$("#result").append(date + " : " + high + " " + low + " " + "<br>")
					$("#result").append(date2 + " : " + high2 + " " + low2 + " " + "<br>")
				}	//	success
			})	// ajax
		})	// b4
	})	// $func
</script>
</head>
<body>
<button id="b1">JSON을 받아오자</button>
<button id="b2">JSONArray를 받아오자</button>
<button id="b3">JSON3을 받아오자</button>
<button id="b4">JSON4을 받아오자</button>
<hr color="red">
<div id="result"></div>
</body>
</html>