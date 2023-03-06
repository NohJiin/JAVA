package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(250, 400);
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		// b1.setText("로그인");
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드");
		
		JLabel text3 = new JLabel(); //글씨
		// text3.setText("로그인 결과");
		
		JTextField input1 = new JTextField(12);
		JTextField input2 = new JTextField(12);
		
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		input2.setFont(font);
		
		b1.setBackground(Color.green); //배경색
		b1.setForeground(Color.white); //버튼의 위색, 글자색
		input1.setBackground(Color.yellow); //배경색
		input1.setForeground(Color.black); //버튼의 위색, 글자색
		input2.setBackground(Color.yellow); //배경색
		input2.setForeground(Color.black); //버튼의 위색, 글자색
		text3.setForeground(Color.red); //버튼의 위색, 글자색
		
		
		ImageIcon icon = new ImageIcon("1.png");
		
		b1.setIcon(icon);
		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(text3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				
				if (id.equals("root") && pw.equals("1234")) {
					// JOptionPane.showMessageDialog(f, "로그인 성공");
					// text3.setText("로그인 성공!");
					ImageIcon icon = new ImageIcon("ok.png");
					text3.setIcon(icon);
				} else {
					// JOptionPane.showMessageDialog(f, "로그인 실패");
					// text3.setText("로그인 실패!");
					input1.setText("");
					input2.setText("");
					ImageIcon icon = new ImageIcon("Kermit.png");
					text3.setIcon(icon);
				}
			}
		});
		
		
		f.setVisible(true);

	}

}
