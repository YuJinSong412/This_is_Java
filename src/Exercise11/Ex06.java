package Exercise11;

class Member3 implements Cloneable{
	public String id;
	public String password;
	public String name;
	public int age;
	public boolean adult;
	
	public Member3(String id,String name,String password,int age,boolean adult) {
		this.id =id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	public Member3 getMember() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Member3 original = new Member3("blue","홍길동","12345",25,true);
		
		Member3 cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("{복제 객체의 필드값}");
		System.out.println("id: "+cloned.id);
		System.out.println("id: "+cloned.name);
		System.out.println("id: "+cloned.password);
		System.out.println("id: "+cloned.age);
		System.out.println("id: "+cloned.adult);

		System.out.println();
		
		System.out.println("{원본 객체의 필드값}");
		System.out.println("id: "+original.id);
		System.out.println("id: "+original.name);
		System.out.println("id: "+original.password);
		System.out.println("id: "+original.age);
		System.out.println("id: "+original.adult);
	}

}
