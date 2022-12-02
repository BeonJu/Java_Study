package ThreadCh01;

import java.awt.Toolkit;

public class Ch02 extends Thread{
	
	
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
	
	

	public static void main(String[] args) {
		//자동 형 변환되어 오버라이드 된 메소드만 실행 가능
		Thread th = new Ch02();
		th.start();
		
		
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
