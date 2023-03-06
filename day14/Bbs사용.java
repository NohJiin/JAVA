package 생성자;

public class Bbs사용 {

	public static void main(String[] args) {
//		String[] title = {"java", "jsp", "spring"};
//		String[] content = {"fun java", "fun jsp", "fun spring"};
//		String[] writer = {"park", "hong", "kim"};
//		for (int i = 0; i < 3; i++) {
//			Bbs name = new Bbs(i+1, title[i], content[i], writer[i]);
//		}
		
		Bbs bbs1 = new Bbs(1, "자바", "fun java", "park");
		Bbs bbs2 = new Bbs(1, "JSP", "fun jsp", "hong");
		Bbs bbs3 = new Bbs(1, "Spring", "fun spring", "kim");
		
		System.out.println(bbs1);
		System.out.println(bbs2);
		System.out.println(bbs3);
	}

}