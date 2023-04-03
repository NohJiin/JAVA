package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
// 테이블 하나당 DAO 하나 ==> CUD를 완성
public class ReplyDAO {
	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		
		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요
		// ArrayList<MemberVO>
		ArrayList<ReplyVO> list = new ArrayList<>();
		
		ReplyVO bag = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			// 조건없이 모두 가져온다
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bbsno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공");
			while(rs.next()) { // 검색결과가 있는지 여부는 res.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				
				// 값이 있다면 rs결과에서 하나씩 값을 가져온다
				int no = rs.getInt(1);
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				
				// 가져온 값을 bag에 넣는다
				bag = new ReplyVO();
				bag.setNo(no);
				bag.setBbsno(bbsno2);
				bag.setContent(content);
				bag.setWriter(writer);
				
				// 만들어진 가방을 가방을 모으는 list에 넣는다
				list.add(bag);
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}
		// 리스트의 모음을 전달함 (bag의 모음)
		return list;
	}
	
	public void insert(ReplyVO bag) {
		// ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");
			
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");
			
			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into reply (bbsno, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			
			
			// R빼고 인덱스 0부터 시작
			// 유일하게 DB는 인덱스가 1부터 시작
			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			// => insert into hr.MEMBWE2 values('a', 'a', 'a', 'a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}
	}
//	public void delete(int no) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
//			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");
//
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			System.out.println("2. mySQL 연결 성공");
//			
//			String sql = "delete from reply where NO = ?";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			ps.setInt(1, no);
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
//			
//			ps.executeUpdate();
//			System.out.println("4. SQL문 오라크로 보내기 성공");
//			
//		} catch (Exception e) {	// 모든 예외처리 해달라
//			e.printStackTrace();
//		}
//	}
//	
//	public void update(ReplyVO bag) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
//			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");
//
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			System.out.println("2. mySQL 연결 성공");
//			
//			String sql = "update reply set content = ? where NO = ?";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			ps.setString(1, bag.getContent());
//			ps.setInt(2, bag.getNo());
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
//			
//			ps.executeUpdate();
//			System.out.println("4. SQL문 오라크로 보내기 성공");
//			
//		} catch (Exception e) {	// 모든 예외처리 해달라
//			e.printStackTrace();
//		}
//	}
	

}