package 상속;

public class 내차들 {

	public static void main(String[] args) {
		
		CoffeTruck c = new CoffeTruck();
		c.size = "Big";
		c.cargo = true;
		c.coffe = true;
		c.color = "yellow";
		c.wheel = 4;
		c.getMoney();
		c.move();
		c.run();
		c.sale();
		c.stop();
		
//		Car c = new Car();
//		c.wheel = 4;
//		c.color = "black";
//		c.run();
//		c.stop();
//		
//		Truck c2 = new Truck();
//		c2.cargo = true;
//		c2.color = "blue";
//		c2.size = "Big";
//		c2.move();
//		c2.run();
	}

}
