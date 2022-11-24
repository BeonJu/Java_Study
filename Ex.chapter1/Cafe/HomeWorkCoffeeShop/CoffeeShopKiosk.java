package HomeWorkCoffeeShop;

import java.util.ArrayList;
import java.util.Scanner;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		주문 대기열
		ArrayList<Coffees> queue = new ArrayList<Coffees>();
//		키보드 input으로 선택 값 받음
		Scanner scanner = new Scanner(System.in);
//		swicth case 초기화면 보여 주기 위하여 choice 변수 "주문"으로 초기화
		String choice = "주문";
//		이전 선택 시 이전 case로 돌오 가기 위하여 새로이 키보드 input 받기 전 값을 저장 해주는 임시 저장 변수
		String temporary = "";
//		다형성을 위한 인터페이스를 상속 받은 클래스
		Coffees Guest;

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
				BeverageSizeChoice.sizeGuide(choice); 
				System.out.println("선택 : ");
				choice = scanner.nextLine().replace(" ", "");


				Guest = new Americano(choice);

				queue.add(Guest);
				System.out.println("아메리카노 주문이 완료 되었습니다. 주문번호: " + queue.indexOf(Guest.getOderNumber()));
				Receipt.receipt(Guest.getSize(),Guest.getMenuName(),Guest.getMenuCost() , 1, Guest.getMenuCost(), Guest.getMenuCost());
				break;
				
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
