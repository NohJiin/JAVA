package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();	// f2번 하면 import가능
		work.name = "홍갈동";		// public
		// work.address = "강남구";	// default
		// ==> 같은 패키지 내에서만 접근 가능
		// work.salary = 100;		// protected
		// ==> 다른 패키지인 경우 상속관계에서만 됨
		// work.rrn = 111; ==> 접근자체가 안됨
	}

}