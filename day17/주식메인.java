package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 주식메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 410);
		f.getContentPane().setBackground(Color.pink);
		FlowLayout lay = new FlowLayout();
		f.setLayout(lay);
		Font font = new Font("궁서", Font.BOLD, 40);
		JButton btn1 = new JButton("삼 성 전 자");
		JButton btn2 = new JButton("SK하이닉스");
		JButton btn3 = new JButton(" L G 전 자 ");
		JButton btn4 = new JButton("크롤링 시작");
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn4.setFont(font);

		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.yellow);
		btn3.setBackground(Color.yellow);
		btn4.setForeground(Color.white);
		btn4.setBackground(Color.black);

		JLabel label = new JLabel("CODE");
		label.setFont(font);

		JTextField text = new JTextField(7);
		text.setFont(font);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(label);
		f.add(text);
		f.add(btn4);

		// 액션기능
		// 1) 액션기능 추가
		// 2) 클릭했을 때 누가 담당할지 부품을 만들어라
		// 3) 클릭했을 때 어떻게 처리할 지를 코딩
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드 005930을 주면서 크롤링하는 부품에게 크롤링 요청
				System.out.println("< 삼성전자 >");
				네이버증권크롤링비교 c = new 네이버증권크롤링비교();
				c.naver("005930");
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				System.out.println("< SK하이닉스 >");
				네이버증권크롤링비교 c = new 네이버증권크롤링비교();
				c.naver("000660");
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				System.out.println("< LG전자 >");
				네이버증권크롤링비교 c = new 네이버증권크롤링비교();
				c.naver("066570");
			}
		});
		// 크롤링 시작
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				네이버증권크롤링비교 c = new 네이버증권크롤링비교();
				String code = text.getText();
				if (code.equals("005930")) {
					System.out.println("< 삼성전자 >");
					c.naver("005930");
					text.setText("");
				} else if (code.equals("000660")) {
					System.out.println("< SK하이닉스 >");
					c.naver("000660");
					text.setText("");
				} else if (code.equals("066570")) {
					System.out.println("< LG전자 >");
					c.naver("066570");
					text.setText("");

				}
				
			}
		});

		f.setVisible(true);

	}

}