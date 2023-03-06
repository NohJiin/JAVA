package 상속기본;

public class 볼펜 extends 학용품{
	double thikness;
	
	public void write() {
		System.out.println("볼펜으로 글을 쓰다");
	}

	@Override
	public String toString() {
		return "볼펜 [thikness=" + thikness + ", price=" + price + ", company=" + company + "]";
	}
}