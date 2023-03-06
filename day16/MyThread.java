package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {
	int x, y;
	JLabel label; // 전역변수로 선언 : 얘가 움직여야하니까 접근 가능 해야함

	// 생성자 = 멤버변수 초기화하려고 사용한다
	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100); // JFrame에 붙은 위치 지정
	}

	@Override
	public void run() {
		// 동시에 실행하고 싶은 내용
		// 모든 스레드가 오른쪽으로 움직이고 싶음
		// 화면에서 오른쪽으로 움직이는 것은 x를 늘려주는 것
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50); // 0~49
			x = x + move;
			label.setBounds(x, y, 100, 100); // 다시 위치 지정
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}