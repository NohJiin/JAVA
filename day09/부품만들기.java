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

public class 부품만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("Kermit.png");
		
		JLabel img = new JLabel();
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		JLabel text4 = new JLabel();
		JTextField input1 = new JTextField(15);
		JTextField input2 = new JTextField(15);
		JTextField input3 = new JTextField(15);
		JTextField input4 = new JTextField(15);
		JButton b = new JButton("회원가입 처리");
		Font font = new Font("궁서", 1, 30);
		
		text1.setText("아이디 입력");
		text2.setText("패스워드 입력");
		text3.setText("이름 입력");
		text4.setText("전화번호 입력");
		
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b.setFont(font);
		
		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		text3.setForeground(Color.blue);
		text4.setForeground(Color.blue);
		input1.setForeground(Color.red);
		input1.setBackground(Color.yellow);
		input2.setForeground(Color.red);
		input2.setBackground(Color.yellow);
		input3.setForeground(Color.red);
		input3.setBackground(Color.yellow);
		input4.setForeground(Color.red);
		input4.setBackground(Color.yellow);
		b.setBackground(Color.pink);
		b.setForeground(Color.blue);
		
		img.setIcon(icon);
		
		f.add(img);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);		
		f.add(input4);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String number = input4.getText();
				
				if (id.equals("root") && pw.equals("1234") && name.equals("No") && number.equals("0927")) {
					 JOptionPane.showMessageDialog(f, "회원가입 성공!");
					// text3.setText("로그인 성공!");
					// ImageIcon icon = new ImageIcon("ok.png");
					// text3.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패!");
					// text3.setText("로그인 실패!");
					// input1.setText("");
					// input2.setText("");
					// ImageIcon icon = new ImageIcon("Kermit.png");
					// text3.setIcon(icon);
				}
				
			}
		});
		
		
		f.setVisible(true);

	}

}
