package Exercise13;

class Otil{
	public static <T extends Number> int compare(T t1, T t2){
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1,v2);
	}
}
public class Ex05 {

	public static void main(String[] args) {
		int result = Otil.compare(10, 20);
		System.out.println(result);
		
		int result2 = Otil.compare(4.5, 3);
		System.out.println(result2);

	}

}
