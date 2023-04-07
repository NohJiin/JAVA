package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	// 싱글톤 만들기
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO bag) {
		int result = my.insert("book.create", bag);
		return result;
	}

	public int delete(int id) {	// id말고 name으로 삭제 처리
		int result = my.delete("book.del", id);
		return result;
	}

	// 1. 가방을 받아서 저장해두자
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자
	public int update(BookDTO bag) {	// name으로 url수정하기
		int result = my.update("book.up", bag);
		return result;
	}
	
	public BookDTO one(int id) {
		BookDTO bag = my.selectOne("book.one", id);
		return bag;
	}
	
	public List<BookDTO> list() {
		List<BookDTO> list = my.selectList("book.all");
		return list;
	}
//	
//	public ArrayList<BookDTO> list() {
//		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
//		
//		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요
//		// ArrayList<MemberVO>
//		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
//		
//		BookDTO bag = null;
//		
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
//			String sql = "select * from book";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
//
//			rs = ps.executeQuery(); // select문 전송시
//			System.out.println("4. SQL문 오라클로 보내기 성공");
//			while(rs.next()) { // 검색결과가 있는지 여부는 res.next()
//				// true이면 있다라는 의미, false이면 없다라는 의미
//				// 1. 검색결과가 있으면
//				// 2. 각 컬럼에서 값들을 꺼내오자
//				// System.out.println("검색결과 있음. 성공");
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String url2 = rs.getString(3);
//				String img = rs.getString(4);
//				
//				// 검색결과를 검색화면 UI부분을 주어야함
//				// 3. 가방을 만들자
//				bag = new BookDTO();
//				bag.setId(id);
//				bag.setName(name);
//				bag.setUrl(url2);
//				bag.setImg(img);
//				
//				// 4. list에 bag을 추가
//				list.add(bag);
//			}
//
//		} catch (Exception e) { // 모든 예외처리 해달라
//			e.printStackTrace();
//		}
//		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야함
//		return list;
//	}

}