package PaperTest01;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		vehicle.run();
		Bus vehiBus = (Bus)vehicle;
		vehicle.run();
		vehiBus.checkFare();
	}

}
