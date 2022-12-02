package Synchronized;

public class SyncEx {


	
	public static void main(String[] args) {
 
		Calc calc = new Calc();
		
		UserThread1 user1 = new UserThread1();
		user1.setCalc(calc);
		user1.start();
		
		
		UserThread2 user2 = new UserThread2();
		user2.setCalc(calc);
		user2.start();
		

	}

}
