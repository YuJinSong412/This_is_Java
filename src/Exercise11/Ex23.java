package Exercise11;

public class Ex23 {

	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		byte [] bytes = str.getBytes();
		System.out.println("bytes.length: "+bytes.length);
		String str1 = new String(bytes);
		System.out.println("bytes->String: "+str1);

	}

}
