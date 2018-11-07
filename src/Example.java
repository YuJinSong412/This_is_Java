import java.util.Calendar;

class Car{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model){
		this(model,"은색",360);
	}
	Car(String model, String color){
		this(model,color,260);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
public class Example {

	public static void main(String[] args) {
		Week week = null;
		Calendar now = Calendar.getInstance();
		int today = now.get(Calendar.DAY_OF_WEEK);
		
		switch(today) {
		case 1:
			week = Week.SUNDAY; break;
		case 2:
			week = Week.MONDAY; break;
		case 3:
			week = Week.TUESDAY; break;
		case 4:
			week = Week.WEDNESDAY; break;
		case 5:
			week = Week.THURSDAY; break;
		case 6:
			week = Week.FRIDAY; break;
		case 7:
			week = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일 :"+week);

	}

}
