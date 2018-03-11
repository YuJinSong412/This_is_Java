package Practice04;

public class Prac05 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=1;j++) {
				if((60-(4*i))%5==0) {
					System.out.println("("+i+","+(60-4*i)/5+")");
				}
			}
		}

	}

}
