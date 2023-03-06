package 반복문;

public class For1 {

	public static void main(String[] args) {
		// 3번 반복문
		for (int i = 0; i < 3; i++) {
			// for 지역{}안에서만 i변수는 쓸 수 있음
			// 지역변수(local)
			// i = 0, i<3(true), 처리, i++
			System.out.println(i + " 내가 반복 - 1");
		}
		
		// 100번 반복 --> 내가 반복2 >> i의 값도 출력
		for (int i = 0; i < 100; i++) {		// 0~99
			System.out.println("내가 반복 2 >> " + i);
		}
		
		// 10번 반복 --> 내가반복3 >> i번째 실행중
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복 3 >> " + (i+1) + "번째 실행중");
		}
	}

}