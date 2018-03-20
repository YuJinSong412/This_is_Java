package Exercise11;

import java.util.Objects;

public class Ex12 {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2,"이름이 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2,()->"이름이 없다니까요");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
