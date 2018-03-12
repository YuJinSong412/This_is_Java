package Exercise06;

public class Ex09 {

	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) {
		Ex09 car = new Ex09();
		car.speed=60;
		car.run();

	}

}
