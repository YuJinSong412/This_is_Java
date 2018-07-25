package Practice09;

interface Vehicle{
	public void run();
}
class Anonymous{
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
		
	}
	void method2(Vehicle v) {
		v.run();
	}
}
public class Prac05 {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		
		a.field.run();
		a.method1();
		
		a.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}

}
