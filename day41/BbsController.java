package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2")
	public void insert(BbsVO bag) {
		System.out.println("insert됨");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);	// DB에 전달(연결)
	}
	
	@RequestMapping("delete2")
	public void delete(int no) {
		System.out.println("delete됨");
		System.out.println(no);
		System.out.println(dao);
		
		dao.delete(no);
	}
	
	@RequestMapping("update2")
	public void update(BbsVO bag) {
		System.out.println("update됨");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.update(bag);
	}
	
	@RequestMapping("one2")
	public void one(int no, Model model) {
		System.out.println("one됨");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	
//	public void list() {
//		System.out.println("list됨");
//	}
}