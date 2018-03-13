package Practice07;

class Parent{
	String nation;
	
	Parent(){
		this("대한민국");
		System.out.println("Parent() call");
	}

	Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
class Child extends Parent{
	private String name;
	
	Child(){
		this("홍길동");
		System.out.println("Child() call");
	}
	Child(String name){
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
public class Prac06 {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
