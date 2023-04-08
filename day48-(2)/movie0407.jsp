<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h3>[ 🎬📽 Movie0407 🎬📽 ]</h3>
	<a href="list" style="background: yellow; color: red;">Movie0407 전체목록</a>
	<hr color="navy">
	<form action="insert">
		<!-- title : <input name="title" value="500일의 썸머"> <br> 
		genre : <input name="genre" value="코미디"> <br> 
		grade : <input name="grade" value="8.92"> <br> 
		director : <input name="director" value="마크 웹"> <br>
		<button type="submit">Movie 등록</button> -->
		<table>
		<tr>
			<td>titie</td>
			<td><input name="title" value="500일의 썸머"></td>
			<td rowspan="4">
				<button style="height: 102px;">등록</button>
			</td>
		</tr>
		<tr>
			<td>genre</td>
			<td><input name="genre" value="코미디"></td>
		</tr>
		<tr>
			<td>grade</td>
			<td><input name="grade" value="8.92"></td>
		</tr>
		<tr>
			<td>director</td>
			<td><input name="director" value="마크 웹"></td>
		</tr>
	</table>
	</form>
	<hr>
	
	<h3>[ 🛠 Movie0407 수정 🛠 ]</h3>
	<hr color="navy">
	<form action="update">
		<table>
			<tr>
				<td>id</td>
				<td><input name="id" value="3"></td>
				<td rowspan="2">
					<button style="height: 46px;">수정</button>
				</td>
			</tr>
			<tr>
				<td>titie</td>
				<td><input name="title" value="해리포터와 불의 잔"></td>
			</tr>
		</table>
	</form>
	<hr>
	
	<h3>[ ✂ Movie0407 삭제 ✂ ]</h3>  
	<hr color="navy">
	<form action="delete">
		id : <input name="id" value="6">
		<button type="submit">삭제</button>
	</form>
	<hr>
	
	<h3>[ 🔍 Movie0407 검색 🔍 ]</h3>
	<hr color="navy">
	<form action="one">
		id : <input name="id" value="3">
		<button type="submit">검색</button>
	</form>
	<hr>
</body>
</html>