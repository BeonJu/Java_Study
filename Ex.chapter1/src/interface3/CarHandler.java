package interface3;

public class CarHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.run();
		
		//타이어객체 교체, 인터페이스 다형성
		myCar.tire2 = new KHTire();
		myCar.run();
		
	}

}

