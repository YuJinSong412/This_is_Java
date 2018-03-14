package Exercise08;

interface Tire{
	void roll();
}
class HanKookTire implements Tire{
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
class KumhoTire implements Tire{
	public void roll() {
		System.out.println("큼호 타이어가 굴러갑니다.");
	}
}
class Car{
	Tire frontLeftTire = new HanKookTire();
	Tire frontRightTire = new HanKookTire();
	Tire backLeftTire = new HanKookTire();
	Tire backRightTire = new HanKookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		System.out.println();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		car.run();

	}

}
