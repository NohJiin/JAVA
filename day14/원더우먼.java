package 상속;

public class 원더우먼 extends 우먼{
	boolean belt;
	String weakness;
	
	public void treat() {
		System.out.println("사람을 치료하다");
	}
	
	public void wisdom() {
		System.out.println("아테네의 지혜를 가졌다");
	}

	@Override
	public String toString() {
		return "원더우먼 [belt=" + belt + ", weakness=" + weakness + ", gender=" + gender + ", hair=" + hair + ", name="
				+ name + ", age=" + age + "]";
	}
}