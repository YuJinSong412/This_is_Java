package Exercise08;

interface YuJin{
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}

class Audio implements YuJin{
	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > YuJin.MAX_VOLUME) {
			this.volume = YuJin.MAX_VOLUME;
		}else if(volume<YuJin.MIN_VOLUME) {
			this.volume = YuJin.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨: "+volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio 무음 처리 합니다.");
		}else {
			System.out.println("audil 무음 해제합니다.");
		}
	}
}
public class Ex04 {

	public static void main(String[] args) {
		YuJin rc = null;
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

	}

}
