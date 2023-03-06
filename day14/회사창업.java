package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		
		직원 n1 = new 직원("홍길동", 25, "여");
		System.out.println("직원 수 : " + 직원.count);
		System.out.println("직원의 평균 나이 : " + ((double)직원.sum/직원.count));
		
		직원 n2 = new 직원("김길동", 24, "남");
		System.out.println("직원 수 : " + 직원.count);
		System.out.println("직원의 평균 나이 : " + ((double)직원.sum/직원.count));
		
		직원 n3 = new 직원("송길동", 26, "여");
		System.out.println("직원 수 : " + 직원.count);
		System.out.println("직원의 평균 나이 : " + ((double)직원.sum/직원.count));

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
 
}