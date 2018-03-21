package Exercise11;

public class Ex33 {

	public static void main(String[] args) {
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("200");
		Integer ob3 = Integer.valueOf("300");
		
		int value1 = ob1.intValue();
		int value2 = ob2.intValue();
		int value3 = ob3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
