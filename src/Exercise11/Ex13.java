package Exercise11;

import java.util.Objects;

public class Ex13 {

	public static void main(String[] args) {
		String str = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));

	}

}
