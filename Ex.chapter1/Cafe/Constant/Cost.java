package Constant;

public class Cost {

	//사이즈 상수
	public static final String S = "S";
	public static final String M = "M";
	public static final String L = "L";
	//커피, 음료 기본 값(S 사이즈)
	public static final int CoffeeCost = 2000;
	public static final int AdeCost = 2800;
	public static final int TeaCost = 2500;
	//커피, 음료 사이즈 별 가격 변동
	//커피 와 디카페인 커피는 동일 가격
	//Hot 음료와 Ice 음료의 가격은 동일
	public static final int AmericanoSCost = CoffeeCost;
	public static final int AmericanoMCost = CoffeeCost + 500;
	public static final int AmericanoLCost = CoffeeCost + 1000;
	
	public static final int CafeLatterSCost = CoffeeCost + 500;
	public static final int CafeLatterMCost = CoffeeCost + 1000;
	public static final int CafeLatterLCost = CoffeeCost + 1500;
	
	public static final int CafeMochaSCost = CoffeeCost + 800;
	public static final int CafeMochaMCost = CoffeeCost + 1300;
	public static final int CafeMochaLCost = CoffeeCost + 1800;
	
	
}
