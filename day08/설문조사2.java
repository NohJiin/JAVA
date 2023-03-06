package 조건문;

import javax.swing.JOptionPane;

public class 설문조사2 {

	public static void main(String[] args) {
		// 인기투표
		// 1) 아이유  2) 유재석 3) BTS
		int iu = 0;
		int jeans = 0;
		int bts = 0;
		int one = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("당신의 최애는? 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")){
				jeans++;
			} else if (data.equals("3")){
				bts++;
			} else {
				one++;
			}
		}
		System.out.println("[ 투표결과 ]");
		System.out.println("IU : " + iu + "표");
		System.out.println("NewJeans : " + jeans + "표");
		System.out.println("BTS : " + bts + "표");
	}

}