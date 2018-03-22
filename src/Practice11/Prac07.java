package Practice11;

import java.util.StringTokenizer;

public class Prac07 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String [] result = str.split(",");
		for(String name : result) {
			System.out.println(name);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
