package Exercise11;

public class Ex18 {

	public static void main(String[] args) {
		Car2 car = new Car2();
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("Exercise11.Ex18_Class.Car2");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
class Car2{
	Car2(){}
}
