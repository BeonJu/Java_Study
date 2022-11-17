package Q.ch6;

import java.util.Scanner;

public class BankApplication {

//		계좌생성
		public static void setBalanceCreate(int index, String accountNumber, String accountName, int money) {

//			계좌번호 생성
			Accounts.setAccountNumber(index, accountNumber);

//			계좌주 생성
			Accounts.setAccountName(index, accountName);

//			초기 입금액 생성
			Accounts.setAccount(index,money);

			System.out.println("결과: 계좌가 생성되었습니다.");
		}

		// 계좌목록 호출
		public static void getBalanceList() {
			System.out.println("--------------");
			System.out.println("    계좌목록");
			System.out.println("--------------");
			for (int i = 0; i < Accounts.getAccountLenght(); i++) {
				if (Accounts.getAccount(i) != 0 && Accounts.getAccountNumber(i) != null && Accounts.getAccountName(i) != null) {
					System.out.println(Accounts.getAccount(i) + "  " + Accounts.getAccountNumber(i) + "  " + Accounts.getAccountName(i));
				} else {
					break;
				}
			}
		} // 계좌목록 호출 끝

//		예금 시스템
		public static void inputAccount(String accountNumber, int money) {
			for (int i = 0; i < Accounts.getAccountLenght(); i++) {
//				static String 값 비교를 하기 위해서 == 이걸 쓰면 주소값으로 보기 때문에 equals를 써줌으로 String 값 비교를 한다.
				if (Accounts.getAccountNumber(i).equals(accountNumber)) {
					Accounts.calAddAccount(i, money);
//					System.out.println("계좌번호: " + Accounts.getAccountNumber(i));
//					System.out.println("예금액: " + money);
					System.out.println("계좌잔액 " + Accounts.getAccount(i));
					System.out.println("예금이 완료 되었습니다.");
					break;
				}
			}
		}

//		출금 시스템
		public static void outAccount(String accountNumber, int money) {
			for (int i = 0; i < Accounts.getAccountLenght(); i++) {
				if (Accounts.getAccountNumber(i).equals(accountNumber)) {
					Accounts.calMinusAccount(i, money);
//					System.out.println("계좌번호: " + Accounts.getAccountNumber(i));
//					System.out.println("예금액: " + money);
					System.out.println("계좌잔액 " + Accounts.getAccount(i));
					System.out.println("출금이 완료 되었습니다.");
					break;
				}
			}
		}

//		빈 배열 찾기
		public static boolean ArrayEmpty(int i) {
			if (Accounts.getAccount(i) != 0 && Accounts.getAccountNumber(i) != null && Accounts.getAccountName(i) != null) {
				return false;
			} else {
				return true;
			}
		}

//		종료 시퀀스
		public static void exit() {
			System.out.println("예금 시스템이 종료 됩니다.");
			System.exit(0);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int accountMoney = 0;
		String accountNumber = "";
		String accountName = "";
		int index = 0;
		while(true) {
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

			setBalanceCreate(index, accountNumber, accountName, accountMoney);
			// 배열 인덱스 값 증가

			index++;
			accountMoney = 0;
			accountNumber = "";
			accountName = "";
			break;
		case "2":
			getBalanceList();
			break;
		case "3":
			System.out.println("--------------");
			System.out.println("     예금");
			System.out.println("--------------");

			System.out.print("계좌번호: ");
			accountNumber = scan.nextLine();

			System.out.print("예금액: ");
			accountMoney = Integer.parseInt(scan.nextLine());

			inputAccount(accountNumber, accountMoney);
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

			outAccount(accountNumber, accountMoney);
			accountMoney = 0;
			accountNumber = "";
			break;
		case "5":
			exit();
		}
		}

	}

	}
