package 인터페이스;

public class BananaComputer implements Computer{

	@Override
	public void 인터넷을사용하다() {
		System.out.println("크롬으로 인터넷 접속하다");
	}

	@Override
	public void 파일을저장하다() {
		System.out.println("확장자 .banana로 파일을 저장하다");
	}

	@Override
	public void 문서를작성하다() {
		System.out.println("banana 프로그램으로 문서를 작성하다");		
	}

}