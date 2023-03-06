package 스태틱;

public class 직원 {
	String name;
	int age;
	String gen;		// char로 사용하면 메모리 절약 가능
	static int count;
	static int sum;
	
	// 객체생성하지 않고 클래스이름으로 바로 접근해셔 아무때나 원할 때 평균을 구하고 싶은 경우
	// static 메서드로 만들자
	public static void getAvg() {
		// static메서드에서 전역변수를 접근할 때는
		// 같은성격을 가진 static변수만 접근이 가능
		// System.out.println(name);
		System.out.println(sum/count);
	}
	
	public 직원(String name, int age, String gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		count++;
		sum = sum + age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
}