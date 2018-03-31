package Exercise13;

class Util{
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int value = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();

	}

}
