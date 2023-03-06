package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리적으로 판단을 하고 싶은데, 조건이 2개 이상이어서
		// 어떻게 판단해야할지 모르는 경우 사용
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		// 아이디가 동일한지 비교
		// 패스워드가 동일한지 비교
		
		System.out.println(id == id2);
		System.out.println(pw == pw2);
		
		// &&, and조건, 두 조건이 모두 맞아야  맞다라고 판단
		// 로그인 처리
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111;
		int mem2 = 222;
		// ||, or조건, 조건 중에서 하나만 맞으면 맞다라고 판단
		System.out.println(mem1 == 111 || mem2 == 222);
		
		// 정수형, 실수형 변수를 만들고 싶을때 사용하는 타입은? 정수 : int, 실수 : double
		// 변수를 만드는 방법? : 데이터 타입을 지정한 후 변수이름을 할당
	}

}