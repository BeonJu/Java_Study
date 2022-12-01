package HomeWorkCoffeeShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Amount.Amounts;
import Beverage.Americano;
import Beverage.AmericanoIce;
import Beverage.CafeLatte;
import Beverage.CafeLatteIce;

import BeverageList.BeverageSizeChoice;
import BeverageList.CoffeeList;

import BeverageList.InitialScreen;

import CafeInterface.Coffees;
import Ch07.Child;
import Receipt.Receipt;

public class CoffeeShopKiosk {

	// InterruptedException, Treed.sleep 때문에 예외처리 적용
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		결제 전 주문 리스트
		ArrayList<Coffees> orderList = new ArrayList<Coffees>();

		// 강제 형 변환으로 확장
		Coffees beverageList = new Coffees();
		
//		Guest = new Amounts();
//		Amounts paymentCustomer = (Amounts)Guest;
		Amounts customerAmount = new Amounts();

//		키보드 input으로 선택 값 받음
		Scanner scanner = new Scanner(System.in);

//		swicth case 초기화면 보여 주기 위하여 choice 변수 "주문"으로 초기화
		String choice = "주문";

//		이전 선택 시 이전 case로 돌오 가기 위하여 새로이 키보드 input 받기 전 값을 저장 해주는 임시 저장 변수
		String temporary = "";

		while (true) {
			switch (choice) {
			case "주문":
				InitialScreen.initialScreen();
				temporary = choice;
//			공백을 없애줌
				choice = scanner.nextLine().replace(" ", "");
				if (choice.equals("커피")) {
					break;
				} else {
					System.out.println("잘못 된 메뉴 선택 입니다.");
					Thread.sleep(1000);
					choice = "주문";
					break;
				}

			case "이전":
				choice = temporary;
				break;

			case "커피":
				temporary = choice;
				CoffeeList.coffeeList();
				choice = scanner.nextLine().replace(" ", "");
				if (choice.equals("아메리카노") || choice.equals("아이스아메리카노")) {
					break;
				} else {
					System.out.println("잘못 된 메뉴 선택 입니다.");
					Thread.sleep(1000);
					choice = "커피";
					break;
				}

			case "아메리카노":
				temporary = choice;
				// 다형성과 확장을 이용한 Amounts paymentCustomer에 아메리카노 객체를 넣음
				beverageList = new Americano();

				// 사이즈 선택 메소드
				BeverageSizeChoice.sizeGuide(choice);
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");

				beverageList.setSize(choice); // 사이즈 선택 후 사이즈 셋
				beverageList.setMenuCost(beverageList); // 사이즈 비교 후 Cost 셋
				customerAmount.setAmountSum(beverageList.getMenuCost()); // 총액에 누적 합산, 커피 추가 옵션 때문에 만듬
				beverageList.setOderCNT(1);
				// ArrayList<Coffees> 배열에 추가
				orderList.add(beverageList);
				System.out.println("(" + beverageList.getSize() + ")" + beverageList.getMenuName() + "가 주문 목록에 담겼습니다.");
				choice = "추가";
				break;

			case "아이스아메리카노":
				temporary = choice;
				// 다형성과 확장을 이용한 Amounts paymentCustomer에 아메리카노 객체를 넣음
				beverageList = new AmericanoIce();

				// 사이즈 선택 메소드
				BeverageSizeChoice.sizeGuide(choice);
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");

				beverageList.setSize(choice); // 사이즈 선택 후 사이즈 셋
				beverageList.setMenuCost(beverageList); // 사이즈 비교 후 Cost 셋
				customerAmount.setAmountSum(beverageList.getMenuCost()); // 총액에 누적 합산, 커피 추가 옵션 때문에 만듬
				beverageList.setOderCNT(1);
				orderList.add(beverageList);
				System.out.println("(" + beverageList.getSize() + ")" + beverageList.getMenuName() + "가 주문 목록에 담겼습니다.");
				choice = "추가";
				break;

			case "추가":
				System.out.println("추가 주문 하시겠습니까?  (Y/N)");
				choice = scanner.nextLine().replace(" ", "");
				if (choice.equals("Y")) {
					choice = "주문";
					break;
				} else if (choice.equals("N")) {
					System.out.println("주문 리스트");
					// i가 orderList의 총 배열 크기 만큼(.size()) 반복문 실행
					for (int i = 0; i < orderList.size(); i++) {
						System.out.println("(" + orderList.get(i).getSize() + ")" + orderList.get(i).getMenuName()
								+ "가 " + orderList.get(i).getOderCNT() + "잔");
					}

					System.out.println("결제 총 금액 :" + customerAmount.getAmountSum());
					System.out.println("결제 하시겠습니까? (Y/N)");
					choice = scanner.nextLine().replace(" ", "");
					if (choice.equals("Y")) {
						choice = "결제";
						break;
					} else if (choice.equals("N")) {
//						구매 리스트 및 paymentCustomer 객체 모든 값 초기화 또는 삭제 예정
						System.out.println("구매가 취소 되었습니다. 감사합니다.");
						// 구매 취소 문구출력 후 3초 뒤에 초기 화면으로 이동
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
				if ((pay - customerAmount.getAmountSum()) <= -1) {
					System.out.println("지불 금액이 부족 합니다.");
					choice = "결제";
					break;
				} else {
					System.out.println("결제 완료 되었습니다. 감사합니다. 영수증 출력 중입니다.");
				}
				Thread.sleep(3000);
				// 영수증 제작 및 출력
				Receipt.receipt(customerAmount, orderList, pay);

				Thread.sleep(3000);
				choice = "주문";
				break;

			}

		}

	}

}
