package multi;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 외부에서 가져온 코드를 사용할 때 xml을 사용한다. 내 코드인 경우에는 annotation을 사용하는 것을 권장
// @ : at(-에 : 지워도 상관없음, 가독성 / 확인용도), annotation(표시, 어노테이션 : 특정한 처리 용도, 이 표시를 사용함으로써 주소를 설정함)
// @WebServlet("/Test")
public class Test extends HttpServlet {
       
	public void init(ServletConfig config) throws ServletException {
		String no = config.getInitParameter("no");
		System.out.println(no);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}