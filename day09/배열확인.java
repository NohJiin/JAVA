package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		int[] week = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("첫 번째 값 : " + week[0]);
		System.out.println("두 번째 값 : " + week[1]);
		System.out.println("배열의 길이 : " + week.length);
		week[2] = 10;
		week[4] = 12;
		System.out.println("세 번째 값 : " + week[2]);
		System.out.println("다섯 번째 값 : " + week[4]);
		
		int[] tour = new int[4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("첫 번째 값 : " + tour[0]);
		System.out.println("세 번째 값 : " + tour[2]);
		System.out.println("배열의 길이 : " + tour.length);
	}

}