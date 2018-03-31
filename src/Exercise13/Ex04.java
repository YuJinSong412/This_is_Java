package Exercise13;

class Util2{
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void setKey(K key) { this.key = key;}
	public void setValue(V value) {this.value = value;}
	public K getKey() { return key;	}
	public V getValue() {return value;}
}
public class Ex04 {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1,"사과");
		Pair<Integer, String> p2 = new Pair<>(1,"사과");
		boolean result1 = Util2.<Integer,String>compare(p1,p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		Pair<String,String> p3 = new Pair<>("user1","홍길동");
		Pair<String,String> p4 = new Pair<>("user1","홍길동");
		boolean result2 = Util2.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}

	}

}
