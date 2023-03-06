package 복습;


public class 조건문 {

	public static void main(String[] args) {
		int target = 77;	// 숫자 맞추기를 해보자
		int me = 88;		// 내가 시도한 값
		
		// 조건은 비교하는 코드가 들어감. 결과가 반드시 논리형(true/false)
		// if문은 조건이 만족하면 처리하고 더 이상 실행되지 않음
		// 자체 break 기능이 있음
		if (target == me) {	// true
			System.out.println("정답입니다!");
		} else {	// false
			System.out.println("오답입니다!");
		}
		
		
		// 자체 break가 없음
		// 내가 멈추고 싶은 곳에 break를 써줘야함
		// String target2 = "로또";
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답!");
			break;
		default:	// 위의 조건이 다 아닌경우 실행하고 싶은 내용이 있으면 default에 넣어줌. 생략가능
			System.out.println("그만해!");
			break;
		}
		
	}

}