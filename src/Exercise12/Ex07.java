package Exercise12;

public class Ex07 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User3 user3 = new User3();
		user3.setCalculator(calculator);
		user3.start();
		
		User4 user4 = new User4();
		user4.setCalculator(calculator);
		user4.start();
	}
}
class Calculator{
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
class User3 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User3");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setMemory(100);
	}
}
class User4 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User4");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setMemory(50);
	}
}
