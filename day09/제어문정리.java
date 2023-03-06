package 복습;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		// 확인문제 풀이
		
		// 1.
		Scanner sc = new Scanner(System.in);
		System.out.print("id입력 >> ");
		String id = sc.next();		// String 입력
		System.out.print("pw입력 >> ");
		String pw = sc.next();		// String 입력
		
		// 조건이 여러개인 경우 ==> 논리연산자(조건1 && 조건2)
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		// 2.
		System.out.println("사과 구매 갯수 >> ");
		int aCount = sc.nextInt();		// String -> int
		System.out.println("사과 한 개당 가격입력 >> ");
		int aPrice = sc.nextInt();
		System.out.println("딸기 구매 갯수 >> ");
		int bCount = sc.nextInt();
		System.out.println("딸기 한 개당 가격입력 >> ");
		int bPrice = sc.nextInt();
		
		int aTotal = aCount * aPrice;
		int bTotal = bCount * bPrice;
		int total = aTotal + bTotal;
		
		System.out.println("사과 구매 금액은 " + aTotal + "원");
		System.out.println("딸기 구매 금액은 " + bTotal + "원");
		System.out.println("전체 구매 금액은 " + total + "원");
		
		// 3.
		System.out.println("시작값 >> ");	// 1, 1000
		int start = sc.nextInt();
		System.out.println("종료값 >> ");	// 10, 2000
		int end = sc.nextInt();
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종 더한 값은 " + sum);
		
		// 4.
		System.out.println("시작값 >> ");	// 1, 1000
		int start2 = sc.nextInt();
		System.out.println("종료값 >> ");	// 10, 2000
		int end2 = sc.nextInt();
		System.out.println("점프값 >> ");
		int jump = sc.nextInt();
		int sum2 = 0;
		
		for (int i = start; i <= end; i = i + jump) {
			sum2 = sum2 + i;
			if (sum2 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + sum2);
		
		sc.close();		// 반드시 닫자!
	}

}