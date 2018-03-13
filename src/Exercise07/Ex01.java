package Exercise07;

class Airplane{
	void land() {
		System.out.println("착륙합니다.");
	}
	void fly() {
		System.out.println("일반비행합니다.");
	}
	void takeOff() {
		System.out.println("이륙합니다.");
	}
}
class SuperAirplane extends Airplane{
	static final int NORMAL =1;
	static final int SUPERSONIC = 2;
	
	int flymode = NORMAL;
	
	void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flymode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}