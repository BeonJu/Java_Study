package Customer.Q;

public class GoldCustomer extends Customer {
//	필드
	double saleRatio;
	
//	생성자
	
	public GoldCustomer(int customerID, String customerName) {
//		Customer의 Customer(customerID, customerName) 생성자가 호출 및 런 된다.
		super(customerID, customerName);
//		Customer(customerID, customerName)에는 initcustomer()로 인한 실버 등급 초기값 지정이 있기 때문에 customerGrade, bunusRatio를 Gold기준으로 값을 넣어준다.
		super.customerGrade = "GOLD";
		super.bunusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
//		지불 금액을 인자값으로 받고 받은 지불 금액 * 보너스 포인트 적입 비율로 계산
		this.bunusPoint += (price * this.bunusRatio); 
//		지불금액에서 할인률이 적용 된 지불금액을 반환
		return price - (int)(price * this.saleRatio);
	}
	
	

}
