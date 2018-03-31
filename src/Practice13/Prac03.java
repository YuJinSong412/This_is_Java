package Practice13;

class Util{
	private String name;
	Util(String name){
		this.name = name;
	}
	public static <T,V> Integer getValue(Pair<T,V> p1, String name) {
		boolean keyValue = p1.getT().equals(name);
		if(keyValue == true) {
			int r = (int) p1.getV();
			return r;
		}else {
			return null;
		}
	}
}
class Pair<T,V>{
	private T t;
	private V v;
	
	Pair(T t, V v){
		this.t = t;
		this.v = v;
	}
	public T getT() {return t;}
	public V getV() { return v;}
	
}
class ChildPair<T,V> extends Pair<T,V>{
	ChildPair(T t , V v){
		super(t,v);
	}
}
public class Prac03 {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println(age);
		
		ChildPair<String,Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair,"홍삼순");
		System.out.println(childAge);

	}

}
