package interface3;

public class Driverhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dirver = new Driver();
		Bus2 bus = new Bus2();
		Taxi taxi = new Taxi();
		
		dirver.driver(bus);
		dirver.driver(taxi);
	}

}
