package Ch07;

public class Smartphone extends Handphone {
	//필드
	public boolean wifi;
	
	//생성자
	public Smartphone(String model, String color) { // myPhone의 갤럭시, 은색 
		
		super(); // 부모생성자 호출      myPhone의 갤럭시, 은색 -> Smartphone 갤럭시, 은색 -> Handphone 갤럭시, 은색으로 가서 초기값 선언 및 거쳐온 모든 곳의 필드와 메소드를 사용 가능 
		System.out.println("자식 생성자 호출");
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
