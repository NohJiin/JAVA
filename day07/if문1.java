package 조건문;

public class if문1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		if (x == y) {
			System.out.println("x와 y가 일치");
		} else {
			System.out.println("x와 y가 불일치");
		}
		
		int id = 1111;
		int id2 = 2222;
		
		if (id == id2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}