package Exercise11;

class Member{
	String id;
	
	Member(String id){
		this.id = id;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
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
