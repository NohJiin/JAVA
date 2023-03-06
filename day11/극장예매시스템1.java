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

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout lay = new FlowLayout();
		f.getContentPane().setBackground(Color.green);
		f.setTitle("극장예매시스템");
		f.setSize(400, 400);
		f.setLayout(lay);
		Font font = new Font("궁서", 1, 50);
		JLabel title = new JLabel();
		JLabel result = new JLabel();
		title.setText("극장예매시스템");
		title.setFont(font);
		result.setText("결과 보이는 곳");
		result.setFont(font);
		result.setForeground(Color.red);
		f.add(title);
		f.add(result);
		
		JButton[] btn = new JButton[10];
		
		// 예약 여부를 저장하는 배열을 만들어준다
		// 각 자리에 저장된 값이 0이면 예약 가능, 0이 아니면 예약 불가능
		int[] seat = new int[btn.length];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			// 버튼에 액션기능 add
			// 1) 액션기능 추가
			// 2) 클릭했을때 어떤 부품이 담당할 지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할 지 코딩
			// 추가 --> 클릭했을 때 어떤 부품이 담당할지 부품 생성
			
			btn[i].addActionListener(new ActionListener() {
			// 여기서 보이는 btn[i]의 i는 밑에 새로 정의된 함수(?)에서는 i의 최대값 만을 가져온다
			// 내가 원하는 i값이 아니라는 소리다
			// 즉 완전 다른 영역이라 생각하자
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// e.getActionCommand() : 클릭한 버튼의 글자를 가져와줌
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);	// "
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고 1이 아니면 예약가능!
					if (seat[no] == 0) {	// 예약 가능할 때
						result.setText(text + "번 예약완료");
						seat[no] = 1;		// 예약완료
						// 여기를 잘 이해 못했으니 다시 생각해보자
						// text를 가져온 이유는 달리 가져올 숫자가 없기 때문인건가?
						int i = Integer.parseInt(text);
						btn[i].setText("마감");
						// 버튼을 비활성화
						btn[i].setEnabled(false);
					} else {				// 예약 불가능할 때
						result.setForeground(Color.blue);
						result.setText(text + "번 예약불가능");
						
					}
				}
			});
			
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 저장된 수 몇개가 1인지 체크해서 카운트
				// 영화예매비 1장당 1만원, 결제금액 프린트
				int count = 0;		// 1인 개수 확인
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "선택된 좌석 : " + count + "개\t총 금액 : " + (count*10000));
			}
		});
		
		f.setVisible(true);
	}

}