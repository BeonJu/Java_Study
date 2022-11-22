package interface3;

public class CastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		bus.run();
	}

}
