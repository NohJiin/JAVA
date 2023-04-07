package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController { // 내가 json목록을 만들어서 실행 jsp에 넘겨주는 것

	@RequestMapping("json1")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서
					// 요청하는 곳으로 다시 보냄(views를 쓰지 않아도 된다는 의미)
	public MemberVO json1() { // 파라미터에 membervo를 넣어서 사용해도 된다
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");

		return bag; // {"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}

	@RequestMapping("json2")
	@ResponseBody
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO(); // [json]
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");

		MemberVO bag2 = new MemberVO(); // [json]
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);

		return list; // [json] [json]
	}

	@RequestMapping("json3")
	@ResponseBody
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(23);
		bag.setTitle("수요일");
		bag.setContent("한주가 이렇게 지나다니");
		bag.setWriter("apple");

		return bag;
	}

	@RequestMapping("json4")
	@ResponseBody
	public ArrayList<BbsVO> json4() {
		// 첫 번째 json 생성
		BbsVO bag = new BbsVO();
		bag.setNo(23);
		bag.setTitle("수요일");
		bag.setContent("한주가 이렇게 지나다니");
		bag.setWriter("apple");

		// 첫 번째 json 생성
		BbsVO bag2 = new BbsVO();
		bag2.setNo(24);
		bag2.setTitle("내일은");
		bag2.setContent("목요일이다");
		bag2.setWriter("peach");

		// list에 생성한 json넣어서 리스트에 넣기
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);

		// views를 안가도 값을 반환할 수 있도록 return
		return list;
	}

	// 위도, 경도 지도위치 표시하기
	@RequestMapping("jsonResponse5")
	@ResponseBody
	public ArrayList<LocationVO> jsonResponse5() {
		LocationVO bag = new LocationVO();
		bag.setSpace("제주도 돌고래스팟"); // 3d33.2643828!4d126.1791181
		bag.setLat(33.2643828);
		bag.setLon(126.1791181);

		LocationVO bag2 = new LocationVO();
		bag2.setSpace("오설록 티 뮤지엄"); // 3d33.3058932!4d126.289534
		bag2.setLat(33.3058932); // 3d33.3058932!4d126.289534
		bag2.setLon(126.289534);

		ArrayList<LocationVO> list = new ArrayList<LocationVO>();
		list.add(bag);
		list.add(bag2);

		return list;
	}

	// 구글차트에 넣을 json 만들기
	@RequestMapping("jsonResponse6")
	@ResponseBody
	public ArrayList<ChartVO> jsonResponse6() {
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();

		ChartVO vo = new ChartVO();
		vo.setWork("study!");
		vo.setTime(10);
		list.add(vo);

		ChartVO vo2 = new ChartVO();
		vo2.setWork("run!");
		vo2.setTime(5);
		list.add(vo2);

		ChartVO vo3 = new ChartVO();
		vo3.setWork("eat!");
		vo3.setTime(7);
		list.add(vo3);

		return list;
	}
}