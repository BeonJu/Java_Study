package Q.ch6;

public class BankCustomers {
	// 계좌번호
	// 계좌주
	// 입금액
	private int Credit;
	private String AccountNumber;
	private String CustomerName;

	public BankCustomers(String accountNumber, String customerName, int credit) {
		this.AccountNumber = accountNumber;
		this.CustomerName = customerName;
		this.Credit = credit;
	}

//	public BankCustomers(BankCustomers Customer) {
//		this(Customer.AccountNumber, Customer.CustomerName, Customer.Credit);
//	}

	public int getCredit() {
		return this.Credit;
	}

	public void setCredit(int credit) {
		this.Credit = credit;
	}

	public String getAccountNumber() {
		return this.AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public String getCustomerName() {
		return this.CustomerName;
	}

	public void setCustomerName(String accountName) {
		this.CustomerName = accountName;
	}

}
