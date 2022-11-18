package Ch07;

public class SupersonicAirplaneEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupersonicAirplane Air = new SupersonicAirplane();
		Air.takeOff();
		Air.fly();
		System.out.println("  FlyMode: " + Air.flymode);
		Air.flymode = SupersonicAirplane.SUPERSONIC;
		Air.fly();
		System.out.println("  FlyMode: " + Air.flymode);
		

	}

}
