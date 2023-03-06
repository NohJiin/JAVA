package 상속응용;

public class Staff extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + "번째 주문 >> 음료를 주문하시겠습니까?");
			try {
				Thread.sleep(5000);	// 5초
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 발생");
			}
		}
	}
}