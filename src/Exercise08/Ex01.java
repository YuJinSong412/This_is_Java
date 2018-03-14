package Exercise08;

public interface Ex01 {
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public void setVolume(int volume);
}
