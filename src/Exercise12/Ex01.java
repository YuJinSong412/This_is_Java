package Exercise12;

import java.awt.Toolkit;

class BeepTask implements Runnable{
	public void run() {
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolKit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}

	}

}
