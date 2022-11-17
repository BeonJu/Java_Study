package Ch07;

public class Smartphone extends Handphone {
	//필드
	public boolean wifi;
	
	//생성자
	public Smartphone(String model, String color) {
		this.model = model; //부모필드에 초기값을 준다.
		this.color = color;
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결 합니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
