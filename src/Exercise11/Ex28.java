package Exercise11;

import java.util.StringTokenizer;

public class Ex28 {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		
		for(int i=0;i<countTokens;i++) {
			String count = st.nextToken();
			System.out.println(count);
		}

		System.out.println();
		
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
