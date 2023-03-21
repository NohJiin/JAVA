package com.multi.www.web02;

public class Coffee1 {
	//멤버변수
	String name;
	int price;
	
	// 생성자
	public Coffee1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 멤버메서드
	public void drip() {
		System.out.println("커피를 내린다.");
	}
}