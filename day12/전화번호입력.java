package 배열복습;

public class 전화번호입력 {

	public static void main(String[] args) {
		String s = "	010-245-1234	";
		// 양쪽 공백 제거
		String s2 = s.trim(); // 12
		// -를 기준으로 문자열을 3개로 분리
		String[] s3 = s2.split("-"); // {"010", "245", "1234"}
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);

		// 배열의 첫번째 문자열을 구분
		if (s3[0].equals("011")) {
			System.out.println("SK");
		} else if (s3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		// 배열의 두번째 문자열의 길이 구분
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		// 전체 길이 구하기
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		System.out.println(total);

		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효한 전화번호");
		}
		
		// 길이 구하는거 반복문
		int total2 = 0;
		for (int i = 0; i < s3.length; i++) {
			total2 = total2 + s3[i].length();
		}
		System.out.println(total2);
		
		System.out.println(s2);
		String s222 = s2.replace("-", "");	// 대체하기
		System.out.println(s222);
	}

}