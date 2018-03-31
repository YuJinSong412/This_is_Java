package Practice13;

class Container2<T,M>{
	private T t;
	private M m;
	
	public void set(T t,M m) { this.t=t; this.m=m;}
	
	public T getKey() { return t;}
	public M getValue() { return m;}
}
public class Prac02 {

	public static void main(String[] args) {
		Container2<String,String> container1 = new Container2<String,String>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container2<String,Integer> container2 = new Container2<String,Integer>();
		container2.set("홍길동",35);
		String name2 = container2.getKey();
		int age = container2.getValue();

	}

}
