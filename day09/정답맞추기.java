package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸기
		int target = r.nextInt(10);	// 0~9
		int count = 0;

		int data = 0;
		while (true) {
			System.out.print("생각한 정답은? ");
			data = sc.nextInt();
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 : " + count);
				System.out.println("프로그램을 종료합니다.");
				break;		// 이것이 없으면 sc.close()가 실행되지 않음
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요.");
				// 1. 힘트주기
				// data가 target보다 크면 "너무 커요"
				// data가 target보다 작으면 "너무 작아요"
				if (data > target) {
					System.out.println(">> 너무 커요");
				} else {
					System.out.println(">> 너무 작아요");
				}
				
				// 3. 전체 시도 횟수 카운트
				count++;
			} 
		}
		
		sc.close();
	}

}