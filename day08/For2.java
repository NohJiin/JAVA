package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) {		// 무한루프(반복), while(true)
			System.out.println("잘쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			
			// 연산자는 기본데이터만 비교 가능
			// String부품에서 제공하는 기능을 사용해서 비교해주어야 함
			if (data.equals("y")) {
				System.out.println("안녕히가세요~");
				// if는 자체적으로 break가 있음
				// 따라서 아래의 break는 for문의 break이다
				break;		
			}
			
		}
	}

}