package Coffe;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
//		descprtion이라는 변수는 Beverage로부터 상속
		description = "하우스 블랜드";
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
//		첨가물 가격을 걱정할 필요 없이 그냥 에스프레소 가격인 1.99 달러를 리턴
		return 3.99;
	}

}
