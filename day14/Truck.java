package 상속;

public class Truck extends Car{
	String size;
	boolean cargo;

	public void move() {
		System.out.println("짐을 옮기다");
	}
	
	@Override
	public void run() {
		System.out.println("천천히 달리다");
	}
}