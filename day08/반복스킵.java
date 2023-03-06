package 반복문;

public class 반복스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터중에서 짝수만 프린트!
		for (int i = 1; i <= 10; i++) {
			// i == 8 => 종료
			if (i % 2 != 0) {	// 홀수
				continue;
			} else if (i == 8) {
				// break;		for문 종료
				System.exit(0);		// 프로그램 자체를 종료
				// 0 : 정상종료, 0이 아닌 다른 값 : 비정상종료
			}
			System.out.println(i);
		}
		System.out.println("휴~ for문 다 끝났다.@@@");
	}

}