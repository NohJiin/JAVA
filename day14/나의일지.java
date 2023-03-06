package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "마이스윗홈");	// 변수 4개 생성
		System.out.println(Day.count);
		System.out.println("누적시간 : " + Day.sumTime);
		// static이 붙은 메서드나 변수는 객체생성하지 않아도
		// 클래스 이름으로 바로 접근해서 사용 가능!
		Day day2 = new Day("주변산책", 1, "마이스윗동네");
		System.out.println(Day.count);
		System.out.println("누적시간 : " + Day.sumTime);
		
		Day day3 = new Day("시험요약정리", 2, "마이스윗홈");
		System.out.println(Day.count);
		System.out.println("누적시간 : " + Day.sumTime);
		// 총 12개의 변수가 다이나믹하게 생성됨 ==> 객체생성할 때마다 다이나믹하게 무더기영역(Heap)에 생긴 변수
		// 인스턴스 변수라고 부른다
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}