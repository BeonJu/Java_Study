package MultiThread;

public class Ch01 {

	public static void main(String[] args) {
		//현재 실행 될 쓰레드를 가져 온다. 이 경우는 메인 쓰레드 이다.
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		
		
		
		
		
		//쓰레드 3개 생성
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {

				// 익명
				@Override
				public void run() {
					// 쓰레드 변수명을 가져옴
					System.out.println(getName());
				}

			};
			threadA.start();
		}
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 쓰레드 변수명을 가져옴
				System.out.println(getName());
			}
		};
		//쓰레드가 start 되기 전에 setName으로 이름 변경
		threadB.setName("Chat-Thread");
		threadB.start();
		

	}

}
