package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무 값이나 발생시키는 부품 => Random
		Random r = new Random();	// 씨앗값. seed값 -> 동일한 랜덤값만이 추출됨
		
		 for (int i = 0; i < 6; i++) {
		 	// int : -21억 ~ +21억 랜덤 생성
		 	System.out.println("로또 번호 : " + (r.nextInt(45) + 1)); // 0~9
		 }
		
		// 2~10
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(9) + 2)); // 0~9
			// 0~8 = +2 ==> 2~10
		}
		
		// 3~30
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(28) + 3)); // 0~9
			// 0~27 = +3 ==> 3~30
		}
	}

}