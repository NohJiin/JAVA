package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 주문키오스크 {
	static int count;	// 0으로 초기화, 전역변수
	final static int PRICE = 5000;
	
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("bun.png");
		JFrame f = new JFrame();
		f.setSize(450, 450);
		f.setTitle("음식주문 시스템");
		FlowLayout lay = new FlowLayout();
		f.setLayout(lay);

		JLabel coast = new JLabel();
		coast.setText("결제금액 :      ");
		Font font = new Font("굴림", Font.BOLD, 20);
		// Font font2 = new Font("굴림", 0, 15);
		coast.setFont(font);
		JLabel text = new JLabel("  0개");
		text.setFont(font);
		// text.setFont(font2);
//		JTextField num = new JTextField(5);
//		num.setFont(font);
		coast.setFont(font);

		JButton btn1 = new JButton("떡볶이");
		btn1.setFont(font);
		JButton btn2 = new JButton("우동");
		btn2.setFont(font);
		JButton btn3 = new JButton("라면");
		btn3.setFont(font);
		JLabel imglabel = new JLabel();
		imglabel.setIcon(icon);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(text);
		f.add(imglabel);
		f.add(coast, BorderLayout.SOUTH); // ?

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("bun.png");
				imglabel.setIcon(icon);
				count++;
				text.setText(count + "개");
				coast.setText("결제금액 : " + count*PRICE + "원");
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("u.png");
				imglabel.setIcon(icon);
				count++;
				text.setText(count + "개");
				coast.setText("결제금액 : " + count*PRICE + "원");
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("ra.png");
				imglabel.setIcon(icon);
				count++;
				text.setText(count + "개");
				coast.setText("결제금액 : " + count*PRICE + "원");
			}
		});
		
		f.setVisible(true);
	}
}