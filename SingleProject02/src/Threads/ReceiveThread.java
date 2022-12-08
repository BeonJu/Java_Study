package Threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReceiveThread extends Thread{

	
	//필드
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	//  list 의 유연성 때문에 위와 같 선언, list(인터페이스라고 보면 됨) 안에 Arraylist, Linkenlist 등이 포함되어있음
	//collection은 인터페이스 Set, List, Queue 인터페이스를 가지고 있음
	//collections는 클래스, EMPTY_LIST,EMPTY_SET,EMPTY_MAP 필드를 가지고 있음
	//Collections.synchronizedList 동기화 list , Thread-safe를 구현, 다만 쓰레드가 작업을 할때 락이 걸림으로 병렬처리는 안됨
	
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	//소켓, 버퍼리더, 프린트라이트 객체 변수 선언

	//메소드
	public ReceiveThread(Socket socket) {
		this.socket = socket;
		
		try {
			out  = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			list.add(out);
			// 서버와 클라이언트의 양쪽 소켓끼리 입력스트림과 출력스트림으로 데이터를 주고 받음
			// PrintWriter는 개체의 형식화된 표현을 텍스트 출력 스트림에 출력한다. 
			//이 클래스는 PrintStream에 있는 모든 출력 메서드를 구현한다. 

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		String name ="";
		
		try {
			//최초 1회는 client 이름을 수신
			name = in.readLine();
			System.out.println(name + "새 연결 생성");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
