package Ch07;

public class SupersonicAirplane extends AirPlane{
	final static public int NORMAL = 1;
	final static public int SUPERSONIC = 2;
	
	public int flymode = NORMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
//		super.fly();
		
		if(flymode == SUPERSONIC) {
			System.out.print("초음속 비행");
		}else if(flymode == NORMAL) {
			super.fly();
		}
		
		
	}
	
	



}
