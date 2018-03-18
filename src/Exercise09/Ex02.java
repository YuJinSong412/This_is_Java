package Exercise09;

public class Ex02 {
	
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
	    //localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
