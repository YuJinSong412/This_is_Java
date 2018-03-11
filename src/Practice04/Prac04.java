package Practice04;

public class Prac04 {

	public static void main(String[] args) {
		
		int result =0;
		while(true) {
			int left = (int)(Math.random()*6)+1;
			int right = (int)(Math.random()*6)+1;
			System.out.println("("+left+","+right+")");
			
			result = left + right;
			if(result == 5)
				break;
		}

	}

}
