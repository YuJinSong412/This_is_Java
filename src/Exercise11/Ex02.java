package Exercise11;

import java.util.HashMap;

class Key{
	int number;
	
	Key(int number){
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return number;
	}
}
public class Ex02 {

	public static void main(String[] args) {
		HashMap<Key,String> hashmap = new HashMap<Key,String>();
		
		hashmap.put(new Key(1),"홍길동");
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);

	}

}
