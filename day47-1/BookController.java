package com.multi.mvc300;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// controller 설정하기
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3")
	public void insert(BookDTO bag) {
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update3")
	public void update(BookDTO bag) {
		System.out.println(bag);
		System.out.println(dao);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete3")
	public void delete(int id) {
		System.out.println("삭제할 북마크 id : " + id);
		System.out.println(dao);
		
		dao.delete(id);
	}
	
	@RequestMapping("one3")
	public void one(int id, Model model) {
		System.out.println("삭제할 북마크 id : " + id);
		
		BookDTO bag = dao.one(id);	// 검색한 결과 저장
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list3")
	public void list(Model model) {
		List<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
//	
//	@RequestMapping("list3")
//	public void list(Model model) {
//		ArrayList<BookDTO> list = dao.list();
//		System.out.println(list.size());
//		
//		model.addAttribute("list", list);
//	}
}