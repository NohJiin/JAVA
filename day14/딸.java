package 상속;

public class 딸 {
	String name;
	int age;
	static int dCount;
	static int fMoney = 10000;

	public 딸(String name, int age) {
		this.name = name;
		this.age = age;
		dCount++;
		fMoney = fMoney - 1000;
	}

	public void tv보다() {
		System.out.println("집에사 TV를 보다");
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", age=" + age + "]";
	}
}