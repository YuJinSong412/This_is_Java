package Exercise12;

public class Ex10 {

	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();

		threadC.start();
		threadD.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadC.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadC.work = true;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadC.stop = true;
		threadD.stop = true;
	}
}

class ThreadC extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("THreadC 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadC 종료");
	}
}

class ThreadD extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadD 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadD 종료");
	}
}
