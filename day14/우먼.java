package 상속;

public class 우먼 extends 사람{
	char gender;
	String hair;
	
	@Override
	public void eat() {
		System.out.println("단 것을 좋아하다");
	}
}