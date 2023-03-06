package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// 기본형 변수 4가지
		// -128~127, 1바이트 byte
		// -3만~3만, 2바이트 short
		// -21억~21억, 4바이트 int
		// 21억 이상, 8바이트 long
		byte age = 127;
		short days = 1000;
		int money = 100000;
		long bank = 2300000000L;	
		// JDK가 long을 int로 인식하기 때문에 long 사용시 숫자 맨 뒤에 L,l을 붙여 사용
		
		// 실수형 변수 2가지
		// 소수점 4자리까지 4바이트 float
		float height = 170.4F;
		// JDK가 float을 double로 인식하기 때문에 float 사용시 숫자 맨 뒤에 F,f를 붙여 사용
		// 소수점 4자리 이상 8바이트 double
		double weight = 43.33333333;
		
		// 문자1
		// 논리형
	}

}
