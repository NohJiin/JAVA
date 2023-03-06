package 클래스복습;

public class Car {
	// 성질 : 변수로 구현, 멤버변수
	String color;	// 같은 패키지 내에서는 public 안해도 접근가능
					// 변수는 선언된 위치가 생존의 위치
					// 해당 변수를 포함하는 {}안에서 생존가능
	// 클래스 바로 아래 선언된 변수는 클래스 전체 영역에서 사용 가능
	// ==> 전역변수, 글로번변수, 자동초기화
	// ==> 자동초기화시 기본형이 아니므로 참조형은 모두 null로 초기화
	
	// 동작 : 기능, 멤버메서드, 함수(메서드, 방법)
	public void run() {		// 메서드(방법) ==> 이 달리다라는 기능이
							// 어떤 방법으로 달릴지를 써주면 된다. 방법써주는 곳(기능을 정의)
		System.out.println("부릉부릉 달리다!");
	}
	public void up() {
		System.out.println("비싼 휘발유를 먹으러 미친듯이 속도 up!!!");
	}
}