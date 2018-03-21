package Exercise11;

import java.text.MessageFormat;

public class Ex37 {

	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID:{0}\n 회원 이름: {1}\n 회원 전화: {2}";
		String result = MessageFormat.format(text, id,name,tel);
		System.out.println(result);
		System.out.println();

		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"java","신용권","010-123-1231"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}

}
