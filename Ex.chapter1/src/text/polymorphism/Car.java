package text.polymorphism;

public class Car {
	
	static public int speed;
	public Tire tire;
	
	public void run() {
		tire.roll();
		System.out.println(speed + "k/m로 운전 중입니다.");
	}

}
