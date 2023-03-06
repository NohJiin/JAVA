package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {
	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 >> ");
		double h = sc.nextDouble();			// "88.8" -> 88.8
		
		System.out.print("저녁을 먹었는지 입력(true/false) >> ");
		boolean eat = sc.nextBoolean();		// "true" -> true
		
		System.out.print("올해의 목표는 >> ");
		sc.nextLine();		// 밑의 Line이 사용되지 않도록 처리
		String goal = sc.nextLine();
	
		System.out.println();
		System.out.println("====================");
		System.out.println("내 이름은 " + name);
		System.out.println("내년 나이는 " + (age + 10) + "세");
		System.out.println("당신의 키는 " + h);
		System.out.println("당신의 저녁 여부는 " + eat);
		System.out.println("올해의 목표는 " + goal);

		
		sc.close();
	}
}