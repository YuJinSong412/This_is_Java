package Practice06;

class Printer{
	
	void println(int x) {
		System.out.println(x);
	}
	void println(boolean s) {
		System.out.println(s);
	}
	void println(double y) {
		System.out.println(y);
	}
	void println(String q) {
		System.out.println(q);
	}
	
}
public class Prac16 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

	}

}
