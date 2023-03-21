package com.multi.www.web02;

public class MainCar2 {

	public static void main(String[] args) {
		// 생성자가 포함한 파라미터가 있으면 객체 생성시 초기값 설정해야함
		Car car;	// 12바이트
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car);	// 주소확인
		}
		System.out.println("메모리 크기>> " + 12*1000);
	}

}