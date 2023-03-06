package 주식정보시스템;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {
	// 크롤링은 인터넷 문서(html)를 받아와서
	// html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		// 삼성전자
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		// System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null;	// 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); // 하나여도 ArrayList에
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = codeList.text();
			System.out.println("코드는 " + code);
			
			// <span class="blind">
			Elements list = doc.select("span.blind");
			System.out.println(list.size());
			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + ":" + list.get(i));
			}
			
			// 현재가
			System.out.println();
			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			// 고가
			System.out.println(list.get(16));
			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("고가 " + high);
			// 저가
			System.out.println(list.get(20));
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("저가 " + low);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	// html 코드를 다 가지고 와서 doc 변수에 넣어놨음
		//System.out.println(doc);

	}

}