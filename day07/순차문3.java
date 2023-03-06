package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 기본 순차문 : 입력 -> 처리 -> 출력
		
		// 입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것
		// 다이얼로그 곳에서 입력한 값은 컴퓨터는 무조건  String으로 인식힌다
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
		// 처리 -> 숫자 더라기 연산
		// String으로 int로 변경해주어야함
		int data11 = Integer.parseInt(data1);	// 다이얼로그에서 입력받은 문자 -> 정수로 변경
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		// 출력 -> 모니터 화면에 띄우기
		System.out.println(result);
		System.out.println(result2);
	}

}
