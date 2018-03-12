package Exercise06;

class Person{
	final String nation = "Korea";
	final String ssn;
	String name;
	
	Person(String ssn, String name){
		this.ssn=ssn;
		this.name = name;
	}
}
public class Ex11 {

	
	public static void main(String[] args) {
		Person p1 = new Person("1234455","송유진");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

	}

}
