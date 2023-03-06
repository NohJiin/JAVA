package 변수;

public class 변수선언확인문제 {
	public static void main(String[] arg) {
		// 내 정보중 기2본 데이터에 속하는 정보는 변수에 넣고 출력
		
		// 정수
		int age = 24;
		
		// 실수
		double height = 163;
		
		// 문자1
		char first_name = 'N';
		
		// 논리
		boolean lunch = true;
		
		// 기본 데이터가 아님 => 너무 많이 사용해서 기본형처럼 사용가능!
		String name = "노지인";	// 여러 글자를 쓸때는 "" 사용
		// 스트링, 실, 문자열
		
		System.out.println("내 나이는? " + age);
		System.out.println("내 키는? " + height);
		System.out.println("내 성 이니셜은? " + first_name);
		System.out.println("나는 점심을 먹었는가? : " + lunch);
		System.out.println("나의 이름은? : " + name);	
	}

}
