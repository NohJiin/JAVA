package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.yellow);
		f.setSize(1200, 800);
		
		// 버튼 200개 들어갈 배열을 생성
		JButton[] b = new JButton[200];
		
		// 버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("나는 버튼 " + i);
		}
		
		// 위치를 지정해서 넣어주기
		f.setLayout(null);
		// null ==> 조립해서 넣을 부품의 주소가 램에 없음
		// 첫번째 버튼을 가로 500, 세로 50, 위치, 크기 100 x 50
		// 위치와 크기만 지정
//		b[0].setBounds(200, 200, 100, 50);
//		b[1].setBounds(300, 300, 100, 50);
		
		Random r = new Random();
		for (int i = 0; i < b.length; i++) {
			int x = r.nextInt(1000);
			int y = r.nextInt(800);
			b[i].setBounds(x, y, 100, 50);
			f.add(b[i]);
		}
//		f.add(b[0]);
//		f.add(b[1]);
		
		f.setVisible(true);
	}

}