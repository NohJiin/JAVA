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
				url: "json1",
				dataType: "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel	// json에서 tel키로 값을 추출
					$("#result").append(id + " " + pw + " " + name + " " + tel + "<br>")
				}	//	success
			})	// ajax
		})	// b1
		
		$("#b11").click(function() {
			$.ajax({
				url: "json1",
				dataType: "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel	// json에서 tel키로 값을 추출
					table = "<table><tr><td>항목명</td><td>값</td></tr>" 
					+ "<tr><td>아이디</td><td>" + id + "</td></tr>"
					+ "<tr><td>비밀번호</td><td>" + pw + "</td></tr>"
					+ "<tr><td>이름</td><td>" + name + "</td></tr>"
					+ "<tr><td>전화번호</td><td>" + tel + "</td></tr></table>"
					$("#result").append(table)
				}	//	success
			})	// ajax
		})	// b11
		
		$("#b111").click(function() {
			$.ajax({
				url: "json1",
				dataType: "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel	// json에서 tel키로 값을 추출
					ul = "<ul><li>" + id + "</li>"
						+ "<li>" + pw + "</li>"
						+ "<li>" + name + "</li>"
						+ "<li>" + tel + "</li></ul> <br>"
					$("#result").append(ul)
				}	//	success
			})	// ajax
		})	// b111
		
		$("#b2").click(function() {
			$.ajax({
				url: "json2",
				success: function(json) {
					id1 = json[1].id
					name1 = json[1].name
					$("#result").append("json배열 중 2번 째 >> " + name1 + " " + id1 + "<br>")
				}	//	success
			})	// ajax
		})	// b2
		
		<!-- url : json3, bbsvo에 값을 하나 넣어서 json으로 받아와서 출력  -->
		$("#b3").click(function() {
			$.ajax({
				url: "json3",
				dataType: "json",
				success: function(json) {
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer
					$("#result").append(no + " " + title + " " + content + " " + writer + "<br>")
				}	//	success
			})	// ajax
		})	// b3
		
		<!-- url : json4, bbsvo 2개가 들어간 arraylist를 만들어서 json array로 받아와서 출력  -->
		$("#b4").click(function() {
			$.ajax({
				url: "json4",
				success: function(json) {
					no = json[0].no
					title = json[0].title
					content = json[0].content
					writer = json[0].writer
					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					writer2 = json[1].writer
					$("#result").append("bbs의 첫번째 >> " + no + " " + title + " " + content + " " + writer + "<br>"
							+ "bbs의 두번째 >> " + no2 + " " + title2 + " " + content2 + " " + writer2 + "<br>")
				}	//	success
			})	// ajax
		})	// b4
		
		$("#b44").click(function() {
			$.ajax({
				url: "json4",
				success: function(json) {
					no = json[0].no
					title = json[0].title
					content = json[0].content
					writer = json[0].writer
					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					writer2 = json[1].writer
					table = "<table><tr><td>항목명</td><td>값</td></tr>" 
					+ "<tr><td>no</td><td>" + no + "</td></tr>"
					+ "<tr><td>title</td><td>" + title + "</td></tr>"
					+ "<tr><td>content</td><td>" + content + "</td></tr>"
					+ "<tr><td>writer</td><td>" + writer + "</td></tr>"
					+ "<tr><td>no2</td><td>" + no2 + "</td></tr>"
					+ "<tr><td>title2</td><td>" + title2 + "</td></tr>"
					+ "<tr><td>content2</td><td>" + content2 + "</td></tr>"
					+ "<tr><td>writer2</td><td>" + writer2 + "</td></tr></table>"
					$("#result").append(table)
				}	//	success
			})	// ajax
		})	// b44
		
		$("#b444").click(function() {
			$.ajax({
				url: "json4",
				success: function(json) {
					no = json[0].no
					title = json[0].title
					content = json[0].content
					writer = json[0].writer
					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					writer2 = json[1].writer
					ul = "<ul>json 첫 번째<li>" + no + "</li><li>" + title + "</li><li>" + content + "</li><li>" + writer + "</li></ul>"
					ul2 = "<ul>json 두 번째<li>" + no2 + "</li><li>" + title2 + "</li><li>" + content2 + "</li><li>" + writer2 + "</li></ul>"
					$("#result").append(ul + ul2)
				}	//	success
			})	// ajax
		})	// b4
	})	// $func
</script>
</head>
<body>
<button id="b1">컨트롤러에서 JSON(텍스트)을 받아오자</button>
<button id="b11">컨트롤러에서 JSON(다른 모양, tab le)을 받아오자</button>
<button id="b111">컨트롤러에서 JSON(다른 모양, li)을 받아오자</button>
<button id="b2">컨트롤러에서 JSONArray를 받아오자</button>

<!-- url : json3, bbsvo에 값을 하나 넣어서 json으로 받아와서 출력  -->
<button id="b3">컨트롤러에서 JSON3을 받아오자</button>

<!-- url : json4, bbsvo 2개가 들어간 arraylist를 만들어서 json array로 받아와서 출력  -->
<button id="b4">컨트롤러에서 JSON4을 받아오자</button>
<button id="b44">컨트롤러에서 JSON4(table)을 받아오자</button>
<button id="b444">컨트롤러에서 JSON4(ul)을 받아오자</button>
<hr color="red">
<div id="result"></div>
</body>
</html>