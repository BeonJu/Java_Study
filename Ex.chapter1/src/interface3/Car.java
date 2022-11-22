package interface3;

public class Car {
	//필드
	
	Tire tire1 = new HKTire();
	Tire tire2 = new HKTire();
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
