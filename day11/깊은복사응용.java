package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone(); // 깊은 복사
		// 주소비교
		System.out.println(학기1성적 == 학기2성적);

		학기2성적[0] = 22;
		학기2성적[2] = 88;
		for (int i = 0; i < 과목명.length; i++) {
			System.out.print(과목명[i] + "\t");
		}
		System.out.println();
		System.out.println("===================================");
		for (int i = 0; i < 학기1성적.length; i++) {
			System.out.print(학기1성적[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + "\t");
		}
		System.out.println();

		int count = 0; // 동일한 성적
		int upCount = 0; // 성적이 오른 과목 수

		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count++;
			} else if (학기1성적[i] < 학기2성적[i]) {
				upCount++;
				System.out.println("성적이 오른 과목 : " + 과목명[i]);
			}
		}
		System.out.println("성적이 동일한 과목의 수 : " + count);
		System.out.println("성적이 오른 과목의 수 : " + upCount);
	}

}