package Exercise08;

interface Vehicle{
	public void run();
}
class Driver {
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}
}
class Bus implements Vehicle{
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
class Taxi implements Vehicle{
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);

	}

}
