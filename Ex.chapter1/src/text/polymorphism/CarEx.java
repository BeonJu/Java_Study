package text.polymorphism;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Car car = new Car();
	car.tire = new Tire();
	car.run();
	car.tire = new KRTire();
	car.run();   
	car.tire = new KHTire();
	car.run();
	}
}
