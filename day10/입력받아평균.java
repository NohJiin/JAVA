package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용!
		// 1. 배열을 만들어라
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요");
			// 숫자로 변환한 값을 배열의 해당 인뎃그에 값으로 넣자
			jumsu[i] = Integer.parseInt(data);
		}
		for (int i : jumsu) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1. 전체 합계 구해서 평균 구하기
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + String.format("%.1f", (double)sum/jumsu.length));
		
		// 2. 300이상되는 숫자만 찾아서 합계를 구하기
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		
		// 3. 심화문제 : 300이상 되는 위치인 index를 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("index : " + i + " ==> 점수 : " + jumsu[i]);
			}
		}
		// 4. 최대값 구하기
		int max = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (jumsu[i] > max) {
				max = jumsu[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
		// max index 구하기
		int max_index = 0;
		for (int i = 1; i < jumsu.length; i++) {
			if (jumsu[i] > jumsu[max_index]) {
				max_index = i;
			}
		}
		System.out.println("가장 큰 수 >> " + " [" + max_index + "] : " + max);
	}

}