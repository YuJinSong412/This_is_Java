package Practice05;
import java.util.*;

public class Prac09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		
		while(run) {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("--------------------------------------------");
		System.out.print("선택>");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			System.out.print("학생수>");
			studentNum = scanner.nextInt();
			scores = new int[studentNum];
			continue;
		}else if(selectNo == 2) {
			for(int i=0;i<scores.length;i++) {
				System.out.print("score["+i+"]"+">");
				scores[i] = scanner.nextInt();
			}
			continue;
		}else if(selectNo == 3) {
			for(int i=0;i<scores.length;i++) {
				System.out.println("score{"+i+"]: "+scores[i]);
			}
			continue;
		}else if(selectNo == 4) {
			int max = 0; int sum=0;
			for(int i=0;i<scores.length;i++) {
				if(max<scores[i]) {
					max = scores[i];
				}
			}for(int i=0;i<scores.length;i++) {
				sum += scores[i];
			}
			System.out.println("최고점수: "+max);
			System.out.println("평균 점수: "+(double)sum/scores.length);
			continue;
		}else if(selectNo == 5) {
			run = false;
		}
		System.out.println("프로그램 종료");
		}
	}

}
