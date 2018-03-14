package Practice08;

interface Soundable{
	String sound();
}
class Dog implements Soundable{
	public String sound() {
		return "야옹";
	}
}
class Cat implements Soundable{
	public String sound() {
		return "멍멍";
	}
}
public class Prac03 {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
