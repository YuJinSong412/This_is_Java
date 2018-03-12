package Exercise06;

class  Calculator{
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x,int y) {
		double result = (double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(5,6);
		System.out.println("result1: "+result1);
		
		byte x =10; byte y =4;
		double result2 = cal.divide(x,y);
		System.out.println("result2: "+result2);
		
		cal.powerOff();

	}

}
