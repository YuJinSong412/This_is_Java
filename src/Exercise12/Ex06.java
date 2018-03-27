package Exercise12;

public class Ex06 {

	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		
		User1 user1 = new User1();
		user1.setCalculate(calculate);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculate(calculate);
		user2.start();
	}

}
class Calculate{
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
class User1 extends Thread{
	private Calculate calculate;
	
	public void setCalculate(Calculate calculate) {
		this.setName("User1");
		this.calculate = calculate;
	}
	public void run() {
		calculate.setMemory(100);
	}
}
class User2 extends Thread{
	private Calculate calculate;
	
	public void setCalculate(Calculate calculate) {
		this.setName("User2");
		this.calculate = calculate;
	}
	public void run() {
		calculate.setMemory(50);
	}
}