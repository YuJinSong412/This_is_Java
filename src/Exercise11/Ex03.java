package Exercise11;

class Member2{
	String id;
	
	Member2(String id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	public int hashCode() {
		return id.hashCode();
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Member2 obj1 = new Member2("blue");
		Member2 obj2 = new Member2("blue");
		Member2 obj3 = new Member2("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("동등합니다.");
		}else {
			System.out.println("동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("동등합니다.");
		}else {
			System.out.println("동등하지 않습니다.");
		}

	}

}
