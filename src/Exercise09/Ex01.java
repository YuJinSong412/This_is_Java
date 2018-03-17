package Exercise09;

class A{
	A(){
		System.out.println("A 객체가 생성됨");
	}
	class B{
		B(){
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		//static int field2;
		void method1() {}
		//static method2(){}
	}
	
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
public class Ex01 {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();

	}

}
