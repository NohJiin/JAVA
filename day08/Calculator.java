package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		TextField input1 = new TextField(15);
		TextField input2 = new TextField(15);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		ImageIcon icon = new ImageIcon("Calculator.png");
		
		f.setSize(500, 800);
		f.setLayout(lay);
		f.setBackground(Color.lightGray);

		text1.setIcon(icon);
		text2.setText("숫자1");
		input1.setBackground(Color.yellow);
		text3.setText("숫자2");
		input2.setBackground(Color.yellow);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.red);
		b1.setText("+");
		b2.setBackground(Color.blue);
		b2.setForeground(Color.red);
		b2.setText("-");
		b3.setBackground(Color.blue);
		b3.setForeground(Color.red);
		b3.setText("X");
		b4.setBackground(Color.blue);
		b4.setForeground(Color.red);
		b4.setText("/");
		
		Font font = new Font("돋움", 1, 50);
		
		text2.setFont(font);
		input1.setFont(font);
		text3.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// input1, input2에 있는 글자를 가져온다
				String s1 = input1.getText();	// 333
				String s2 = input2.getText();	// 222
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// input1, input2에 있는 글자를 가져온다
				String s1 = input1.getText(); // 333
				String s2 = input2.getText(); // 222

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// input1, input2에 있는 글자를 가져온다
				String s1 = input1.getText(); // 333
				String s2 = input2.getText(); // 222

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// input1, input2에 있는 글자를 가져온다
				String s1 = input1.getText(); // 333
				String s2 = input2.getText(); // 222

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = (double)n1 / n2;
				JOptionPane.showMessageDialog(f, String.format("%.3f", result));
			}
		});
		
		f.add(text1);
		f.add(text2);
		f.add(input1);
		f.add(text3);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);

	}

}
