package Practice10;

class NotExistIDException extends Exception{
	NotExistIDException(){}
	NotExistIDException(String message){
		super(message);
	}
}
class WrongPasswordException extends Exception{
	WrongPasswordException(){}
	WrongPasswordException(String message){
		super(message);
	}
}
public class Prac07 {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws Exception{
		if(!id.equals("blue")) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			System.out.println("패스워드가 틀립니다.");
		}
	}

}
