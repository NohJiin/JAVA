package 생성자;

public class 컴퓨터조립 {
	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "APPLE", 30);
		컴퓨터 com2 = new 컴퓨터(20000, "BANANA", 30);
		// override한 toString사용시 -> 주소가 아니고,
		//							그 주소가 가르키는 멤버변수값들을 프린트
		// toString안해주면 -> 생성자.통장@주소 를 프린트
		System.out.println(com1);
		System.out.println(com2);
	}
}