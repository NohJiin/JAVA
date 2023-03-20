package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// 서블릿만들 때 패스워드가 안맞으면 어떻게할지 지정!!
		System.out.println("Check 서블릿 객체가 하나 만들어진다.");
	}
	
	@Override
	public void destroy() {
		System.out.println("Check 서블릿 소멸됨");
	}
	
	// get요청, 클라이언트로부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");
		if (today.equals("맑음")) {
			out.print("나가자!");
		} else if(today.equals("흐림")) {
			out.print("코딩");
		} else if(today.equals("비옴")){
			out.print("쇼핑");
		} else {
			out.print("그냥 있자!");
		}
		
		out.close();
		// response	= 서버 -> 브라우저
		// request = 브라우저 -> 서버
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post는 body에 담겨오기 때문에 직접 한글로 설정해줘야한다.
		request.setCharacterEncoding("UTF-8");
		// setContentType은 out만들기 전에 설정
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		if (pass.equals("나는왕이다")) {
			out.print("들어오세요.<img src='yes.jpg'>");
		} else {
			out.print("들어올 수 없습니다.<img src='no.jpg'>");
		}
		
		out.close();
	}

}

////get요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String today = request.getParameter("today");
//		String result = "그냥 있자";
//		if (today.equals("맑음")) {
//			result = "나가자";
//		} else if (today.equals("흐림")) {
//			result = "코딩";
//		} else if (today.equals("비옴")) {
//			result = "쇼핑";
//		}
//		// setContentType은 out만들기 전에 설정!!
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print(result);
//		out.close();
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		
//		String pass = request.getParameter("pass");
//		String result = "들어올 수 없습니다.<img src='no.jpg'>";
//		if (pass.equals("나는왕이다")) {
//			result = "들어오세요.<img src='yes.jpg'>";
//		} 
//		// setContentType은 out만들기 전에 설정!!
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print(result);
//		out.close();
//	}