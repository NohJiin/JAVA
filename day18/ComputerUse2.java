package 인터페이스;

public class ComputerUse2 {

	public static void main(String[] args) {
		// computer 인터페이스를 구체적으로 구현한 이름없는 클래스를 가지고 객체생성함
		// : 익명클래스
		// 인터페이스는 불완전하기 때문에 이것을 틀로해서 객체 생성이 불가능하다!
		Computer com = new Computer() {

			@Override
			public void 인터넷을사용하다() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void 파일을저장하다() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void 문서를작성하다() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}