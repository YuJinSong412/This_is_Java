package Exercise05;

public class Ex03 {

	public static void main(String[] args) {
		int[] score;
		score = new int[] {83,90,87};
		int sum1 =0;
		for(int i=0;i<3;i++) {
			sum1 += score[i];
		}
		System.out.println("총합: "+sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합: "+sum2);
		System.out.println();
	}
		
		public static int add(int[] scores) {
			int sum=0;
			for(int i=0;i<3;i++) {
				sum += scores[i];
			}
			return sum;
		}
	}


