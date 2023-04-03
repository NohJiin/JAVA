package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	@RequestMapping("movie")
	public void movie(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("fruit")
	public void fruit(Model modle) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("복숭아");
		list.add("딸기");
		list.add("메론");
		list.add("키위");
		list.add("오렌지");
		modle.addAttribute("list", list);
	}
	
	@RequestMapping("tour")
	public void tour(Model modle) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("런던");
		list.add("뉴욕");
		list.add("캐나다");
		list.add("도쿄");
		list.add("프랑스");
		list.add("스위스");
		modle.addAttribute("list", list);
	}
}