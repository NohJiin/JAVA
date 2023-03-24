<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    // 입력한 값 받아오기
    int money = Integer.parseInt(request.getParameter("money"));
    int choice = Integer.parseInt(request.getParameter("choice"));
    
    if(choice == 1){
    	money = money - 1000;
    } else if(choice == 2){
    	money = money + 1000;
    }
    // 결과값이 ajax3.html 내에 ajax에 있는 function(x)의 x로 나타나게 된다
    %><%= money %>