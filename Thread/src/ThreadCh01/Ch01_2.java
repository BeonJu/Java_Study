package ThreadCh01;

import java.awt.Toolkit;

public class Ch01_2 {
	// 스레드를 객체로 관리 함으로 클래스가 필요하다 .그걸 익명 객체, Runnable인터페이스로 구현 하여 관리

	public static void main(String[] args) {

		Thread thread = new Thread() {
			

			// 실행 될수 있는 코드 영역, start 필요
			@Override
			public void run() {
				// TODO Auto-generated method stub

				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 비프음
					try {
						Thread.sleep(500);

					} catch (Exception e) {
						// TODO: handle exception

					}
				}



			}
		};
		
		//위에 따로 만든 쓰레드 시작
		thread.start();
		
		//메인 쓰레드
		for (int i = 0; i < 5; i++) {
			System.out.println("비프음");
			try {
				Thread.sleep(500);

			} catch (Exception e) {
				// TODO: handle exception

			}

		}

	}

}
