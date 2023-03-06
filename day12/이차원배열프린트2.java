package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"런던","뉴욕","LA"},
				{"싱가포르","일본","프랑스"},
				{"보라카이","대만","캐나다"}
		};	// 전체를 프린트!
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println("내가 가고 싶은 나라 >> " + s[i][j]);
			}
		}
	}

}