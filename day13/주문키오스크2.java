package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 주문키오스크2 {
	
	// 심화
	// 1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요
	// f.setTitle("떡볶이 : " + count1 + "우동 : " + count2 + "라면 : " + count3);
	// 2) 음식의 값을 다 분리, 떡볶이 = 5000, 우동 = 4000, 라면 = 3500
	
	static int total;	// 0으로 초기화, 전역변수
	static int count1;	// 떡볶이 수
	static int count2;	// 우동 수
	static int count3;	// 라면 수
	
	final static int bunPRICE = 5000;	// 떡볶이 가격
	final static int uPRICE = 4000;		// 우동 가격
	final static int raPRICE = 3500;	// 라면 가격
	
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("home.png");
		JFrame f = new JFrame();
		f.setSize(500, 450);
		f.setTitle("음식주문 시스템");
		f.getContentPane().setBackground(Color.pink);
		FlowLayout lay = new FlowLayout();
		f.setLayout(lay);

		JLabel coast1 = new JLabel();	// 떡볶이 결제창
		JLabel coast2 = new JLabel();	// 우동 결제창
		JLabel coast3 = new JLabel();	// 라면 결제창
		coast1.setText("떡볶이 :      ");
		coast2.setText("우동 :      ");
		coast3.setText("라면 :      ");
		Font font = new Font("굴림", Font.BOLD, 20);
		// Font font2 = new Font("굴림", 0, 15);
		coast1.setFont(font);
		coast2.setFont(font);
		coast3.setFont(font);
		
		JLabel num = new JLabel("개수 : ");
		num.setFont(font);
		JLabel text = new JLabel("0개");
		text.setFont(font);
		coast1.setFont(font);
		coast2.setFont(font);
		coast3.setFont(font);

		JButton btn1 = new JButton("떡볶이");
		btn1.setFont(font);
		btn1.setBackground(Color.yellow);
		JButton btn2 = new JButton("우동");
		btn2.setFont(font);
		btn2.setBackground(Color.yellow);
		JButton btn3 = new JButton("라면");
		btn3.setFont(font);
		btn3.setBackground(Color.yellow);
		JLabel imglabel = new JLabel();
		imglabel.setIcon(icon);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(num);
		f.add(text);
		f.add(imglabel);
		f.add(coast1);
		f.add(coast2);
		f.add(coast3);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("bun.png");
				imglabel.setIcon(icon);
				total++;
				count1++;
				text.setText(total + "개");
				coast1.setText("떡볶이 : " + count1*bunPRICE + "원");
				f.setTitle("떡볶이 : " + count1 + " 우동 : " + count2 + " 라면 : " + count3);
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("u.png");
				imglabel.setIcon(icon);
				total++;
				count2++;
				text.setText(total + "개");
				coast2.setText("우동 : " + count2*uPRICE + "원");
				f.setTitle("떡볶이 : " + count1 + " 우동 : " + count2 + " 라면 : " + count3);
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("ra.png");
				imglabel.setIcon(icon);
				total++;
				count3++;
				text.setText(total + "개");
				coast3.setText("라면 : " + count3*raPRICE + "원");
				f.setTitle("떡볶이 : " + count1 + " 우동 : " + count2 + " 라면 : " + count3);
			}
		});
		
		f.setVisible(true);
	}
}