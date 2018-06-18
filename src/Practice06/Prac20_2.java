package Practice06;
import java.util.*;

class Account6{
	private String ano;
	private String owner;
	private int balance;
	
	Account6(String ano,String owner,int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Prac20_2 {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Account6[] accountArray = new Account6[100];
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			int num = scanner.nextInt();
			
			if(num==1) {
				createAccount();
			}else if(num==2) {
				accountList();
			}else if(num==3) {
				deposit();
			}else if(num==4) {
				withdraw();
			}else if(num==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		
		Account6 account = new Account6(ano,owner,balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			}
		}
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호:");
		String input = scanner.next();
		
		for(int i=0;i<accountArray.length;i++) {
			if(input.equals(accountArray[i].getAno())) {
				System.out.print("예금액:");
				int input2 = scanner.nextInt();
				accountArray[i].setBalance(accountArray[i].getBalance() + input2);
				break;
			}
		}
		System.out.println("결과:예금이 성공되었습니다.");
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("풀금");
		System.out.println("-------");
		System.out.print("계좌번호:");
		String input = scanner.next();
		
		for(int i=0;i<accountArray.length;i++) {
			if(input.equals(accountArray[i].getAno())) {
				System.out.print("출금액:");
				int input2 = scanner.nextInt();
				accountArray[i].setBalance(accountArray[i].getBalance() - input2);
				break;
			}
		}
		System.out.println("결과:출금이 성공되었습니다.");
	}

}


