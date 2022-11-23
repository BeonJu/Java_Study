package Exception;


public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	
	}
//									에러 발생 시 던질 곳
	public void withdraw(int money) throws InsuffeException {
//		잔고보다 큰 금액을 출금시켜 달라고 하면 예외처리
		if(this.balance < money) {
//			예외 처리 생성자
			throw new InsuffeException("잔액이 부족 합니다." + (money - this.balance) + "원이 부족 합니다.");
		}else if(this.balance >= money) {
			this.balance -= money;
			System.out.println(money + "원이 출금 되었습니다.");
		}
	}
	
	
}
