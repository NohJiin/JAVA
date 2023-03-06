package 배열기본;

// Random의 위치는 java폴더 아래 util아래 있어요
import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		//
		int[] jumsu2 = new int[1000];
		
		Random r = new Random(42);
		
		// 2부터 20까지 임의로 만들어서 배열에 넣어보자
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;		// 19 : 0~18 +2 ==> 2~20
		}
		// 전체프린트
		for (int i : jumsu2) {
			System.out.println(i);
		}
		
		// 3이상인 숫자 몇 개인지 프린트
		// 배열은 전체를 가지고와서 3이상인 수 체크
		// 갯수를 세어라
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++;
				sum = sum + jumsu2[i];
			}
		}
		System.out.println("15이상인 개수 : " + count);
		System.out.println("15이상인 수들의 합 : " + sum);
		
	}
	
}