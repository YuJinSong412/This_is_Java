package Exercise12;

import java.awt.Toolkit;

public class Ex09 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
		}

	}

}
