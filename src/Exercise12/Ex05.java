package Exercise12;

class CalcThread extends Thread{
	CalcThread(String name){
		setName(name);
	}
	public void run() {
		for(int i=0;i<20000000;i++) {
			
		}
		System.out.println(getName());
	}
}
public class Ex05 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}

	}

}
