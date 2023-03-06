package 배열응용;

import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		// 수능 10000명의 점수를 처리
		// 랜덤으로 10000명의 점수를 넣고
		// 0~450
		// 1)만점자가 몇명인지? 누구인지(인덱스)
		// 2)0점이 몇 명인지?
		// 3)평균이 몇 점인지? 합계먼저 구해야함
		// 4)평균보다  +,-50점인 학생의 수
		
		Random r = new Random(42);
		// 점수 처리
		int[] score = new int[10000];
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451);	// 0~450
		}
		
		// 1) for문 ==> for_each문으로도 가능하다!
		int manjum = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i] == 450) {
				manjum++;
				System.out.println("만점자 : " + i + "번");
			}
		}
		System.out.println("수능 만점자는 " + manjum + "명 입니다.");
		
		// 2)
		int bbangjum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 0) {
				bbangjum++;
			}
		}
		System.out.println("0점은 " + bbangjum + "명 입니다.");
		
		// 3)
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		double average = Double.parseDouble(String.format("%.2f", (double)sum/score.length));
		System.out.println("수능의 평균 점수 : " + average);
		
		// 4) 심화
		int range = 0;
		for (int j = 0; j < score.length; j++) {
			if (score[j] >= (average - 50) && score[j] <= (average + 50)) {
				range++;
			}
		}
		System.out.println("평균보다 -50점~+50점 사이인 학생의 수 : " + range);
		
		// 점수의 상위 30%..? 평균..?
		Integer[] score2 = new Integer[10000];
		// 배열 하나 복사
		for (int i = 0; i < score2.length; i++) {
			score2[i] = score[i];
		}
		
		Arrays.sort(score2, Collections.reverseOrder());
		
		double higher = 10000 * 0.3;
		int sum2 = 0;			// 상위30%학생들의 성적 평균
		for (int i = 0; i < (int)higher; i++) {
			sum2 = sum2 + score2[i];
		}
		System.out.println("상위30% 학생들의 성적 평균 >> " + String.format("%.2f", (double)sum2/higher));
	}

}