package Coffe;

public class MyCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		아무것도 넣지 않은 에스프레소를 주문하고 설명과 가격 출력
		Beverage beverage = new Espresso(); 
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		//다크 로스트 객체 생성
		Beverage beverage2 = new DarkRoast();
		// 다크 로스트 레퍼런스 변수를 모카 객체로 감쌈
		beverage2  = new Mocha(beverage2);
		// 모카 추가
		beverage2  = new Mocha(beverage2);
		// 휘핑크림 추가
		beverage2  = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + (float)beverage2.cost());
		
	}

}
