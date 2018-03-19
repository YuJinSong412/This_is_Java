package Exercise09;

interface Calculater{
	public int sum();
}
class Cal{
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		Calculater calc = new Calculater() {
			public int sum() {
				int result = field + arg1 + arg2 +var1+var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
public class Ex08 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.method(0, 0);

	}

}
