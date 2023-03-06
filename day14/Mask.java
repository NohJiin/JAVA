package 상속;

public class Mask {
	String color;	// 색
	int price;		// 가격
	int num;		// 개수
	
	public Mask(String color, int price, int num) {
		this.color = color;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", num=" + num + "]";
	}
}