package 배열응용;

import java.util.Scanner;

public class 배열확인문제 {

	public static void main(String[] args) {
		// 작년에 가고 싶었던 곳 세 곳을 입력받아 넣으세요 >> 제주도, 양양, 속초
		// 올해에 가고 싶었던 곳 세 곳을 입력받아 넣으세요 >> 제주도, 부산, 울산
		// 위 입력은 우선순위에 따라 입력한 것임
		// 작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳? (같은 위치에 있는 장소끼리만  비교)
		Scanner sc = new Scanner(System.in);
		String[] trip = new String[3];		// 작년에 가고 싶은 곳
		String[] trip2 = new String[3];		// 올해 가고 싶은 곳
		
		// 작년에 가고 싶은 곳 입력받아 배열에 넣기
		System.out.print("작년에 가고 싶었던 곳 세 곳을 입력 >> ");
		for (int i = 0; i < trip2.length; i++) {
			trip[i] = sc.next();
		}
		// 올해에 가고 싶은 곳 입력받아 배열에 넣기
		System.out.print("올해에 가고 싶었던 곳 세 곳을 입력 >> ");
		for (int i = 0; i < trip2.length; i++) {
			trip2[i] = sc.next();
		}
		
		int count = 0;		// 우선순위가 동일했을 때 카운트
		for (int i = 0; i < trip2.length; i++) {
			if (trip[i].equals(trip2[i])) {
				count++;
				System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 >> " + trip[i]);
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳? >> " + count);
	}

}