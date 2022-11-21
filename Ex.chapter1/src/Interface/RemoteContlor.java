package Interface;

public interface RemoteContlor {
	// 인퍼에스에 선언된 변수는 모두 public static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// public 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
//	디폴트 메소드: 인터페이스에서 실행 메소드를구현하고 싶을 때 사용
//	오버라이드시 반드시 public 접근 제한자를 붙여야 한다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음거소 완료");
			this.setVolume(MIN_VOLUME);
		}else {
			System.out.println("음거소 해제");
		}
	}
	
//	정적 Static  메소드 
//	코드를 구현 할 수 있다.
//	컴파일 과정에서 public이 자동으로 붙음
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
