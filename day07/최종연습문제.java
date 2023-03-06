package 조건문;

import javax.swing.JOptionPane;

public class 최종연습문제 {

	public static void main(String[] args) {
		// 1~2번 equals() 사용
		// 1. 암호를 대시오 입력 => pass라고 입력
		// 암호가 맞응면 "들어오세요", 아니면 "나가세요" 플린트
		// 2. 당신이 먹고 싶은 저녁 메뉴는(짜장면, 라면, 회)에서 선택
		// 짜장면이면 "중국집으로 가요",
		// 라면이면 "분식집으로 가요",
		// 회이면 "횟집으로 가요" 프린트
		// 위에 없으면 "그냥 안먹어요" 프린트
		// 3. JOptionPane을 사용
		// 두 정수를 입력받으세요 --> 누가 더 큰지 출력
		// 4. 사원번호 -:> String no = "A100EX";
		// 맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
		// A이면 기획부 프린트, B이면 총무부 프린트, C이면 개발부 프린트,
		// 아니면 해당부서 없음 프린트
		// 5. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		// 6. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		
		// 1.
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		System.out.println("입력한 암호 : " + pw);
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}
		
		// 2.
		String food = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는(짜장면, 라면, 회)");
		System.out.println("입력한 음식 : " + food);
		if (food.equals("짜장면")) {
			System.out.println("중국집으로 가요");
		} else if (food.equals("라면")){
			System.out.println("분식집으로 가요");
		} else if (food.equals("회")){
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		// 3.
		String x = JOptionPane.showInputDialog("정수를 입력하세요 - 1");
		String y = JOptionPane.showInputDialog("정수를 입력하세요 - 2");
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		
		System.out.println("첫번로 입력한 정수 : " + a);
		System.out.println("두번로 입력한 정수 : " + b);
		
		if (a > b) {
			System.out.println("더 큰 수는 : " + a);
		} else if (a < b){
			System.out.println("더 큰 수는 : " + b);
		} else {
			System.out.println("두 정수의 크기가 동일");
		}
		
		// 4.
		String no = "A100EX";
		char w = no.charAt(0);
		System.out.println("사원번호의 첫번째 글자 : " + w);
		switch (w) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}
		
		// 5.
		String X = JOptionPane.showInputDialog("수를 입력하세요 - 1");
		String Y = JOptionPane.showInputDialog("수를 입력하세요 - 2");
		String method = JOptionPane.showInputDialog("연산 방법은 (+ - * /)? - 3");
		
		double A = Double.parseDouble(X);
		double B = Double.parseDouble(Y);
		
		System.out.println("첫번로 입력한 수 : " + A);
		System.out.println("두번로 입력한 수 : " + B);
		System.out.println("연산 방법 : " + method);
		
		if (method.equals("+")) {
			System.out.println(A + B);
		} else if (method.equals("-")){
			System.out.println(A - B);
		} else if (method.equals("*")) {
			System.out.println(A * B);
		} else {
			System.out.println(A / B);
		}
		
		// 6.
		String z = JOptionPane.showInputDialog("정수를 입력하세요 - 1");
		String r = JOptionPane.showInputDialog("정수를 입력하세요 - 2");
		
		int e = Integer.parseInt(z);
		int f = Integer.parseInt(r);
		
		System.out.println("첫번로 입력한 정수 : " + e);
		System.out.println("두번로 입력한 정수 : " + f);
		
		double result = (double)e / f;
		System.out.println(String.format("%.2f", result));
	}

}
