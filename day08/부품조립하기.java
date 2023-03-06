package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 RAM에 언제든 사용할 수 있도록 준비되어있음
		// 		망치
		// 		부품명.기능()
		
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내여 여러개 만들어 RAM에 저장해두고 사용
		// 		벽돌
		// 		벽돌 b = new 벽돌();
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		
		f.setSize(400, 300);
		f.setLayout(lay);
		
		JLabel text = new JLabel();
		JTextField blank = new JTextField(10);
		JButton b = new JButton("숫자를 맞춰보자!");
		
		Font font = new Font("굴림", 1, 30);
		Font font2 = new Font("굴림", 1, 15);
		
		text.setText("당신이 생각한 숫자를 입력하세요");
		// 간격을 아직까지는 맞출 수 없음
		// text.setSize(400, 100);
	
		text.setFont(font2);
		blank.setFont(font);
		b.setFont(font);
		
		// f.setBackground(Color.green);
		// 이렇게하면 frame 자체에 색을 씌울 수 없어서 배경색이 적용되지 않는다
		// frame 위에 판이 하나 있는데 거기에 색을 입혀야함
		// 판을 가져와 배경색 지정하기
		f.getContentPane().setBackground(Color.green);
		
		
		blank.setBackground(Color.pink);
		blank.setForeground(Color.blue);
		b.setBackground(Color.yellow);
		
		f.add(text);
		f.add(blank);
		f.add(b);
		
		f.setVisible(true);
	}

}