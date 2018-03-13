package Practice06;

class Printer2{
	
	static void println(int x) {
		System.out.println(x);
	}
	static void println(boolean s) {
		System.out.println(s);
	}
	static void println(double y) {
		System.out.println(y);
	}
	static void println(String q) {
		System.out.println(q);
	}
	
}
public class Prac17 {

	public static void main(String[] args) {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");

	}

}
