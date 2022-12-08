package Server;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void start() {
		
		ServerSocket serverSocket = null;
		// ServerSocke 객체 변수 생성 후 null 값 초기화
		Socket socket = null;
		// Socket 객체 변수 생성 후 null 값 초기화
		
//		서버 컴퓨터에 다중 IP가 할당되어 있고, 특정 IP로만 접속할 때 연결을 수락하고 싶을 경우에는
//		ServerSocket serverSocket = new ServerSocket();
//		serverSocket.bind(new InetSocketAddress("localhost", 포트 번호));
		// localhost 대신 정확한 IP주소를 주면 됩니다. IP + port 바인딩
		
		try {
			serverSocket = new ServerSocket(8000);
			//serverSocket 객체 생성 및 사용할 8000 port 지정(바인딩)
			
			while(true) {
				System.out.println("클라이언트 연결 대기중");
				socket = serverSocket.accept();
				// 클라이언트 연결 수락을 위해 스레드 대기 상태, 단 UI를 생성하거나 이벤트를 처리 하는 스레드에서는 accept를 호출 하면 안됩니다. 
				//accept로 인해 블로킹 상태로 진입 되기 때문에 동작이 안됩니다.
				
				
				
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		
		
	}
	
	
	
	
	

}
