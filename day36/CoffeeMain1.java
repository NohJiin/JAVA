package com.multi.www.web02;

public class CoffeeMain1 {

	public static void main(String[] args) {
		// 프로토타입으로 객체 생성
		Coffee1 c1 = new Coffee1("아메리카노", 1000);
		Coffee1 c2 = new Coffee1("라떼", 1500);
		
		// 두 객체의 주소가 다른 것을 확인
		System.out.println(c1);
		System.out.println(c2);
	}

}