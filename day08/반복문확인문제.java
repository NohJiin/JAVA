package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		
		f.setSize(300, 500);
		f.setLayout(lay);
		
		JButton b1 = new JButton("별 10개");
		JButton b2 = new JButton("커피*5개");
		JButton b3 = new JButton("커피*우유3");
		JButton b4 = new JButton("1:짱!");
		
		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.cyan);
		
		Font font = new Font("굴림", 1, 45);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		// 1) button에 액션 기능을 추가하는 것을 설정
		// 2) 클릭 액션이 있을 때 어떤 부품이 액션처리를 어떻게할지 코딩해주기
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리내용을 여기에 쓴다
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();	
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1) + " : 짱!");
				}
			}
		});
		
		
		f.setVisible(true);
	}

}