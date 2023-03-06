package 상속기본;

public class Car {
	String color;
	
	public void run() {
		System.out.println("도로 위를 달리다.");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}