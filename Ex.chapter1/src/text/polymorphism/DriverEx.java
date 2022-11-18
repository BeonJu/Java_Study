package text.polymorphism;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();

		Bus bus = new Bus();
//		자동형변환으로 인하여 오버라이드 된 메소드가 불려온다.
		driver.drive(bus);

		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
