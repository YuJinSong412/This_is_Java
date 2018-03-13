package Exercise07;

class Parent3{
	String field1;
	
	void method1() {
		System.out.println("parent-method1");
	}
	void method2() {
		System.out.println("parent-method2");
	}
}
class Child3 extends Parent3{
	String field2;
	void method3(){
		System.out.println("child-method3");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Parent3 parent = new Child3();
		parent.method1();
		parent.method2();
		
		Child3 child = (Child3)parent;
		child.field2="yyy";
		child.method3();

	}

}
