package Exercise06;

    class myCar{
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
}
public class Ex12 {

	public static void main(String[] args) {
		myCar car = new myCar();
		
		car.setSpeed(-50);
		
		System.out.println("현재 속도: "+car.getSpeed());
		
		car.setSpeed(60);
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재 속도: "+car.getSpeed());

	}

}
