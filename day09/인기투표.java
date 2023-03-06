package 제어문문제;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		System.out.println("인기투표 시스템");
		System.out.println("===========");
		
		Scanner sc = new Scanner(System.in);
		int iu = 0;		// 아이유 카운트
		int jeans = 0;	// 뉴진스 카운트
		int bts = 0;	// 방탄 카운트
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			int data = sc.nextInt();
			if (data == 1) {
				iu++;
			} else if (data == 2) {
				bts++;
			} else if (data == 3) {
				jeans++;
			} else if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		System.out.println("------------");
		System.out.println("아이유 : " + iu + "표");
		System.out.println("방탄 : " + bts + "표");
		System.out.println("뉴진스 : " + jeans + "표");
		System.out.println("------------");
		
		sc.close();
	}

}