package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayListController {
	
	@Autowired
	PlayListDAO dao;
	
	@RequestMapping("insert4")
	public void insert(PlayListDTO bag) {
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update4")
	public void update(PlayListDTO bag) {
		System.out.println(bag );
		System.out.println(dao);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete4")
	public void delete(String title) {
		System.out.println("삭제할 플레이리스트 title : " + title);
		
		dao.delete(title);
	}
	
	@RequestMapping("one4")
	public void one(String title, Model model) {
		System.out.println("검색할 북마크 title : " + title);
		
		PlayListDTO bag = dao.one(title);	// 검색한 결과 저장
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list4")
	public void list(Model model) {
		ArrayList<PlayListDTO> list = dao.list();
		System.out.println(list.size());
		
		model.addAttribute("list", list);
	}
}