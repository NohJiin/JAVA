package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		// 생성자가 포함한 파라미터가 있으면 객체 생성시 초기값 설정해야함
		Car car = new Car("빨강", 10, 200);		// 12바이트
		Car car2 = new Car("파랑", 20, 250);		// 12바이트
		Car car3 = new Car("검정색", 30, 300);	// 12바이트
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	}

}