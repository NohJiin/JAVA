package 조건문;

public class if문3 {

	public static void main(String[] args) {
		// 조건이 여러개 일 때
		
		// 점수가 80점 이상이면 최우수
		// 점수가 70점 이상이면 우수
		// 점수가 60점 이상이면 보통
		// 나머지는 미달
		int myNum = 99;
		
		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70){
			System.out.println("우수");
		} else if(myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}
		
		// 여행횟수가 10이면 "VVIP" 프린트
		// 여행횟수가 6이면 "VIP" 프린트
		// 나머지 경우는 "Nomal" 프린트
		int myTour = 10;
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Nomal");
			break;
		}

	}

}