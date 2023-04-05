<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 스크립트릿
	JSONObject json = new JSONObject();
	json.put("today", "rain");	// {name : hong}
	json.put("temp", 16.1);
	json.put("hu", 77);
	
	// out.print(json.toJSONString());
%><%= json.toJSONString() %>