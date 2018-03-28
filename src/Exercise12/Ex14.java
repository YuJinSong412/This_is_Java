package Exercise12;

class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
public class Ex14 {

	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true);
		auto.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");

	}

}
