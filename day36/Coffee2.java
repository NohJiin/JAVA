package com.multi.www.web02;

public class Coffee2 {
	// 멤버변수 선언
	String name;	// => name = "라떼";
	int price;		// => price = 2500;		이렇게 해도 상관은 없다
	static Coffee2 coffee2;	// null로 초기화되어있다
	
	// 싱글톤으로 객체 생성하기
	private Coffee2(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 외부에서 사용할 수 있도록 getInstance() 생성하기
	public static Coffee2 getInstance() {
		// 객체가 생성되지 않았을 때만 새롭게 객체 생성해준다
		if (coffee2 == null) {
			// 정해져있다 => 새로운 값을 넣으려면 instance새로 만들어야함
			coffee2 = new Coffee2("아메리카노", 1000);
		}
		return coffee2;
	}
}