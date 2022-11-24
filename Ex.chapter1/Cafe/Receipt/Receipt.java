package Receipt;

import Constant.DateTime;

public class Receipt{

	
	public static void receipt(String size, String beverage, int cost, int some, int condiAddCost,int credit) {
		System.out.println("	      영 	수 	 증		");
		System.out.println();
		System.out.println("(주)CoffeeBin				논현점");
		System.out.println("서울특별시 논현 이젠로12 1층		    ");
		System.out.println("[POS 0521-484]		 " + DateTime.currentDateTime);
		System.out.println("------------------------------------------------------");
		System.out.println("("+size+")"+ beverage +"    "+ cost + "    " + some +"    " +condiAddCost);
		System.out.println("------------------------------------------------------");
		System.out.println("						과세금액 : " + cost * 0.9);
		System.out.println("						부 과 세 : " + cost * 0.1);
		System.out.println("------------------------------------------------------");
		System.out.println("총액							" + condiAddCost);
		System.out.println("합계							" + condiAddCost);
		System.out.println("받은 돈						" + credit);
		System.out.println("거스름돈						" + (credit - condiAddCost));
		

		
		
		
		
		
		
	}
}
