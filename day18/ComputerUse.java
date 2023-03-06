package 인터페이스;

public class ComputerUse {

	public static void main(String[] args) {
		AppleComputer a = new AppleComputer();
		BananaComputer b = new BananaComputer();
		a.문서를작성하다();
		a.인터넷을사용하다();
		a.파일을저장하다();
		b.문서를작성하다();
		b.인터넷을사용하다();
		b.파일을저장하다();
	}

}