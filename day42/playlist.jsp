<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
button {
	background: black;
	color: white;
}
</style>
</head>
<body>
	<h3>🎧 My PlayList 🎧</h3>
	<a href="list4" style="background: yellow; color: red;">플레이리스트 전체목록</a>
	<hr color="red">
	<form action="insert4">
		id : <input name="id" value="12"> <br> 
		title : <input name="title" value="Nxde"> <br> 
		artist : <input name="artist" value="I-DLE"> <br>
		genre : <input name="genre" value="K-POP"> <br>
		img : <input name="img" value="nxde.png"> <br>
		<button type="submit">ADD</button>
	</form>
	<hr color="red">
	
	<h3>🛠 Update PlayList 🛠</h3>
	<hr color="red">
	<form action="update4">
		title : <input name="title" value="Nxde"> <br> 
		img : <input name="img" value="idle.png"> <br>
		<button type="submit">UPDATE</button>
	</form>
	<hr color="red">
	
	<h3>🔍 Find PlayList 🔍</h3>
	<hr color="red">
	<form action="one4">
		title : <input name="title" value="Poppy"> 
		<button type="submit">FIND</button>
	</form>
	<hr color="red">
	
	<h3>✂ Delete PlayList ✂</h3>
	<hr color="red">
	<form action="delete4">
		title : <input name="title" value="키보드">
		<button type="submit">DELETE</button>
	</form>
</body>
</html>