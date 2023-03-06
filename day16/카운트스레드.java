package 상속;

public class 카운트스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트 >> " + i);
			// CPU에게 스레드 쉬는 시간 텀을 알려준다
			// thread를 잠깐 재울 수 있음
			// CPU는 외부자원
			// 자바가 외부 자원을 연결할 때는 엄청 위험하다고 인식
			// 만약에 문제가 생기면 어떻게 할지를 코드를 반드시 명시
			// file저장, 네트워크 연결, 외부자원 사용시
			try {
				Thread.sleep(2000);	// 2초
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 생김");
			}
		}
	}
}