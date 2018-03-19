package Exercise09;

interface RemoteControl{
	public void turnOn();
	public void turnOff();
}
class Anonymous2{
	RemoteControl field = new RemoteControl() {
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
		public void turnOff() {
			System.out.println("Tv를 끕니다.");
		}
	};
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		anony.field.turnOn();
		anony.method1();
		
		anony.method2(new RemoteControl() {
			public void turnOn() {
				System.out.println("SmartTv를 켭니다.");
			}
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});

	}

}
