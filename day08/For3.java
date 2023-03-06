package 반복문;


public class For3 {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		
		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		
		// 4.
		for (int i = 0; i < 3; i++) {
			// i + 1 할때 () 괄호를 적지 않아도 가능 => 앞 순서이기 때문에
			// 								 이미 계산이 끝난 상태로 이어짐
			System.out.println((i+1) + " : 짱!");
		}
	}

}