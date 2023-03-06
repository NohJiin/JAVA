package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		// 나에 대한 데이터를 모아보세요
		ArrayList me = new ArrayList();
		me.add(1000);	// Object <- 업캐스팅 - Integer <- 오토박싱 - int
		me.add(189.1);	// Object <- Double <- double
		me.add(false);	// Object <- Boolean <- boolean
		me.add('남');	// Object <- Character <- char
		
		//ArrayList는 toString()가 재정의
		//list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		// 1. 전체 목록 프린트
		System.out.println(me);
		// 2. 돈 1000을 꺼내 2000더해 프린트
		int money = (Integer)me.get(0) + 2000;	// Object <- 업캐스팅 - Integer <- 오토박싱 - int
		System.out.println(money);
		// 3. 키 189.1을 꺼내서 10을 더해 프린트
		double height = (Double)me.get(1) + 10; // double <- Double <- Object
		System.out.println(height);
		// 4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요 아니면 배고파요
		if ((boolean)me.get(2) == true) {	// boolean <- Boolean <- Object
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		// 5. 성별 남 꺼내서 남이면 주민번호는 1, 3이에요. 아니면 2,4에요
		if ((char)me.get(3) == '남') {	//char <- Character <- Object
			System.out.println("주민번호는 1, 3이에요");
		} else {
			System.out.println("주민번호는2, 4이에요");
		}
		// 6. 2~3에서 형변환(업캐스팅, 다운캐스팅), 오토박싱, 오토언박싱과정을 순서대로 작성 
	}

}


// 형변환 확인문제
// 1. 형변환(캐스팅)이란?
// 2. 업캐스팅이란? 다른말은?
// 3. 다운캐스팅이란? 다른말은?
// 4. car <- Truck 에서 부모/자식 클래스를 구분하시오
// 5. byte b = 100; int i = b; 내부에서 일어난 처리 내용을 쓰시오
// 6. int i2 = 10; byte b2 = (byte)i2; 내부에서 일어난 처리 내용을 쓰시오
// 7. 오토박싱이란?
// 8. 오토언박싱이란?
// 9. 다음 각 줄에 주석을 달아주세여
// ArrayList list = new ArrayList();	=> list 생성자 만들기
// list.add(100);	=> int ->(오토박싱) Integet ->(업캐스팅) Object
// int age = (Integer)list.get(0);	=> 