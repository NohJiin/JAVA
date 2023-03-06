package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// 1. int 크기 5인 배열을 생성
		// 2. 배열의 크기를 프린트
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		// 4. 배열의 마지막 위치에서 500을 넣어서 프린트
		// 5. 배열의 3번째 위치에서 200을 넣어서 프린트
		// 6. 배열이 전체 데이터를 프린트
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		// 8. 그림으로 그려라
		
		// 1.
		int[] arr = new int[5];
		
		// 2.
		System.out.println("배열의 크기 : " + arr.length);

		// 3.
		arr[0] = 100;
		System.out.println("배열의 첫 번째 : " + arr[0]);
		
		// 4.
		arr[4] = 500;
		System.out.println("배열의 다섯 번째 : " + arr[4]);
		
		// 5.
		arr[2] = 200;
		System.out.println("배열의 세 번째 : " + arr[2]);
		
		// 6.
		System.out.print("배열의 전체 데이터 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 7.
		System.out.println("배열의 전체 데이터와 인덱스");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index : " + i + " / data : " + arr[i]);
		}
	}

}