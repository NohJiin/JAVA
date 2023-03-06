package 상속응용;

public class MakeDrink extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println((i + 1) + "번째 제조 >> 주문하신 음료나왔습니다");
			try {
				Thread.sleep(2500);	// 2.5초
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 발생");
			}
		}
	}
}