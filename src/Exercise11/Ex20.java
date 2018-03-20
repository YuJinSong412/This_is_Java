package Exercise11;

//바이트 배열을 문자열로 변환
public class Ex20 {

	public static void main(String[] args) {
		byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);

	}

}
