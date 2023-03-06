package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];	// length : 10
		// index는 0부터 시작, 마지막 위치의 index는 10보다 작음
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		// 우리 가족의 성별을 char[]로 저장 후 프린트
		// 우리 가족의 이름을 String[]로 저장 후 프린트
		// 우리 가족의 시력을 double[]로 저장 후 프린트
		char[] gender = {'m', 'f', 'f', 'f', 'm'};
		System.out.print("우리 가족의 성별 : ");
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		String[] name = {"아빠", "엄마", "지인", "둘째", "막내"};
		System.out.print("우리 가족의 이름 : ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		double[] eye = {1.0, 0.1, 0.2, 1.5, 1.5};
		System.out.print("우리 가족의 시력 : ");
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		
		boolean[] dinner = {true, false, false, true, true};
		System.out.print("우리 가족은 저녁을 먹었는가? ");
		for (int i = 0; i < dinner.length; i++) {
			System.out.print(dinner[i] + " ");
		}
		System.out.println();
	}
}