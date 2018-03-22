package Practice11;

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+" : "+ name;
	}
}
public class Prac04 {

	public static void main(String[] args) {
		Member m = new Member("blue","이파란");
		System.out.println(m);

	}

}
