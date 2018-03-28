package Practice12;

public class Prac04 {

	public static void main(String[] args) {
		Thread thread = new MovieThread3();
		thread.setDaemon(true);
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
}

class MovieThread3 extends Thread {
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
