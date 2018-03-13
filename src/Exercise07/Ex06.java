package Exercise07;

class Parent4{
	
}
class Child4 extends Parent4{
	
}
public class Ex06 {

	public static void method1(Parent4 parent) {
		if(parent instanceof Child4) {
			Child4 child = (Child4)parent;
			System.out.println("method1-child로 변환 성공");
		}else {
			System.out.println("변환되지 않음.");
		}
	}
	public static void method2(Parent4 parent) {
		Child4 child = (Child4)parent;
		System.out.println("method2-child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent4 parentA = new Child4();
		method1(parentA);
		method2(parentA);
		
		Parent4 parentB = new Parent4();
		method1(parentB);
		method2(parentB);

	}

}
