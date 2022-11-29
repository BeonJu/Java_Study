package Generic2;

public class RentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeAgency ha = new HomeAgency();
		CarAgency ca = new CarAgency();
		
		Home home = ha.rent();
		home.turnOnLight();
		
		Car car = ca.rent();
		car.run();
	}

}
