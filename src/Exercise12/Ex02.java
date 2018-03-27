package Exercise12;

import java.awt.Toolkit;

public class Ex02 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {
					Thread.sleep(500);
					}catch(Exception e) {}
				}
			}
		});

		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
/*
 Thread thread = new Thread(()->{
 Toolkit toolkit = Toolkit.getDefaultToolkit();
 for(int i=0;i<5;i++){
 toolkit.beep();
 try{
 Thread.sleep(500);
 }catch(Exception e){}
 );
 */
