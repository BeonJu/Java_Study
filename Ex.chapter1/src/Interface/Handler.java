package Interface;

public class Handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RemoteContlor rc = new TV();
		RemoteContlor rc;
		rc = new Audio();
//		rc.turnOn();
//		rc.turnOff();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		
		
		
		rc = new TV();
//		rc.turnOn();
//		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		
//		System.out.println(RemoteContlor.MAX_VOLUME + " " +RemoteContlor.MIN_VOLUME );

	}

}
