package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {

	static int index = 2; // 현재 시작 위치 (2부터 시작)

	public static void main(String[] args) {
		String[] title = { "타이타닉", "상견니", "유령", "더 퍼스트 슬램덩크", "장화신은 고양이" };
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(400, 530);
		f.getContentPane().setBackground(Color.black);

		Font font = new Font("궁서", Font.BOLD, 40); // 객체 생성시 특정한 입력값을 넣지 않으면 못 만들게 할 수 있다

		// 배치부품(객체)를 바꾸어주지 않으면 경계 레이아웃을 사용하도록 셋팅
		// BorderLayout

		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setFont(font);
		top.setForeground(Color.white);
		f.add(top, BorderLayout.NORTH); // 북쪽으로 위치

		JLabel center = new JLabel();
		center.setHorizontalAlignment(0);
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[2])); // double -> String으로 변경
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.yellow);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<");
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.setBackground(Color.white);

		// 액션처리하는 방법 1)액션기능을 add 2)클릭액션이 있을 때 처리할 부품을 만들자
		// 3)클릭액션이 있을때 어떻게 처리할지 내용을 코딩
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top,center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; // index -= 1;
				} else {
					index = title.length - 1;
					top.setText(title[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
					under.setText(jumsu[index] + "");
					// JOptionPane.showMessageDialog(f, "페이지가 더이상 없습니다.");
				}
			}
		});

		JButton right = new JButton(">");
		right.setFont(font);
		f.add(right, BorderLayout.EAST);
		right.setBackground(Color.white);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < title.length - 1) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; // index += 1;
				}
				else {
					index = 0;
					top.setText(title[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
					under.setText(jumsu[index] + "");
					// JOptionPane.showMessageDialog(f, "페이지가 더이상 없습니다.");
				}
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}