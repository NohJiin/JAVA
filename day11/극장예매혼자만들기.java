package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매혼자만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel title = new JLabel();
		FlowLayout lay = new FlowLayout();
		f.setSize(400, 400);	// 프레임 크기 지정
		f.setLayout(lay);		// layout 넣어주기
		Font font = new Font("궁서", Font.BOLD, 50);	/// font 설정
		
		// 제목
		title.setText("영화예매하기");
		title.setFont(font);
		f.add(title);
		
		// 예약여부
		JLabel noti = new JLabel();
		noti.setText("결과보이는 곳");
		noti.setFont(font);
		noti.setForeground(Color.red);
		
		// 버튼 정의
		JButton[] btn = new JButton[10];
		// 좌석 상태표시 배열
		int[] seat = new int[btn.length];
		//버튼 생성
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i +"");
			btn[i].setFont(font);
			f.add(btn[i]);
			
			// 버튼 클릭했을 때 액션
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭한 버튼 값 가져옴
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					int i = Integer.parseInt(text);
					if (seat[no] == 0) {
						seat[no] = 1;
						noti.setText(i + "번 예약 완료");
						noti.setForeground(Color.blue);
						btn[i].setText("X");
						btn[i].setEnabled(false);
					}
					//else {
					//	noti.setText("예약 불가");
					//	noti.setForeground(Color.blue);
					//}
					
				}
			});
		}
		
		// 전체 확인 버튼
		JButton total = new JButton("전체 예매 확인");
		total.setFont(font);
		total.setForeground(Color.black);
		total.setBackground(Color.pink);
		
		// total 버튼 눌렀을 때 액션
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;		// 선택된 좌석의 수
				
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "선택된 좌석의 수 : " + count + "전체 금액 : " + (count*10000));
			}
		});
		
		f.add(noti);
		f.add(total);
		
		f.setVisible(true);
	}

}