package Interface;

public class Audio implements RemoteContlor{
	private int volume;
	private int memoryVolme;

	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio 꺼짐");
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
		System.out.println("Audio 볼륨: "+volume);
	}


	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio 음소거 전, volume: "+ this.volume);
			this.memoryVolme = this.volume;
			this.volume = RemoteContlor.MIN_VOLUME;
			System.out.println("Audio 음소거 완료, volume: "+ this.volume);
		}else {
			System.out.println("Audio 음소거 해제 전, volume: "+ this.volume);
			this.volume = this.memoryVolme;
			System.out.println("Audio 음소거 해제, volume: "+ this.volume);
			
		}
	}
}
