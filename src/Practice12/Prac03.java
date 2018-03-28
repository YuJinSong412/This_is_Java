package Practice12;

public class Prac03 {

	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}

		thread.interrupt();
	}
}
class MovieThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				break;
			}
		}
	}
}
