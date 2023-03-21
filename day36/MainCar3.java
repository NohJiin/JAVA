package com.multi.www.web02;

public class MainCar3 {

	public static void main(String[] args) {
		// 생성자가 포함한 파라미터가 있으면 객체 생성시 초기값 설정해야함
		Car2 car2;	// 12바이트
		for (int i = 0; i < 1000; i++) {
			car2 = Car2.getInstance();
			System.out.println(car2);	// 주소확인 => 1000개 모두 같은 주소를 사용
		}
		// System.out.println("메모리 크기>> " + 12*1000);
	}

}