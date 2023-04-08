package com.multi.mvc700;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Movie0407Controller {
	@Autowired
	Movie0407DAO dao;
	
	@RequestMapping("insert")
	public void insert(Movie0407VO bag) {	// Movie0407VO bag이거 해야 스프링이 알아서 넣어준다
		System.out.println("insert 요청됨.");
		System.out.println(bag);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(Movie0407VO bag) {
		System.out.println("update 요청됨.");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(int id) {
		System.out.println("delete 요청됨.");
		System.out.println("삭제 요청 id : " + id);
		
		dao.delete(id);
	}
	
	// select이므로 model객체가 필요하다
	@RequestMapping("one")
	public void one(int id, Model model) {
		System.out.println("상세 검색 요청됨");
		System.out.println("검색 요청 id : " + id);
		
		Movie0407VO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	// select이므로 model객체가 필요하다
	@RequestMapping("list")
	public void list(Model model) {
		System.out.println("전체 정보 요청됨");
		
		List<Movie0407VO> list = dao.list();
		model.addAttribute("list", list);
	}
}