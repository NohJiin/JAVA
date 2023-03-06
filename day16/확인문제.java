package 형변환;

import java.util.LinkedList;

public class 확인문제 {

	public static void main(String[] args) {
		// 시험일정 순서가 국어 수학 영어 컴퓨터 인 컬렉션을 만들어라
		// 시험을 보면 한과목씩 사라지게 하라
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		
		System.out.println("전체 시험볼 과목 : " + test);
		test.remove();
		System.out.println("1일차 시험본 후 남은 과목 : " + test);
		test.remove();
		System.out.println("2일차 시험본 후 남은 과목 : " + test);
		test.remove();
		System.out.println("3일차 시험본 후 남은 과목 : " + test);
	}

}