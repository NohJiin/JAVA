package com.multi.www.web02;

public class CoffeeMain2 {

	public static void main(String[] args) {
		// 기본 값 : ["아메리카노", 1000]
		// getIstance()를 사용하여 객체를 생성한다(싱글톤으로)
		Coffee2 c1 = Coffee2.getInstance();
		Coffee2 c2 = Coffee2.getInstance();
		
		// 주소를 확인 (동일한 주소를 갖는지)
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.name + " : " + c1.price + "원");
		System.out.println(c2.name + " : " + c2.price + "원");
	}

}