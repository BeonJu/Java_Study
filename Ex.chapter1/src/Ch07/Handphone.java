package Ch07;

public class Handphone {
//필드
	public String model;
	public String color;
	
	//생성자
	public Handphone() {
		System.out.println("부모 생성자 실행");
	}
	
	public Handphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendvoice(String message) {
		System.out.println("목소리를 전달 합니다." +message );
	}
	public void receiveVoice(String message) {
		System.out.println("목소리를 받습니다." + message);
	}
	public void hangUp() {
		System.out.println("통화 종료를 합니다.");
	}

}
