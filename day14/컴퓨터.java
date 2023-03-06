package 생성자;

public class 컴퓨터 {
	int money;
	String company;
	int size;
	
	public 컴퓨터(int money, String company, int size) {
		super();
		this.money = money;
		this.company = company;
		this.size = size;
	}

	@Override	// 기능을 재정의
	public String toString() {
		return "컴퓨터 [money=" + money + ", company=" + company + ", size=" + size + "]";
	}
}