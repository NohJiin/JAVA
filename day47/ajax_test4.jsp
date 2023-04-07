<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=722cf931cc1e1fa59c12b2f4003cd434"></script>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
/* 	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart); */

	$(function() {
		// 이게 뭘까나?
		$("#b1").click(function() {
			$("#result").empty()
			$("#map").empty()
			$.ajax({
				url : "jsonResponse3",
				success : function(x) {
					id = x.id
					name = x.name
					$("#result").append("아이디 : " + id + " 이름 : " + name + "<br>")
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b1
		
		$("#b2").click(function() {
			$("#result").empty()
			$("#map").empty()
			$.ajax({
				url : "jsonResponse4",
				dataType : 'json',
				success : function(x) {
					// location.href="ajax_test4.jsp"
					for (var i = 0; i < x.length; i++) {
						id = x[i].id
						pw = x[i].pw
						name = x[i].name
						tel = x[i].tel
						$("#result").append("ID : " + id + " PW : " + pw + " NAME : " + name + " TEL : " + tel + "<br>")
					}
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b2
		
		$("#b3").click(function() {
			$("#result").empty()
			$("#map").empty()
			$.ajax({
				url : "jsonResponse4",
				dataType : 'json',
				success : function(x) {
					// location.href="ajax_test4.jsp"
					$("#result").append("<table border='1'><tr><td>아이디</td><td>비밀번호</td><td>이름</td><td>전화번호</td></tr>")
					for (var i = 0; i < x.length; i++) {
						id = x[i].id
						pw = x[i].pw
						name = x[i].name
						tel = x[i].tel
						table = "<tr><td>" + id + "</td><td>" + pw + "</td><td>" + name + "</td><td>" + tel + "</td></tr>"
						$("#result").append(table)
					}
						$("#result").append("</table>")
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b3
		
		$("#b4").click(function() {
			$("#result").empty()
			$("#map").empty()
			$.ajax({
				url : "jsonResponse5",
				dataType : 'json',
				success : function(x) {
					space = x[1].space
					lat = x[1].lat
					lon = x[1].lon
					$("#result").append("위치 >> " + space)
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
					mapOption = { 
					    center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
					    level: 3 // 지도의 확대 레벨
					};

					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

					//마커가 표시될 위치입니다 
					var markerPosition  = new kakao.maps.LatLng(lat, lon); 

					//마커를 생성합니다
					var marker = new kakao.maps.Marker({
					position: markerPosition
					});

					//마커가 지도 위에 표시되도록 설정합니다
					marker.setMap(map);
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b3
		
		// 구글 차트 json
		$("#b5").click(function() {
			$("#result").empty()
			$("#map").empty()
			$.ajax({
				url : "jsonResponse6",
				dataType : 'json',
				success : function(list) {
					//2차원 배열--> 3개
					var arr2 = new Array(list.length + 1);
				    var header = ["Task", "hours"];
				    arr2[0] = header
				    //alert(data[0])
/* 					for(i = 0; i < list.length; i++){
				    	data[i + 1] = new Array(2)
				    	data[i + 1][0] = list[i].work;
				    	data[i + 1][1] = list[i].time;
						alert(arr2[i + 1])
					} */
					//2차원배열은 배열을 만들어서
					//1차원을 2차원배열에 하나씩 끼면 됨.
					for(i = 0; i < list.length; i++){
				    	one = new Array(2)
				    	one[0] = list[i].work;
				    	one[1] = list[i].time;
				    	arr2[i + 1] = one
					}
			        var data = google.visualization.arrayToDataTable(arr2);
			         /* [
			        	 	['Task', 'Hours per Day'], //인덱스0
			          		[list[0].work, list[0].time], //인덱스1
			          		[list[1].work, list[1].time], //인덱스2
			          		[list[2].work, list[2].time] //인덱스3
			        	 ]*/
			
			        var options = {
			          title: 'My Daily Activities'
			        };
			
			        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
			
			        chart.draw(data, options);
				},
				error : function() {
					alert("실행 오류!")
				}	// error
			})	// ajax
		})	// b3
	})	// $func
</script>
</head>
<body>
<!-- 내용을 json으로 받아와서 table형태 -->
<button id="b1">Member(내용) 테이블</button>
<!-- 리스트를 json으로 받아와서 list형태 -->
<button id="b2">Member(list) 리스트</button>
<!-- 리스트를 json으로 받아와서 table형태 -->
<button id="b3">Member(table) 테이블</button>
<!-- jsonResponse5 ("코엑스", 위도, 경도)를 json으로 받아 카카오맵에 json을 넣어 지도를 표시 -->
<button id="b4">오설록 지도</button>
<!-- jsonResponse6 구글 차트에 보낼 데이터를 json으로 받아 구글 차트에 json을 넣어 차트 표시 -->
<button id="b5">차트 확인</button>
<hr color="blue">
<div id="result"></div>
<div id="map" style="width: 100%; height: 350px;"></div>
<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>