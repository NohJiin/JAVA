package 복습;

public class 배열기본확인 {

	public static void main(String[] args) {
		// 다음의 데이터를 다룰 수 있는 배열을 만들어 임의의 데이터를 넣고 프린트
		// 좋아하는 여행지 5개
		// 좋아하는 색깔 5개 첫글자
		// 좋아하는 연예인 5명의 키
		
		String[] trip = {"일본", "LA", "싱가포르", "런던", "프랑스"};
		for (String x : trip) {
			System.out.println(x);
		}
		
		char[] color = {'m', 'b', 'w', 'p', 's'};
		for (char x : color) {
			System.out.println(x);
		}
		
		double[] height = {188.2, 170.0, 183.7, 177.4, 180.3};
		for (double x : height) {
			System.out.println(x);
		}
	}

}
