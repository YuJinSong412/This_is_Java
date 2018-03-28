package Exercise12;

class WorkObject{
	public synchronized void methodA() {
		System.out.println("ThreadA 의 methodA() 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB 의 methodB() 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
}
class ThreadAA extends Thread{
	private WorkObject workObject;
	
	ThreadAA(WorkObject workObject){
		this.workObject = workObject;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodA();
		}
	}
}
class ThreadBB extends Thread{
	private WorkObject workObject;
	
	ThreadBB(WorkObject workObject){
		this.workObject = workObject;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodB();
		}
	}
}
public class Ex12 {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadAA threadA = new ThreadAA(sharedObject);
		ThreadBB threadb = new ThreadBB(sharedObject);
		
		threadA.start();
		threadb.start();
	}

}
