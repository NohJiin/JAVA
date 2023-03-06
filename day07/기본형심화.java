package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수, 실수, 문자, 논리
		// int, double, char, boolean
		
		// 온도
		double temp = 1.2;
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String location = "선릉역";
		
		// 망치처럼 자주 쓰이는 부품은 대문자로 바로 쓴다
		// System - 컴퓨터, out(출력장치) - 모니터
		//				in(입력장치) - 키보드
		System.out.println("오늘 온도는 " + temp + "도");
		System.out.println("여기는 " + floor + "층");
		System.out.println("색깔은 " + color + "색");
		System.out.println("음료수가 있나요? " + juice);
	}

}