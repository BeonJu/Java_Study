package HomeWorkCoffeeShop;

import java.util.ArrayList;
import java.util.Scanner;

import Amount.Amounts;
import Beverage.Americano;
import Beverage.AmericanoIce;
import Beverage.CafeLatte;
import Beverage.CafeLatteIce;
import BeverageList.AdeList;
import BeverageList.BeverageSizeChoice;
import BeverageList.CoffeeList;
import BeverageList.DecafeinList;
import BeverageList.InitialScreen;
import BeverageList.TeaList;
import CafeInterface.Coffees;
import Receipt.Receipt;

public class CoffeeShopKiosk {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		주문 대기열
		ArrayList<Coffees> queue = new ArrayList<Coffees>();
//		키보드 input으로 선택 값 받음
		Scanner scanner = new Scanner(System.in);
//		swicth case 초기화면 보여 주기 위하여 choice 변수 "주문"으로 초기화
		String choice = "주문";
//		이전 선택 시 이전 case로 돌오 가기 위하여 새로이 키보드 input 받기 전 값을 저장 해주는 임시 저장 변수
		String temporary = "";
		//강제 형 변환으로 확장
		Coffees Guest = new Coffees(); ;
		Guest = new Amounts();
		Amounts paymentCustomer = (Amounts)Guest;
		
		int saleCNT = 0;
		
		
		
		

		while (true) {
			switch (choice) {
			case "주문":
				InitialScreen.initialScreen();
				temporary = choice;
//			공백을 없애줌
				choice = scanner.nextLine().replace(" ", "");
				break;

			case "이전":
				choice = temporary;
				break;

			case "커피":
				CoffeeList.coffeeList();
				choice = scanner.nextLine().replace(" ", "");
				if (choice == "이전") {
					choice = temporary;
				}
				temporary = choice;
				break;

			case "디카페인커피":
				DecafeinList.decafeinCoffeeList();
				choice = scanner.nextLine().replace(" ", "");
				if (choice == "이전") {
					choice = temporary;
				}
				temporary = choice;
				break;

			case "에이드":
				AdeList.adeList();
				choice = scanner.nextLine().replace(" ", "");
				if (choice == "이전") {
					choice = temporary;
				}
				temporary = choice;
				break;

			case "티":
				TeaList.teaList();
				choice = scanner.nextLine().replace(" ", "");
				if (choice == "이전") {
					choice = temporary;
				}
				temporary = choice;
				break;

			case "아메리카노":
				//다형성과 확장을 이용한 Amounts paymentCustomer에 아메리카노 객체를 넣음
				paymentCustomer = new Americano();
				
				BeverageSizeChoice.sizeGuide(choice); 
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");
				paymentCustomer.setSize(choice);  // 사이즈가 들어있는 choice
				paymentCustomer.setMenuCost(paymentCustomer); 
				paymentCustomer.setAmountSum(paymentCustomer.getMenuCost()); //총액에 아메리카노 한잔 가격을 더함
				

				System.out.println("(" +paymentCustomer.getSize()+ ")" +paymentCustomer.getMenuName() + "가 주문 목록에 담겼습니다. 총합 금액:" + paymentCustomer.getAmountSum());
//				이번 결제에서 주문한 Item의 갯수
				//saleCNT가 영수증에 주문한 갯수로 사용되는데 추가 주문으로 다른 메뉴 주문시 구분은?
				//saleCNT를 배열로 만들어서 key: 메뉴명, count++ 로 만들어야 될까?
				saleCNT++;
				
				//추가 주문 때문에 이 구간에서 ArrayList input
				queue.add(paymentCustomer);
				
				System.out.println("추가 주문 하시겠습니까?  (Y/N)");
				choice = scanner.nextLine().replace(" ", "");
				if(choice.equals("Y")) {
					choice = "주문";
					break;
				}else if(choice.equals("N")) {
					System.out.println("주문 리스트");
					System.out.println("(" +paymentCustomer.getSize()+ ")" +paymentCustomer.getMenuName() + "가 " + saleCNT + "잔");
					System.out.println("결제 총 금액 :" + paymentCustomer.getPaymentAmount());
					System.out.println("결제 하시겠습니까? (Y/N)");
					choice = scanner.nextLine().replace(" ", "");
					if(choice.equals("Y")) {
						choice = "결제";
						break;
					}else if(choice.equals("N")) {
//						구매 리스트 및 paymentCustomer 객체 모든 값 초기화 또는 삭제 예정
						System.out.println("구매가 취소 되었습니다. 감사합니다.");
						//구매 취소 문구출력 후 3초 뒤에 초기 화면으로 이동
						Thread.sleep(3000);
						choice = "주문";
						break;
					}
				}
				
				
				
				break;
				
			case "결제":
				System.out.println("지불 금액을 입력해주세요.");
				System.out.println("지불 금액: ");
				choice = scanner.nextLine().replace(" ", "");
				int pay = Integer.parseInt(choice);
				if((pay - paymentCustomer.getAmountSum()) >=-1) {
					System.out.println("지불 금액이 부족 합니다.");
					choice = "결제";
					
				}else{
					System.out.println("결제 완료 되었습니다. 감사합니다. 영수증 출력 중입니다.");
				}
				Thread.sleep(3000);
				//영수증 제작 및 출력
				Receipt.receipt(paymentCustomer,saleCNT, pay);

				
//				결제가 완료 되어 주문한 Item의 갯수 초기화
				saleCNT = 0;
				System.out.println();
				
			case "아이스아메리카노":
				BeverageSizeChoice.sizeGuide(choice); 
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");


				Guest = new AmericanoIce(choice);

				queue.add(Guest);
				System.out.println("아이스아메리카노 주문이 완료 되었습니다. 주문번호: " + queue.indexOf(Guest.getOderNumber()));
				break;
				
			case "카페라떼":
				BeverageSizeChoice.sizeGuide(choice); 
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");


				Guest = new CafeLatte(choice);

				queue.add(Guest);
				System.out.println("카페라떼 주문이 완료 되었습니다. 주문번호: " + queue.indexOf(Guest.getOderNumber()));
				break;
				
			case "아이스카페라떼":
				BeverageSizeChoice.sizeGuide(choice); 
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");

				Guest = new CafeLatteIce(choice);

				queue.add(Guest);
				System.out.println("아이스카페라떼 주문이 완료 되었습니다. 주문번호: " + queue.indexOf(Guest.getOderNumber()));
				break;
				
				
			
				
				
				
				
			}

		}

	}

}
