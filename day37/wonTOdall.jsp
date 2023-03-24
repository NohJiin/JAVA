<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//원화 -> 달러
    	int won = Integer.parseInt(request.getParameter("won"));
    	double dall = 0;
    	
    	if(won != 0) {
    		dall = won * 0.00078;
    	} else {
    		dall = 0;
    	}
    %><%= dall %>