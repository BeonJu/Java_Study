package Ch07;

// 클래스 앞에 final을 붙이면 그 클래스는 부모 클래스로 사용 할수 없다 ㅠ
public class AirPlane {
//메소드에 final을 뭍이면 그 메소는 오버라이딩 될수 없다
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.print("일반 비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	}
	
	
}
