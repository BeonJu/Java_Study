package Interface;

public class TV implements RemoteContlor{

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 꺼짐");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteContlor.MAX_VOLUME) {
			this.volume = RemoteContlor.MAX_VOLUME;
		}else if(volume < RemoteContlor.MIN_VOLUME) {
			this.volume = RemoteContlor.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("TV 볼륨: "+volume);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteContlor.super.setMute(mute);
	}






	
	
	

	
	
}
