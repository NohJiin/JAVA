package 조건문;

public class if문5 {

	public static void main(String[] args) {
		String ssn = "2055111";
		
		// String은 기본형 데이터가 아니어서 명령어(함수)를 사용해야한다
		if (ssn.equals("2055111")) {
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("다른 지역에서 태어나셨군요!");
		}
		
		// 첫번째 자리에 있는 문자 하나 추출
		char gender = ssn.charAt(0);
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
	
	}

}