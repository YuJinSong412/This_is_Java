package Exercise07;

abstract class Animal{
	String kind;
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	abstract void sound();
}
class Dog extends Animal{
	Dog(){
		this.kind = "포유류";
	}
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	Cat(){
		this.kind = "포유류";
	}
	void sound() {
		System.out.println("야옹");
	}
}
public class Ex08 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal animal) {
		if(animal instanceof Dog) {
			animal.sound();
		}
		if(animal instanceof Cat) {
			animal.sound();
		}
	}

}
