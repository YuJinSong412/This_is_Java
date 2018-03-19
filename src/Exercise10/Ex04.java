package Exercise10;

class BalanceInsufficientException extends Exception{
	BalanceInsufficientException(){}
	BalanceInsufficientException(String message){
		super(message);
	}
}
public class Ex04 {

	private long balance;
	
	public Ex04() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람");
		}
		balance -=money;
	}
	public static void main(String[] args) {
		Ex04 account = new Ex04();
		
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}
