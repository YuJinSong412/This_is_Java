package Exercise06;

class Television{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-"+model;
	}
}
public class Ex08 {

	public static void main(String[] args) {
		System.out.println(Television.info);

	}

}
