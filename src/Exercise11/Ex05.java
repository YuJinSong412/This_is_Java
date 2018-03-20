package Exercise11;

class SmartPhone{
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	public String toString() {
		return company + "," + os;
	}
}
public class Ex05 {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		System.out.println(myPhone.toString());
		System.out.println(myPhone);

	}

}
