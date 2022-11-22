package Coffe;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
//		descprtion이라는 변수는 Beverage로부터 상속
		description = "다크 로스트";
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
//		첨가물 가격을 걱정할 필요 없이 그냥 에스프레소 가격인 1.99 달러를 리턴
		return 2.99;
	}

}
