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
import javax.swing.JTextField;

public class 인기투표2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		f.setSize(400, 600);
		f.setLayout(lay);
		
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		JLabel text4 = new JLabel();
		
		JTextField input1 = new JTextField(5);
		JTextField input2 = new JTextField(5);
		JTextField input3 = new JTextField(5);
		
		text1.setText("K-pop 인기투표");
		text2.setText("1. Chalie Puth - Loser  ");
		text3.setText("2. Black Pinnk - Shut Down");
		text4.setText("3. Shawn Mendes - Lost in Japan");
		
		JButton b1 = new JButton();		// charlie
		JButton b2 = new JButton();		// blackpink
		JButton b3 = new JButton();		// mendes
		
		ImageIcon icon1 = new ImageIcon("charlie.png");
		ImageIcon icon2 = new ImageIcon("black.png");
		ImageIcon icon3 = new ImageIcon("mendes.png");
		
		b1.setIcon(icon1);		// 찰리
		b2.setIcon(icon2);		// 블랙핑크
		b3.setIcon(icon3);		// 션
		
		Font font = new Font("돋움", 1, 20);
		Font font2 = new Font("돋움", 1, 40);
		
		text1.setFont(font2);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font2);
		input2.setFont(font2);
		input3.setFont(font2);
		
		f.getContentPane().setBackground(Color.pink);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b3.setBackground(Color.black);
		
		f.add(text1);		// 제목
		f.add(text2);		// 찰리 - 제목
		f.add(b1);
		f.add(input1);
		f.add(text3);		// 블핑 - 제목
		f.add(b2);
		f.add(input2);
		f.add(text4);		// 션 - 제목
		f.add(b3);
		f.add(input3);
		
		
		// 나중에 textFiled말고 Lable에다가 표현하죠?
		b1.addActionListener(new ActionListener() {
			int cCount = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cCount = cCount + 1;
				input1.setText("    " + cCount + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int bCount = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bCount = bCount + 1;
				input2.setText("    " + bCount + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int sCount = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sCount = sCount + 1;
				input3.setText("    " + sCount + "표");
			}
		});
		
		
		f.setVisible(true);
	}

}