package Practice09;

class Car{
	class Tire{}
	static class Engine{}
}
public class Prac04 {

	public static void main(String[] args) {
		Car car = new Car();
		
		Car.Tire tire = car.new Tire();
		Car.Engine engine = new Car.Engine();
		

	}

}
