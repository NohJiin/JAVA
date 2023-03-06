package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임생성
		JFrame f = new JFrame();
		// 2. 프레임 설정, 실행해서 눈으로 확인
		// 레이아웃 부품 설정하지 않음
		f.setSize(1500, 800);
		f.setLayout(null);

		// 3. 버튼을 넣을 배열을 생성 : 500개
		JButton[] button = new JButton[500];

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼" + i + "번");
		}

		// 심화-1) 버튼 색을 몇 가지 지정하여 임의로 설정. 힌트 color배열
		Color[] col = {Color.cyan, Color.yellow, Color.pink};
		// col[r.nextInt(col.length)]		// 0~2
		

//		for (int i = 0; i < button.length; i++) {
//				button[i].setBackground(col[0]);
//			} else if (i % 3 == 1) {
//				button[i].setBackground(col[1]);
//			} else {
//				button[i].setBackground(col[2]);
//			}
//		}

		// 4. 버튼을 500개 만들어서 배열에 넣기
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정후 f에 붙이기
		Random r = new Random();
		for (int i = 0; i < button.length; i++) {
			int x = r.nextInt(1500);
			int y = r.nextInt(800);
			button[i].setBounds(x, y, 100, 50);
			// Color 배열 만들어서 적용하기
			button[i].setBackground(col[r.nextInt(col.length)]);
			f.add(button[i]);
		}

		// 심화-2) f에 배경색을 넣자
		f.getContentPane().setBackground(Color.black);
		
		f.setVisible(true);
	}

}