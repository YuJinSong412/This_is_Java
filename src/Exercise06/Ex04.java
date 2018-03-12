package Exercise06;

class Car1{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car1(){
		
	}
	Car1(String model){
		this.model = model;
	}
	Car1(String model, String color){
		this.model =model;
		this.color=color;
	}
	Car1(String model, String color, int maxSpeed){
		this.model = model; this.color = color; this.maxSpeed = maxSpeed;
	}
}
public class Ex04 {

	public static void main(String[] args) {
		Car1 car1 = new Car1();
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		Car1 car2 = new Car1("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car1.model);
		System.out.println();
		
		Car1 car3 = new Car1("자가용","빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println();
		
		Car1 car4 = new Car1("자가용","검정",200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);

	}

}
