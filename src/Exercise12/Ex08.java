package Exercise12;

class StatePrintThread extends Thread{
	private Thread targetThread;
	
	StatePrintThread(Thread targetThread){
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //스레드 상태 얻기
			System.out.println("타겟 스레드 상태: "+state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
class TargetThread extends Thread{
	public void run() {
		for(long i=0;i<100000000;i++) {}
		
		try {
			Thread.sleep(1500);
		}catch(Exception e) {}
		
		for(long i=0;i<100000000;i++) {}
	}
}
public class Ex08 {

	public static void main(String[] args) {
		StatePrintThread stateprintthread = new StatePrintThread(new TargetThread());
		
		stateprintthread.start();

	}

}
