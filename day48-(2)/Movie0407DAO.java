package com.multi.mvc700;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	// 싱글톤 객체 생성
public class Movie0407DAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(Movie0407VO bag) {
		int result = my.insert("movie0407.create", bag);
		return result;
	}
	
	public int update(Movie0407VO bag) {
		int result = my.update("movie0407.up", bag);
		return result;
	}
	
	public int delete(int id) {
		int result = my.delete("movie0407.del", id);
		return result;
	}
	
	public Movie0407VO one(int id) {
		Movie0407VO bag = my.selectOne("movie0407.one", id);
		return bag;
	}
	
	public List<Movie0407VO> list() {
		List<Movie0407VO> list = my.selectList("movie0407.all");
		return list;
	}
}