package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		// 실행할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것
		System.out.println("1. 나는 프린트 될거야");
		try {
			System.out.println("2. 문제발생코드 >> " + (10/0));
		} catch (Exception e) {
			// 문제가 발생했을 때 프로그램을 멈추지말고, 어떻게 처리할지를 코딩
			System.out.println("관리자에게 메일을 보내는 처리");
			// e.printStackTrace();
		}
		System.out.println("3. 나는 프린트될까?");

	}

}