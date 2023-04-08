package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// 스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게라고 설정해야함
// 2가지 방법으로 할 수 있음
// 1) 어노테이션(표시) 2) xml방법
@Component	// => 싱글톤으로 처리
public class MemberDAO {
	@Autowired
	SqlSessionTemplate my;
	
//	public ArrayList<MemberVO> list() {
//		return list;
//	}
//
//	// 항상 특정한 방법으로 실행하는 클래스 (= model, 방법)
//	public int login(MemberVO bag) {
//		return result;
//	}
//	
	public MemberVO one(String id) {
		MemberVO bag = my.selectOne("member.one", id);
		return bag;
	}

	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}

	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//						namespace.id
		return result;	// 0 : insert실패, 1 : insert성공
	}

}