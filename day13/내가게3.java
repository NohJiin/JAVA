package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int countMorning = 5;	// 오전에 온 손님 수
		int countNight = 4;	// 오후에 온 손님 수
		
		// 계산기3을 이용
		// 1. 전체 손님 수를 반환받아서 다으뫄 같이 프린트
		//	오늘 온 손님의 총 합은 9명입니다.
		int son = cal.add(countMorning, countNight);
		System.out.println("오늘 온 손님의 총 합은 " + son + "명입니다.");
		// 2. 오전과 오후 손님수 차이는?
		//	손님 수 차이는 1명 입니다.
		System.out.println("손님 수 차이는 " + cal.minus(countMorning, countNight) + "명입니다.");
		// 3. 오전에 들어온 손님의 결제 금액은?
		//	오전 결제 금액은 35000원입니다.
		// Math.~ 기능이 매우 많다. 절대값을 구하고 싶으면 Math.abs() 사용하면 된다
		System.out.println("오전에 들어온 손님의 결제 금액은 " + cal.mul(countMorning, price) + "원입니다.");
		// 4. 오후에 들어온 손님의 결제 금액은?
		// 	오후 결제 금액은 28000원입니다.
		System.out.println("오후에 들어온 손님의 결제 금액은 " + cal.mul(countNight, price) + "원입니다.");
		// 5. 오전과 오후에 들어온 손님의 총 결제금액은?
		//	오늘 하루 총 결제금액은 63000원입니다.
		int today = cal.mul(cal.add(countNight, countMorning), price);
		System.out.println("오늘 하루 총 결제 금액은 " + today + "원입니다.");
		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산
		//	1인당 결제금액은 7000원입니다.
		System.out.println("1인당 결제금액은 " + cal.div(today, son) + "원입니다.");
		
		// Math이용하기
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334));	// 올림
		System.out.println(Math.floor(3.334));	// 내림
		System.out.println(Math.round(3.334));	// 반올림
		System.out.println(Math.round(3.534));
		System.out.println(Math.sqrt(100)); 	// 루트
		System.out.println(Math.max(100, 200));	// 큰거 찾기 
		System.out.println(Math.min(100, 200));	// 작은거 찾기
		System.out.println(Math.pow(2, 3));		//2의 3승
	}
	

}