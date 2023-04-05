<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 스크립트릿
	JSONObject json = new JSONObject();
	json.put("date", "yesterday");	// {name : hong}
	json.put("highest", "30,350");
	json.put("lowest", "28,200");
	
	JSONObject json2 = new JSONObject();
	json2.put("date", "today");	// {name : hong}
	json2.put("highest", "38,700");
	json2.put("lowest", "30,350");
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
	// out.print(json.toJSONString());
%><%= array.toJSONString() %>