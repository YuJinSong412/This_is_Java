package Exercise07;

class Tire{
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" Tire 펑크***");
			return false;
		}
	}
}
class Car{
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
		
	}
}
class HanKook extends Tire{
	HanKook(String location, int maxRotation){
		super(location, maxRotation);
	}
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HanKookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" HanKookTire 펑크***");
			return false;
		}
	}
}
class KumhoTire extends Tire{
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" KumhoTire 펑크***");
			return false;
		}
	}
	
}
public class Ex03 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new HanKook("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 HanKookTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HanKookTire로 교체");
				car.backLeftTire = new HanKook("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HanKookTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽",17);
				break;
			}
			System.out.println("-------------------------");
		}

	}

}
