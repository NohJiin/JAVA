package 자바DB연결;

import java.sql.DriverManager;

public class DB연결테스트 {

	public static void main(String[] args) {
		// 1. 오라클 11g와 연결할 부품 설정
		// 외부파일 연결 -> try/catch
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
		} catch (Exception e) {	// 모든 예외처리 해달라
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}