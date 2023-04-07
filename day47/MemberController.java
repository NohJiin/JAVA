 package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// 스프링에서 제어하는 역할로 등록!
public class MemberController {
	@Autowired	// => 이미 만들어진 싱글톤이 있으면 자동으로 (찾아서) 그 주소를 넣어준다
	MemberDAO dao;	// 전역변수(global변수) : 클래스 전체에서 사용하기 위해서
	// 컨트롤하는 기능 (CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession sessoin) {
		System.out.println(bag);
		
		// dao를 이용해서 db처리할 예정
		// views아래로 넘어가게 되어있음
		// views아래 login.jsp를 호출하게 됨(처리결과를 담기위함)
		int result = dao.login(bag);	// 성공:1, 실패:0
		
		if (result == 1) {	// views 아래 파일이름.jsp
			// 로그인이 성공하면, 세션을 잡아두자
			sessoin.setAttribute("id", bag.getId());
			return "ok";
		} else {
			// views 아래가 아니고, webapp아래
			// member.jsp로 가고 싶은 경우
			// return "redirect:member.jsp";
			return "redirect:login.jsp";
		}
	}
	
	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요처당 하나의 메서드
	// 하나의 버튼 호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지를
	// 써주어야한다
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		// 메서드의 입력변수(파라메터)로 변수를 선언해주면
		// 컨트롤러내의 메서드 내에서는 1) bag을 만들어서
		// 2) 클라이언트로부터 전달된 데이터도 받아줌
		// 3) bag에 데이터 다 넣어줌
		System.out.println("insert요청됨");
		System.out.println(bag);	// toString을 막았으므로 주소가 찍힌다
		System.out.println(dao);
		// MemberDAO dao = new MemberDAO(); => 파라미터에서 선언함으로 대체
		// dao에 insert요청
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨");
		System.out.println(id);
		
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨");
		System.out.println(id);
		
		MemberVO bag = dao.one(id);	// bag에 검색한 결과가 들어가있음
		// views아래 one.jsp로 쓸 수 있도록 설정해주어야 함
		model.addAttribute("bag", bag);
		// views까지 전달할 속성으로 추가해주세요
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		// model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MemberVO> list = dao.list();
		
		model.addAttribute("list", list);	// EL로 출력
	}
	
	@RequestMapping("list7")
	public void list7(Model model) {
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("jsonResponse3")
	@ResponseBody
	public MemberVO jsonResponse3() {
		MemberVO bag = new MemberVO();
		
		bag.setId("apple");
		bag.setName("hong");
		
		return bag;
	}
	
	@RequestMapping("jsonResponse4")
	@ResponseBody
	public ArrayList<MemberVO> jsonResponse4() {
		ArrayList<MemberVO> list = dao.list();
		System.out.println(list.get(0));
		
		return list;
	}
}