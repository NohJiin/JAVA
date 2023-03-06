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

public class 키오스크 {

	static int total;
	static int count1;
	static int count2;
	static int count3;

	final static int PRICE1 = 1500;
	final static int PRICE2 = 1200;
	final static int PRICE3 = 1700;

	public static void main(String[] args) {
		// 음료키오스크 만드렁야징~
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		f.setSize(800, 520);
		f.setLayout(lay);
		f.setTitle("편의점 셀프 계산대");

		Font font = new Font("돋움", Font.BOLD, 20);
		JLabel total0 = new JLabel("전체 구매 개수 : ");
		total0.setFont(font);
		JLabel coast = new JLabel("불닭볶음면 : ");
		coast.setFont(font);
		JLabel coast2 = new JLabel("삼각김밥 : ");
		coast2.setFont(font);
		JLabel coast3 = new JLabel("허니버터칩 : ");
		coast3.setFont(font);

		ImageIcon icon = new ImageIcon("편의점.png");
//		ImageIcon icon2 = new ImageIcon("bul.png");
//		ImageIcon icon3 = new ImageIcon("sam.png");
//		ImageIcon icon4 = new ImageIcon("chip.png");

		JLabel img = new JLabel();
//		JLabel img2 = new JLabel();
//		JLabel img3 = new JLabel();
//		JLabel img4 = new JLabel();
		img.setIcon(icon); // home
//		img2.setIcon(icon2
//		img3.setIcon(icon3);
//		img4.setIcon(icon4);

		JButton btn1 = new JButton("불닭볶음면");
		JButton btn2 = new JButton("삼각김밥");
		JButton btn3 = new JButton("허니버터칩");
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn1.setBackground(Color.pink);
		btn2.setBackground(Color.pink);
		btn3.setBackground(Color.pink);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("bul.png");
				img.setIcon(icon);
				count1++;
				total++;
				coast.setText("불닭볶음면 : " + count1 * PRICE1);
				total0.setText("전체 구매 개수 : " + total);
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("sam.png");
				img.setIcon(icon);
				count2++;
				total++;
				coast2.setText("삼각김밥 : " + count2 * PRICE2);
				total0.setText("전체 구매 개수 : " + total);
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("chip.png");
				img.setIcon(icon);
				count3++;
				total++;
				coast3.setText("허니버터칩 : " + count3 * PRICE3);
				total0.setText("전체 구매 개수 : " + total);
			}
		});

//		f.add(title);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(total0);
		f.add(img);
//		f.add(img2);
//		f.add(img3);
//		f.add(img4);
		f.add(coast);
		f.add(coast2);
		f.add(coast3);

		f.setVisible(true);
	}

}
