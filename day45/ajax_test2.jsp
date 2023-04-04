<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta
	content='width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no'
	name='viewport'>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	lat = '';
	lon = '';
	if (navigator.geolocation) {
		  navigator.geolocation.getCurrentPosition(showPosition);
		} else {
		  console.log("Geolocation is not supported by this browser.");
		}
	
		function showPosition(position) {
		  console.log("Latitude: " + position.coords.latitude);
		  lat = position.coords.latitude;
		  console.log("Longitude: " + position.coords.longitude);
		  lon =position.coords.longitude;
		}
	$(function() {
		$.ajax({
			url : "list5",
			success : function(x) {
				$("#result").append(x)
			},
			error : function() {
				alert("실행 오류!")
			}	// error
		})	// ajax
		
		$("#b1").click(function() {
			$.ajax({
				url : "update22",
				data : {
					no : $("#bbsno").val(),
					content : $("#content").val()
				},
				success : function() {
					alert("수정되었습니다.")
					$("#bbsno").val("")
					$("#content").val("")
					document.location.reload()
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b1
		
		$("#b2").click(function() {
			$.ajax({
				url : "delete2",
				data : {
					no : $("#bbsno2").val()
				},
				success : function() {
					alert("삭제되었습니다.")
					$("#content").val("")
					document.location.reload()
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b2
		
		$("#b3").click(function() {
			$("#result").empty()
			$.ajax({
				crossOrigin : true,
				url : "https://api.openweathermap.org/data/2.5/weather?lat=35.82&lon=128.56&appid=7895736ed8333e0011141c76dbe4db73",
				dataType : 'json',
				success: function(x){
					console.log(x);
					$('#result').append("<br>위치 : "+x.name+"<br>"+
							"날씨 : "+x.weather[0].description+"<br>"+
							"풍속 : "+x.wind.speed+"<br>"+
							"최고 기온 : "+x.main.temp_max+"<br>"+
							"최저 기온 : "+x.main.temp_min+"<br>"+
							"체감 온도 : "+x.main.feels_like+"<br>"+
							"구름 : "+x.clouds.all+"<br>")
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b3
		
/* 		$("#b4").click(function() {
			$.ajax({
				url : "test",
				success : function(x) {
					$("#result").append(x)
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b2 */
	})	// $func
</script>
</head>
<body>
	bbsno :
	<input id="bbsno"> content :
	<input id="content">
	<button id="b1">bss 수정 버튼</button>
	<br> bbsno :
	<input id="bbsno2">
	<button id="b2">bbs삭제 버튼</button>
	<button id="b3">날씨 정보 가져오기</button>
	<!-- <button id="b4">input 생성하기 버튼</button> -->
	<div id="result" class="w3-container"></div>
</body>
</html>