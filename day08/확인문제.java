package 조건문;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) {
		// Scanner 사용하기
		// 1. id와 pw를 입력해서
		// id가 root이고, pw가 1234이면 로그인 성공!
		// 2. 사과 구매 갯수, 사과 한 개당 가격입력
		// 	    딸기 구매 갯수, 딸기 한 개당 가격입력
		// 다음과 같이 출력
		// 사과 구매 가격은 5500원입니다
		// 딸기 구매 가격은 4500원입니다
		// 전체 구매 가격은 10000원입니다
		// 심화문제
		// 3.
		// - 시작값, 종료값 입력
		// 시작부터 종료값까지 모두 더해서 출력
		// 4.
		// 시작값, 종료값, 점프값 입력
		// 시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
		// 더한 값이 100을 넘으면 프로그램 종료
		
		// 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력 : ");
		String id = sc.next();
		
		System.out.print("비밀번호를 입력 : ");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");

		}
		
		// 2.
		System.out.print("사과 구매 개수 : ");
		int ap = sc.nextInt();
		System.out.print("사과 1개 가격 : ");
		int am = sc.nextInt();
		System.out.print("딸기 구매 개수 : ");
		int st = sc.nextInt();
		System.out.print("딸기 1개 가격 : ");
		int sm = sc.nextInt();
		
		int result = (ap*am) + (st*sm);
		System.out.println("전체 구매 가격 : " + result + "원");
		
		// 3.
		System.out.print("시작 값을 입력 : ");
		int start = sc.nextInt();
		System.out.print("종료 값을 입력 : ");
		int last = sc.nextInt();
		int sum = 0;
		
		for (int i = start; i <= last; i++) {
			sum = sum + i;
		}
		
		System.out.println(start + "부터 " + last + "까지의 더한 값 : " + sum);
		
		// 4.
		System.out.print("시작 값을 입력 : ");
		int start2 = sc.nextInt();
		System.out.print("종료 값을 입력 : ");
		int last2 = sc.nextInt();
		System.out.print("점프 값을 입력 : ");
		int jump = sc.nextInt();
		int sum2 = 0;
		int last_num = 0;
		
		for (int i = start2; i <= last2; i++) {
			if (sum2 < 100) {
				sum2 = sum2 + i;
				i = i + jump;
			} else {
				last_num = i;
				break;
			}
		}
		System.out.println("시작 값은 : " + start2);
		System.out.println("종료 값은 : " + last2);
		System.out.println("마지막으로 더한 값은 : " + last_num);
		System.out.println("더한 값은 : " + result);
	}

}
