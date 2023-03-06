package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무 값이나 발생시키는 부품 => Random
		Random r = new Random(100);	// 씨앗값. seed값 -> 동일한 랜덤값만이 추출됨
		
		for (int i = 0; i < 6; i++) {
			// int : -21억 ~ +21억 랜덤 생성
			System.out.println("로또 번호 : " + r.nextInt(10)); // 0~9
		}
	}

}
