package Exercise08;

public interface Ex02 {

	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	public static void chageBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
