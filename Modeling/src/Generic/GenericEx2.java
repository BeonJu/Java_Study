package Generic;

public class GenericEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product<TV, String> productTv  = new Product<>();
		Product<Car, String> producCar  = new Product<>();
		
		productTv.setKind(new TV());
		productTv.setModel("스마트TV");
		
		TV tv = productTv.getKind();
		String tvModel = productTv.getModel();
		tv.whatch();
		
		producCar.setKind(new Car());
		producCar.setModel("전기자동차");
		
		Car car = producCar.getKind();
		String carModel = producCar.getModel();
		car.run();
		
		
		
		
		
	}

}
