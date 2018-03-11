package Practice04;

public class Prac05 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if((60-(4*i))%5==0) {
				System.out.print("("+i+",");
			}
			for(int j=1;j<=1;j++) {
				if((60-(4*i))%5==0) {
					System.out.println((60-4*i)/5+")");
				}
			}
		}

	}

}
