package 상속응용;

public class Customer extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println((i+1) + "번째 손님 >> 음료를 주문하고 싶어요");
			try {
				Thread.sleep(5000);	// 5초
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 발생");
			}
		}
	}
}