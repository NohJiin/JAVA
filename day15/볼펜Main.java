package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		 볼펜 p = new 볼펜();
		 p.price = 1500;
		 p.company = "모나미";
		 p.thikness = 0.5;
		 p.buy();
		 p.write();
		 
		 System.out.println(p);
	}

}