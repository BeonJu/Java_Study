package Q.ch6;

import java.util.Scanner;



public class BankApplication {
	
	static public class Account{
		private int[][] Balance = new int[99][3];
	
		
		public void setBalance(int money, int index1, int index2 ) {
			this.Balance[index1][index2] += money;
		}
		
		public int[] getBalance(int index1, int index2) {
			int 
			return this.Balance[index1][index2];
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------------");
		System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------------");
		System.out.println("선택 > ");
		String Choice = scan.nextLine();
		
		
		
		
		
		
		

	}


}

