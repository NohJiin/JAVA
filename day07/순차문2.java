package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// BMI 구하기
		
		String h = JOptionPane.showInputDialog("당신의 키는 몇입니까?");
		String w = JOptionPane.showInputDialog("당신의 몸무게는 몇입니까?");
		
		double h2 = Double.parseDouble(h);
		double w2 = Double.parseDouble(w);
		
		h2 = h2 * 0.01;
		
		double BMI = w2/(h2*h2);
		// String bmi = String.format(bmi, %.3);
		
		System.out.println("당신의 BMI지수는 " + BMI + "입니다");
		JOptionPane.showMessageDialog(null, BMI);
		
	}

}