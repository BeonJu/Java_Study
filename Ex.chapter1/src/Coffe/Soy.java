package Coffe;
//Mocha는 데코레이터라서 Condiment를 확장 (Condiment에서 Beverage를 확장)
public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		this.beverage = beverage;
//		 Mocha 인스턴스에는 Beverage의 레퍼런스가 들어있습니다. 
//		% 레퍼런스 변수는 메모리상에 생성된 인스턴스를 가리키는데 사용되는 변수이다.
//		  즉, 일반적인 데이터를 넣어두는 변두가 아니고 인스턴스를 가리키는 값(주소값)이다.
//	      => 1) 감싸고자 하는 음료를 저장하는 인스턴스 변수 
//	      => 2) 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자 
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 두유";
//		설명에 음료 이름(다크 로스트)만 들어있으면 안 되겠죠. 첨가되는 각 아이템도 설명에 추가합시다.
//	    => 예를 들면 '다크 로스트, 모카' 같은 식으로 말이죠. 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .50;
//	    => 음료 가격에 모카를 추가한 가격을 계산
//	    => 우선 장식하고 있는 객체에 가격을 구하는 작업을 위임해서 음료값을 구한 다음,
//	       거기에 모카 가격을 더하고, 그 합을 리턴 
	}
	
	

	
	
	
}
