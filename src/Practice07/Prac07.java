package Practice07;

class Tire{
	void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
class Snow extends Tire{
	void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
public class Prac07 {

	public static void main(String[] args) {
		Snow snow = new Snow();
		Tire tire = snow;
		
		snow.run();
		tire.run();
	}

}
