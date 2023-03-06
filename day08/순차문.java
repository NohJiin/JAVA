package 복습;

// jOptionPane이 javax폴더 아래 swig폴더 아래에 있음을 알려줌

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력을 받아서 + 처리해서 출력\
		// 프로그래밍은 손으로 치는 값은 모두 다 스트링으로 취급(문자열)
		// RAM에 저장공간을 만드는 것 => 선언
		// 선언할 때 저장공간인 변수가 만들어진다
		// 데이터타입 변수명
		
		// 입력
		String num = JOptionPane.showInputDialog("숫자1 입력");
		String num2 = JOptionPane.showInputDialog("숫자2 입력");
		
		// 처리
		// 정수로 변경하여 처리하려면 프로그래머가 정수로 바꾸어주는 부품을 써서 처리
		int n = Integer.parseInt(num);
		int n2 = Integer.parseInt(num2);
		
		System.out.println("정수끼리의 나누기 : " + (n/n2));  // 이렇게하면 결과값이 0이 나온다
		
		double result = (double)n / n2;
		System.out.println("실수로 변경하여 나누기 : " + String.format("%.2f", result));
		// System.out.println("%.3f", (double)n / n2); 이렇게도 되나요..? 근데 콘솔에서만 된다는데?(double)n / n2
		
	}

}