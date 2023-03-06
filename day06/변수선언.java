package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		// 선언 : 타입변수명 => 변수가 생성됨
		// 기본 데이터 : 정수, 실수, 문자1, 논리
		
		int num = 0;	// 정수변수
		double num2 = 22.1;	// 실수변수(정수도 포함)
		char c = '한';	// 글자 1글자
		boolean b = true;	// 논리변수
		
		num = 200;
		
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자1개 값은 " + c);
		System.out.println("논리값은 " + b);
	}

}
