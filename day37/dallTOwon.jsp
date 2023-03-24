<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//원화 -> 달러
    	double dall = Double.parseDouble(request.getParameter("dall"));
    	double won = 0;
    	
    	if(dall != 0) {
    		won = dall / 0.00078;
    	} else {
    		won = 0;
    	}
    %><%= won %>