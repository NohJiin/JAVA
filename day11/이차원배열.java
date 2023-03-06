package 배열심화;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		String[] header = {"배우 ","가수","아이돌"};
		String[][] contents = {{"이도현","윤도현","아이브"},
								{"송혜교","김나영","블랙핑크"},
								{"강동원","김연우","르세라핌"},
								{"고수","거미","아이들"},
								{"주현영","볼빨간사춘기","트와이스"},
								{"신세경","어쿠스틱콜라보","레드벨벳"},
								{"이덕화","유미","에스파"},
								{"현빈","알리","스테이씨"},
								{"손예진","테이","세븐틴"},
								{"한예슬","비엠케이","비투비"},
								{"한소희","션 멘데스","최예나"},
								{"오연서","찰리 푸스","소녀시대"},
								{"공유","루엘","투피엠"},
								{"조정석","마룬파이브","슈퍼주니어"},
								{"이도현","윤도현","아이브"},
								{"송혜교","김나영","블랙핑크"},
								{"강동원","김연우","르세라핌"},
								{"고수","거미","아이들"},
								{"주현영","볼빨간사춘기","트와이스"},
								{"신세경","어쿠스틱콜라보","레드벨벳"},
								{"이덕화","유미","에스파"},
								{"현빈","알리","스테이씨"},
								{"손예진","테이","세븐틴"},
								{"한예슬","비엠케이","비투비"},
								{"한소희","션 멘데스","최예나"},
								{"오연서","찰리 푸스","소녀시대"},
								{"공유","루엘","투피엠"},
								{"조정석","마룬파이브","슈퍼주니어"}};
	
//		System.out.println(contents.length);
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		Font font = new Font("굴림", 0, 10);
		table.setFont(font);
		f.add(scroll);
		
		f.setVisible(true);
	}

}