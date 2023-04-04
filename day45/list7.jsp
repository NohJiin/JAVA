<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<table class="w3-table w3-bordered">
	<tr>
		<td class="top">id</td>
		<td class="top">pw</td>
		<td class="top">name</td>
		<td class="top">tel</td>
	</tr>
<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.id}</td>
		<td class="down">${bag.pw}</td>
		<td class="down">${bag.name}</td>
		<td class="down">${bag.tel}</td>
	</tr>
</c:forEach>
</table>