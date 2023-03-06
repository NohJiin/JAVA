package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// import자동으로 시키는 것 : ctrl + shift + o(영문)

public class 네이버증권크롤링비교 {
	// 크롤링은 인터넷 문서(html)를 받아와서
	// html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것
	static String today, high, low; 
	public void naver(String code2) {
		// 삼성전자
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		// System.out.println("1. 네트워크 연결 성공" + con);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); // 하나여도 ArrayList에
			// System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = codeList.text();
			System.out.println("코드\t" + code);

			// <span class="blind">
			Elements list = doc.select("span.blind");

			// 현재가
			// System.out.println(list.get(12));
			Element tag2 = list.get(12);
			today = tag2.text();
			System.out.println("현재가\t" + today);
			// 고가
			// System.out.println(list.get(16));
			Element tag3 = list.get(16);
			high = tag3.text();
			System.out.println("고가\t" + high);
			// 저가
			// System.out.println(list.get(20));
			Element tag4 = list.get(20);
			low = tag4.text();
			System.out.println("저가\t" + low);

		} catch (Exception e) {
			e.printStackTrace();
		} // html 코드를 다 가지고 와서 doc 변수에 넣어놨음
		// System.out.println(doc);

		// 심화)) 파일에 저장(파일명: 005930.txt)
		try {
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2 + "\n");
			file.write("현재가" + today + "\n");
			file.write("최저가" + low + "\n");
			file.write("최고가" + high + "\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}