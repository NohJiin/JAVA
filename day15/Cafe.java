package 상속응용;

public class Cafe {
	public static void main(String[] args) {
		Staff s= new Staff();
		Customer c = new Customer();
		MakeDrink d = new MakeDrink();
		
		s.start();
		c.start();
		d.start();
	}
}