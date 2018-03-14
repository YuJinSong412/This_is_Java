package Exercise08;

interface Tire2 {
	public void roll();
}

class HanKook implements Tire2 {
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}

class Kumho implements Tire2 {
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}

class Car2 {
	Tire2[] tires = { new HanKook(), new HanKook(), new HanKook(), new HanKook() };
	
	void run() {
		for(Tire2 tire : tires) {
			tire.roll();
		}
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Car2 car = new Car2();
		
		car.run();
		System.out.println();
		
		car.tires[0]= new Kumho();
		car.tires[1] = new Kumho();
		
		car.run();

	}

}
