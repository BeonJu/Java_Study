package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import Threads.SendThread;

public class MultiClient {

	public static void main(String[] args) {
		MultiClient multiClient = new MultiClient();
		multiClient.start();

	}

	public void start() {
		Socket socket = null;
		BufferedReader in = null;

		try {
			socket = new Socket("localhost", 8000);
			// server localhost(127.0.0.1), port bind
			System.out.println("서버와 연결 되었습니다.");

			String name = "user" + (int) ((Math.random() * 10) + 1);
			Thread sendThread = new SendThread(socket, name);
			sendThread.start();

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (in != null) {
				String inputMsg = in.readLine();
				if (("[" + name + "]" + "님이 나가셨습니다.").equals(inputMsg)) {
					break;
				}
				System.out.println(inputMsg);
			}

		} catch (IOException e) {
			System.out.println("서버 접속끊김");
		} finally {
			try {
				socket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("서버 연결종료");
	}

}
