package Q.ch6;

public class Account{
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	private int Balance = 0;
	
	public void setBalance(int money) {
		if(money < MIN_BALANCE && money > MAX_BALANCE ) {
			
		}
		else if(this.Balance >= MIN_BALANCE && this.Balance <= MAX_BALANCE) {
			this.Balance += money;
		}
	}
	
	public int getBalance() {
		int money = this.Balance;
		return money;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000

	}
}