package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 확인문제2 {

	public static void main(String[] args) {
		// 1. 한번 갔던 여행지는 가지 않으려고 한다. 가고 싶은 여행지 5곳을 컬렉션으로 만들어서 프린트
		// 중복제거 => set
		HashSet trip = new HashSet();
		trip.add("제주도");
		trip.add("강원도");
		trip.add("싱가포르");
		trip.add("뉴욕");
		trip.add("프랑스");
		System.out.println(trip);
		
		// 2. 각 방에 물건 배치
		// key, value 쌍으로 넣을 때 ==> map
		// 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는 신발의 정보를 컬렉션으로
		HashMap home = new HashMap();
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		// 1)전체프린트
		System.out.println(home);
		// 2)현관에는 무엇이있나요?
		System.out.println("현관에는 무엇이 있나요? >> " + home.get("현관"));
		// 3)거실에 책상으로 변경하여 전체 프린트
		home.replace("거실", "책상");
		System.out.println(home);
		
		// 3. 오늘 내가 할 일 우선순위 5개의 목록을 만들어라 ==> 순서! : list
//		HashMap list = new HashMap();
//		list.put("1번째","수업");
//		list.put("2번째","저녁");
//		list.put("3번째","운동");
//		list.put("4번째","휴식");
//		list.put("5번째","강아지 산책");
//		// 1)전체프린트
//		System.out.println(list);
//		// 2)첫번째 할일과 마지막 할 일 프린트
//		System.out.println("첫번째로 할 일 : " + list.get("1번째"));
//		System.out.println("두번째로 할 일 : " + list.get("2번째"));
//		// 3)2번쩨 할 일을 "청소"로 변경하여 전체 프린트
//		list.replace("2번째", "청소");
//		System.out.println(list);
		ArrayList list = new ArrayList();
		list.add("자바공부");
		list.add("점심");
		list.add("자바복습");
		list.add("자바스터디");
		list.add("쉬기");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		list.set(1, "청소");
		System.out.println(list);
		
	}

}