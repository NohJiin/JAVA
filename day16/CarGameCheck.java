package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGameCheck extends JFrame {

	public static void main(String[] args) {
		// frame 생성
		CarGameCheck f = new CarGameCheck();
	}

	public CarGameCheck() {
		setTitle("나의 자동차 굴러가기");
		setSize(700, 350);
		setLayout(null);
		
		CarThread c1 = new CarThread("car01.png", 30, 0);
		CarThread c2 = new CarThread("car02.png", 30, 100);
		CarThread c3 = new CarThread("car03.png", 30, 200);
		
		c1.start();
		c2.start();
		c3.start();

		setVisible(true);
	}

	public class CarThread extends Thread {
		int x,y;
		JLabel label;
		
		// 자동차 만들기
		public CarThread(String image, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(image);
			label = new JLabel(icon);
			label.setBounds(x, y, 150, 100);
			add(label);
		}
		
		// 덮어쓰기
		@Override
		public void run() {
			Random r = new Random ();
			int move = r.nextInt(30) + 1;	// 1~30
			for (int i = 0; i < 200; i++) {
				x = x + move;
				// x의 위치 변경
				label.setBounds(x, y, 150, 100);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("오류 발생했심");
				}
			}
		}
	}

}