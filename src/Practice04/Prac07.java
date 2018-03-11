package Practice04;
import java.util.*;

public class Prac07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String inputString = scanner.nextLine();
			
			switch(inputString) {
			case "1":
				System.out.println("예금액>10000");
				break;
			case "2":
				System.out.println("출금액>2000");
				break;
			case "3":
				System.out.println("잔고>8000");
				break;
			default:
				System.out.println("프로그램 종료");
				System.exit(0);
				
			}
		}

	}

}
