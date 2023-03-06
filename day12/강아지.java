package 부품만들기;

public class 강아지 {
	
	public String name;
	public int age;
	
	public void age(String name, int age) {
		System.out.println(name + " 나이는 " + age + "입니다");
	}
	
	public void train(String name) {
		System.out.println(name + " : 꼬리를 흔든다");
		System.out.println(name + ": 손을 준다");
		System.out.println(name + " : 한바퀴 돈다");
	}
	
}