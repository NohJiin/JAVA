package 상속응용;

public class StarNameMain {

	public static void main(String[] args) {
		Star star = new Star();
		MyName name = new MyName();
		감소스레드 minus = new 감소스레드();
		증가스레드 plus = new 증가스레드();
		
		star.start();
		name.start();
		minus.start();
		plus.start();
	}

}