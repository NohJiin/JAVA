package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

// import javax.swing.*;  => 대체 가능
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JTextField input = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		
		f.setSize(450, 150);
		f.setLayout(lay);
		
		text1.setText("아이디");
		text2.setText("비밀번호");
		
		b1.setText("나는 버튼1");
		b2.setText("나는 버튼2");
		
		Font font = new Font("굴림", 1, 20);
		
		text1.setFont(font);
		input.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		f.add(text1);
		f.add(input);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);

		f.setVisible(true);
	}

}