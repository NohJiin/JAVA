package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 100; i++) {
			// 서버랑 클라이언트랑 양쪽에 전화기 역할을 하는
			// 소켓이 있어야함
			// 승인요청을 보냄
			Socket socket = new Socket("localhost", 9999);
			// ip넣어도 된다 ("ip주소", port)
			System.out.println("클라이언트 승인 요청 보냄!");
		}
	}

}