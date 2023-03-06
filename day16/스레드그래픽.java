package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	// add(). setSixe(), ... 다 갖고 있음
	JLabel count, image, time; // 전역변수 선언

	public static void main(String[] args) {
		// 스레드그래픽 == JFrame
		스레드그래픽 f = new 스레드그래픽(); // --- 1
		// 객체생성시 클래스 이름과 동일한 메서드를 자동호출
		// ==> 생성자 메서드를 자동호출
	}

	// 생성자 호출해서 함수처럼 사용
	public 스레드그래픽() { // --- 2
		setTitle("내 스레드 그래픽");
		setSize(550, 250);
		getContentPane().setBackground(Color.pink);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 30);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		count.setFont(font);
		time.setFont(font);
		add(count);
		add(image);
		add(time);
		
		// 스레드 객체 3개 만들어서 start시켜보자
		카운트스레드2 count2 = new 카운트스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();
		
		count2.start();
		image2.start();
		time2.start();
		
		setVisible(true);
	}
	
	// 내부 클래스 (inner class) ==> 전역변수를 공유할 목적으로 사용
	// (외부 클래스와 이름이 같으면 안된다)
	public class 카운트스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트 >> " + i);
				// CPU에게 스레드 쉬는 시간 텀을 알려준다
				// thread를 잠깐 재울 수 있음
				// CPU는 외부자원
				// 자바가 외부 자원을 연결할 때는 엄청 위험하다고 인식
				// 만약에 문제가 생기면 어떻게 할지를 코드를 반드시 명시
				// file저장, 네트워크 연결, 외부자원 사용시
				try {
					Thread.sleep(2000);	// 2초
				} catch (Exception e) {
					System.out.println("CPU 연결 문제 생김");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText(date + "");
				try {
					Thread.sleep(1000);	// 1초
				} catch (Exception e) {
					System.out.println("CPU 연결 문제 생김");
				}
			}
			
		}
	}
	
	public class 이미지스레드2 extends Thread{
		@Override
		public void run() {
			String[] images = {"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);	// 5초
				} catch (Exception e) {
					System.out.println("CPU 연결 문제 생김");
				}
			}
		}
	}

}	// class