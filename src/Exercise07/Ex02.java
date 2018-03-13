package Exercise07;

class Parent{
	void method1() {
		System.out.println("parent-method1()");
	}
	void method2() {
		System.out.println("parent-method2");
	}
}
class Child extends Parent{
	void method2() {
		System.out.println("child-method2");
	}
	void method3() {
		System.out.println("child-method3");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Parent parent = new Child();
		//Child child = new Child();
		//Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3();

	}

}
