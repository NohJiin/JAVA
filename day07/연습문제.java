package 조건문;

import java.util.Date;
// 다른 Date import하면 오류나더라

public class 연습문제 {

	public static void main(String[] args) {
		// Date를 이용해라
		// 1. 현재 년도를 구해서 2000년 이상이면 밀레니엄 세대시군요
		// 						아니면 밀레니엄 세대가 아니시군요
		// 2. 요일을 구해서 토, 일은 쉬~~~ㅏ
		// 나머지 요일은 열~~심히ㅜ공부하자 프린트
		// 3. 달을 구해서 2월은 28일까지 프린트
		// 			4, 6, 9, 11월은 30일까지 프린트
		// 			나머지는 31일까지 프린트
		
		// 1.
		Date date = new Date();

		int year = date.getYear() + 1900;
		
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요!");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요!");
		}
		
		// 2.
		int day = date.getDay();
		// System.out.println(day);
		
		if (day == 0 || day == 6) {
			System.out.println("주말엔 쉬자~~~~~~");
		} else {
			System.out.println("평일은 열심히 공부하자!");
		}
		
		// 3.
		int month = date.getMonth() + 1;
		// System.out.println(month);
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}

}
