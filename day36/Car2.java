package com.multi.www.web02;

public class Car2 {
	// 싱글톤으로 생성
	String color;	// 4바이트 가정
	int price;		// 4바이트
	int speed;		// 4바이트
	// 하나만 제공하는 객체는
	// static : 하나만 변수 만들 때
	// public : 제공하는 car2를 아무데서나 쓸 수 있도록
	public static Car2 car2;
	// 싱글톤은 해당클래스에서 하나만 만들어서 제공!
	
	public static Car2 getInstance() {
		// 만들어지지 않았다면
		if (car2 == null) {	// 아직 만들어지지 않은 것
			car2 = new Car2("빨강", 100, 110);
		}
		return car2;	// 이미 만들어진 주소를 계속 리턴하게 된다
	}
	
	public void run() {
		System.out.println("달리자~~~!");
	}
	
	// 외부에서 생성자를 만드는 것을 막기위해서
	// new이용해서 객체생성시  new Car2()를 외부에서
	// 부를 수 없도록 해당 클래스내에서만 부르게 하고싶은 경우는
	// 접근제어자를 private으로 바꾸어버리기
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
}