package Q.ch6;

import java.util.Scanner;

public class BankApplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		BankCustomers customers[] = new BankCustomers[99];
		// scan 받을 변수 초기화 과정
		int accountMoney = 0;
		String accountNumber = "";
		String accountName = "";
		

		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			String Choice = scan.nextLine();
			switch (Choice) {
			case "1":
				System.out.print("계좌번호: ");
				accountNumber = scan.nextLine();

				System.out.print("계좌주: ");
				accountName = scan.nextLine();

				System.out.print("초기금액: ");
				accountMoney = Integer.parseInt(scan.nextLine());
				
				BankCustomers customer = new BankCustomers(accountNumber,accountName,accountMoney);
				
				for(int i=0; i <customers.length; i++) {
					if(customers[i] == null) {
						customers[i] = customer;
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
					}
				}
				
				// 다 쓴 변수 초기화 과정
				accountMoney = 0;
				accountNumber = "";
				accountName = "";
				break;

			case "2":
				System.out.println("--------------");
				System.out.println("    계좌목록");
				System.out.println("--------------");
				for (int i = 0; i < customers.length; i++) {
					if(customers[i] != null) {
						System.out.println(customers[i].getAccountNumber() + "  " + customers[i].getCustomerName() + "  "+ customers[i].getCredit());
					}else{
						break;
					}
				}
				break;
					
			case "3":
				System.out.println("--------------");
				System.out.println("     예금");
				System.out.println("--------------");

				System.out.print("계좌번호: ");
				accountNumber = scan.nextLine();

				System.out.print("예금액: ");
				accountMoney = Integer.parseInt(scan.nextLine());
				
				for (int i = 0; i < customers.length; i++) {
					if (customers[i].getAccountNumber().equals(accountNumber)) {
						customers[i].setCredit(customers[i].getCredit() + accountMoney);
						break;
						}
				}
				
				System.out.println("예금이 완료 되었습니다.");

				accountMoney = 0;
				accountNumber = "";
				break;

			case "4":
				System.out.println("--------------");
				System.out.println("     출금");
				System.out.println("--------------");

				System.out.print("계좌번호: ");
				accountNumber = scan.nextLine();

				System.out.print("출금액: ");
				accountMoney = Integer.parseInt(scan.nextLine());
				
				for (int i = 0; i < customers.length; i++) {
					if (customers[i].getAccountNumber().equals(accountNumber)) {
						customers[i].setCredit(customers[i].getCredit() - accountMoney);
						break;}
				}
				
				System.out.println("출금이 완료 되었습니다.");
				
				accountMoney = 0;
				accountNumber = "";
				break;
				
			case "5":
				System.out.println("예금 시스템이 종료 됩니다.");
				System.exit(0);
			}
		}
	}
}
