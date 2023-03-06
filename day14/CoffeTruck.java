package 상속;

public class CoffeTruck extends Truck{
	boolean coffe;
	
	public void sale() {
		System.out.println("커피를 팔다");
	}
	
	public void getMoney() {
		System.out.println("손님한테 돈을 받다");
	}
	
	@Override
	public void run() {
		System.out.println("인도에 머물러있다");
	}
}