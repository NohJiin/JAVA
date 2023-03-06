package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		// 10명에게 배부른가요? 물어보고
		// 배가 부르다고 한 사람, 안부르다고 한 사람 몇명인지 카운트
		
		int full = 0;		// 배부른 사람
		int noFull = 0;		// 안배부른 사람
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름 2)배안부름");			
			if(data.equals("1")) {
				full = full + 1;
			} else if(data.equals("2")) {
				noFull++;
				// 1만큼 증가시키고 싶을 때 사용
			}
		}
		System.out.println("배부른 사람 : " + full + "명");
		System.out.println("배 안부른 사람 : " + noFull + "명");
	}

}