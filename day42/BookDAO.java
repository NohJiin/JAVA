package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component	// 싱글톤 만들기
public class BookDAO {
	public int insert(BookDTO bag) {
		// 1. 가방을 받아서 변수에 넣어주세요
		int result = 0;

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
			String sql = "insert into book (name, url, img) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			// R빼고 인덱스 0부터 시작
			// 유일하게 DB는 인덱스가 1부터 시작

			// 2. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("북마크 등록 성공");
			}
			// System.out.println(result);
		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}

	public int delete(String id) {	// id말고 name으로 삭제 처리
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "delete from book where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("북마크 삭제 성공");
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

	// 1. 가방을 받아서 저장해두자
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자
	public int update(BookDTO bag) {	// name으로 url수정하기
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "update book set url = ? where name = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getUrl());
			ps.setString(2, bag.getName());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("회원정보 수정 성공");
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			result = 0;
			e.printStackTrace();
		}
		return result;
	}
	
	public BookDTO one(String id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형)은 주소가 들어가있음
		// 참조형 변수를 초기화 할때는 null (주소가 없다라는 의미)
		
		BookDTO bag = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "select * from book where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (rs.next()) { // 검색결과가 있는지 여부는 res.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공");
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				System.out.println(id2 + " " + name + " " + url2 + " " + img);
				// 검색결과를 검색화면 UI부분을 주어야함
				bag = new BookDTO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야함
		return bag;
	}
	
	public ArrayList<BookDTO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		
		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요
		// ArrayList<MemberVO>
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		
		BookDTO bag = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공");
			while(rs.next()) { // 검색결과가 있는지 여부는 res.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면
				// 2. 각 컬럼에서 값들을 꺼내오자
				// System.out.println("검색결과 있음. 성공");
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				
				// 검색결과를 검색화면 UI부분을 주어야함
				// 3. 가방을 만들자
				bag = new BookDTO();
				bag.setId(id);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);
				
				// 4. list에 bag을 추가
				list.add(bag);
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야함
		return list;
	}

}