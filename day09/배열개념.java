package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여럭개의 데이터를 햄에 저장해두고 cpu가 접근하여 사용하고 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40};	// length만들어서 몇 개인지 세서 값을 넣어줌 -> 5개 만들어진다
		System.out.println(jumsu);	// 주소
		System.out.println(jumsu[0]);	// 주소
		System.out.println(jumsu[1]);	// 주소
		System.out.println(jumsu[2]);	// 주소
		System.out.println(jumsu[3]);	// 주소
		System.out.println("전체 개수 : " + jumsu.length);
		
		jumsu[0] = 100;
		System.out.println(jumsu[0]);
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고 나중에 값을 넣는 경우

	}

}