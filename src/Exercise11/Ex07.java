package Exercise11;

import java.util.Arrays;

class Member4 implements Cloneable{
	public String name;
	public int age;
	public int [] scores;
	public Car car;
	
	public Member4(String name, int age, int [] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Member4 cloned = (Member4)super.clone();
		
		cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	public Member4 getMember() {
		Member4 cloned = null;
		try {
			cloned = (Member4)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
class Car{
	public String model;
	
	public Car(String model) {
		this.model = model;
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Member4 original = new Member4("홍길동",25,new int[] {90,90}, new Car("소나타"));
		
		Member4 cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model="그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: "+cloned.name);
		System.out.println("age: "+cloned.age);
		System.out.print("scores: {");
		for(int i=0;i<cloned.scores.length;i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: "+cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: "+original.name);
		System.out.println("age: "+original.age);
		System.out.print("scores: {");
		for(int i=0;i<original.scores.length;i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: "+original.car.model);
	}

}
