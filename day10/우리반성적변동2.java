package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0; // 동일한 개수 누적
		int count2 = 0; // 동일하지 않은 개수 누적

		for (int i = 0; i < n2.length; i++) {
			System.out.print((n1[i] == n2[i]) + "\t");
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
			}
		}

		System.out.println();
		System.out.println("1-2학기 성적이 동일한 학생 수 >> " + count);
		System.out.println("1-2학기 성적이 동일하지 않은 학생 수 >> " + count2);

		// 2학기에 성적이 더오른 학생은 몇 명? 누구?
		// 1학기 성적이 더 좋았던 학생은 몇 명? 누구?
		int higher = 0;
		int higher2 = 0;

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] > n2[i]) {		// 1학기 성적이 더 높은 경우
				higher++;
			} else if (n1[i] < n2[i]) { // 2학기 성적이 더 높은 경우
				higher2++;
			}
		}
		System.out.println("1학기 성적이 더 좋은 사람의 수 : " + higher);

		System.out.println("2학기 성적이 더 좋은 사람의 수 : " + higher2);

	}

}