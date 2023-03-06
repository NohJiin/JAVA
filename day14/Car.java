package 상속;

public class Car extends Object{
	int wheel;
	String color;
	
	public void run() {
		System.out.println("도로를 달리다");
	}
	public void stop() {
		System.out.println("자동차를 멈추다");
	}
	
	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", color=" + color + "]";
	}
}