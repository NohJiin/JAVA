package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		f.setSize(350, 350);
		f.setLayout(lay);
		f.setTitle("나의 카운터 프로그램");

		JButton plus = new JButton("1 더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1 빼기");
		JLabel number = new JLabel();
		number.setText(0 + "");
		
		Font font = new Font("돋움", Font.BOLD, 15);
		Font font2 = new Font("궁서", Font.BOLD, 200);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		number.setFont(font2);

		plus.setBackground(Color.yellow);
		reset.setBackground(Color.blue);
		reset.setForeground(Color.white);
		minus.setBackground(Color.yellow);
		number.setForeground(Color.red);

		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		f.setVisible(true);
	}

}