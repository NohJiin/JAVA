package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// Class 순차문2
		// 1. 입력
		// 당신이 좋아하는 운동은? 헬스
		// 당신이 운동하기 좋아하는 요일은? 금요일
		// 2. 처리
		// 금요일에 저는 헬스를 합니다.
		// 3. 출력

		String e = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String d = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String result = d + "에 저는 " + e + "를 합니다.";
		
		System.out.println(result);
	}

}