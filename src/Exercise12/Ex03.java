package Exercise12;

import java.awt.Toolkit;

class BeepThread extends Thread{
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}

	}

}
