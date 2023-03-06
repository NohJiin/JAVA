package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar c = new FlyCar();
		c.color = "하얀색";
		c.fly = true;
		
		System.out.println(c);
		c.fly();
	}

}