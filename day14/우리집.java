package 상속;

public class 우리집 {
	
	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", 12);
		딸 d2 = new 딸("홍길순", 9);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("태어난 딸은 " + 딸.dCount + "명입니다.");
		System.out.println("아빠 지갑에 남은 돈은 " + 딸.fMoney + "원입니다.");
	}
}