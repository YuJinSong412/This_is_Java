package Exercise06;

class Car3{
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				gas -=1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;
			}
		}
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Car3 car = new Car3();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		if(car.isLeftGas()) {
			System.out.println("gas주입할 필요가 없습니다.");	
		}else {
			System.out.println("gas를 주입하세요");
		}

	}

}
