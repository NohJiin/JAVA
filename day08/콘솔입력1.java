package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {
	public static void main(String[] args) {
		// String으로 입력을 받아서 다른 데이터타입(int, double ...)으로 한꺼번에 변경 가능
		// Scanner
		Scanner sc = new Scanner(System.in);	// 컴퓨터 중에서도 키보드(컴퓨터.키보드)
		
		// 자바프로그램과 콘솔간에 통로를 만든다 
		// 연결통로 == 강물(스트림, Stream)
		// Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨
		// Stream을 반드시 닫아주자
		
		System.out.print("요일 입력 : 1)주중 2)주말 - ");
		int data = sc.nextInt();		// String --> Int
		
		if (data == 1) {
			System.out.println("열심히 달리자");
		} else {
			System.out.println("푹 쉬자!");
		}
		
		System.out.print("주말에 뭐할까? ");
		String data2 = sc.next();	// 단어
		System.out.println("나는 주말에 " + data2 + "를 할거야.");
		
		sc.close();
	}
}