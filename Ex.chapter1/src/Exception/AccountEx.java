package Exception;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.deposit(10000);
		System.out.println(acc.getBalance());
	
		try {
			for(int i=0; i<2; i++) {
				acc.withdraw(10000 + i);
			}
			
		} catch (InsuffeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
