import java.util.*;

public class ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		int []scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int select = scanner.nextInt();
			if(select==1) {
				System.out.print("학생수>");
				student = scanner.nextInt();
			}
			else if(select==2) {
				scores = new int[student];
				
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]: ");
					scores[i] = scanner.nextInt();
				}
			}
			else if(select==3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"] : "+scores[i]);
				}
			}
			else if(select==4) {
				int max = 0; int sum = 0;
				for(int i=0;i<scores.length;i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+(double)sum/scores.length);
			}
			else if(select==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
