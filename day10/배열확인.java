package 배열응용;

import java.util.Scanner;

public class 배열확인 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		System.out.print("정수 5개를 입력 >> ");
		for (int i = 0; i < num.length; i++) {
			int data = sc.nextInt();
			num[i] = data;
		}
		System.out.println(num[0] + num[2]);

		// 2.
		String[] word = new String[3];
		System.out.print("문자열 3개를 입력 >> ");	// 자바, 스프링, JSP
		for (int i = 0; i < word.length; i++) {
			String data = sc.next();
			word[i] = data;
		}
		System.out.println(word[0] + " 보다는 " + word[1]);
	}

}