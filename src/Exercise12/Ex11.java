package Exercise12;

class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
	}
}
public class Ex11 {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); //sumThread가 종료할 때까지 메인 스레드를 일시 정지시킴
		}catch(InterruptedException e) {}
		
		System.out.println("1~100 합: "+sumThread.getSum());

	}

}
