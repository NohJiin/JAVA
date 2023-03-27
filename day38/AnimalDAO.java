package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AnimalDAO {
	
	public int insert(MockVO2 bag) {
		// 1. 가방을 받아서 변수에 넣어주세요
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "insert into car values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			// 2. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getModel());
			ps.setString(3, bag.getColor());
			ps.setString(4, bag.getMoney());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("회원가입 성공");
			}
			// System.out.println(result);
		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}

}