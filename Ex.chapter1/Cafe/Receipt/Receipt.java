package Receipt;

import Amount.Amounts;
import Constant.Cost;
import Constant.DateTime;

public class Receipt{

	
	public static void receipt(Amounts payment, int saleCNT, int pay) {
		System.out.println();
		System.out.println();
		System.out.println("	      영 	수 	 증		");
		System.out.println();
		System.out.println("(주)CoffeeBin				논현점");
		System.out.println("서울특별시 논현 이젠로12 1층		    ");
		System.out.println("[POS 0521-484]		 " + DateTime.currentDateTime);
		System.out.println("------------------------------------------------------");
		System.out.println("("+payment.getSize()+")"+ payment.getMenuName()+"    "+ payment.getMenuCost() + "    " + saleCNT +"    " +payment.getAmountSum());
		System.out.println("------------------------------------------------------");
		System.out.println("					과세금액 : " + (int)(payment.getMenuCost() * Cost.TaxableAmountRato));
		System.out.println("					부 과 세 : " + (int)(payment.getMenuCost() * Cost.VATRato));
		System.out.println("------------------------------------------------------");
		System.out.println("총액						" + payment.getAmountSum());
		System.out.println("합계						" + payment.getAmountSum());
		System.out.println("받은 돈						" + pay);
		System.out.println("거스름돈						" + (pay - payment.getAmountSum()));
		

		
		
		
		
		
		
	}
}
