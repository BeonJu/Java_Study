package Coffe;
//첨가물(condiment)을 나타내는 추상클래스(데코레이터 클래스)를 구현
public abstract class CondimentDecorator extends Beverage{ 
//	Beverage 객체가 들어가야 하므로 Beverage 클래스를 확장
	Beverage beverage;     //각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기서 지정. 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼 클래스 유형을 사용

	
	public abstract String getDescription();
	//모든 첨가물 데코레이터에 getDescription() 메소드를 새로 구현하도록 만들 계획. 그래서 추상 메소드로 선언.
}
