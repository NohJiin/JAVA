package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component	// 싱글톤 만들기
public class PlayListDAO {
	public int insert(PlayListDTO bag) {
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
			String sql = "insert into playlist values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			// R빼고 인덱스 0부터 시작
			// 유일하게 DB는 인덱스가 1부터 시작

			// 2. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setInt(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getArtist());
			ps.setString(4, bag.getGenre());
			ps.setString(5, bag.getImg());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("플레이리스트 등록 성공");
			}
			// System.out.println(result);
		} catch (Exception e) { // 모든 예외처리 해달라
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}

	public int delete(String title) {	// id말고 name으로 삭제 처리
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

			String sql = "delete from playlist where title = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, title);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("플레이리스트 삭제 성공");
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

	// 1. 가방을 받아서 저장해두자
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자
	public int update(PlayListDTO bag) {	// name으로 url수정하기
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

			String sql = "update playlist set img = ? where title = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getImg());
			ps.setString(2, bag.getTitle());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("플레이리스트 수정 성공");
			}

		} catch (Exception e) { // 모든 예외처리 해달라
			result = 0;
			e.printStackTrace();
		}
		return result;
	}
	
	public PlayListDTO one(String title) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형)은 주소가 들어가있음
		// 참조형 변수를 초기화 할때는 null (주소가 없다라는 의미)
		
		PlayListDTO bag = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "select * from playlist where title = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, title);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (rs.next()) { // 검색결과가 있는지 여부는 res.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공");
				int id = rs.getInt(1);
				String title2 = rs.getString(2);
				String artist = rs.getString(3);
				String genre = rs.getString(4);
				String img = rs.getString(5);
				System.out.println(id + " " + title2 + " " + artist + " " + genre + " " + img);
				// 검색결과를 검색화면 UI부분을 주어야함
				bag = new PlayListDTO();
				bag.setId(id);
				bag.setTitle(title2);
				bag.setArtist(artist);
				bag.setGenre(genre);
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
	
	public ArrayList<PlayListDTO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		
		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요
		// ArrayList<MemberVO>
		ArrayList<PlayListDTO> list = new ArrayList<PlayListDTO>();
		
		PlayListDTO bag = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공");

			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공");

			String sql = "select * from playlist";
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
				String title2 = rs.getString(2);
				String artist = rs.getString(3);
				String genre = rs.getString(4);
				String img = rs.getString(5);
				
				// 검색결과를 검색화면 UI부분을 주어야함
				// 3. 가방을 만들자
				bag = new PlayListDTO();
				bag.setId(id);
				bag.setTitle(title2);
				bag.setArtist(artist);
				bag.setGenre(genre);
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