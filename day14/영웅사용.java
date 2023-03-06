package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		System.out.println("===== 슈퍼맨 =====");
		슈퍼맨 s = new 슈퍼맨();
		s.name = "클라크";
		s.age = 25000;
		s.power = 500000;
		s.fly = true;
		s.eat();
		s.run();
		s.space();
		
		System.out.println("===== 원더우먼 =====");
		원더우먼 w = new 원더우먼();
		w.name = "다이애나";
		w.age = 5000;
		w.belt = true;
		w.weakness = "no";
		w.treat();
		w.wisdom();
		w.eat();
	}

}