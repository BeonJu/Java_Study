package Customer.Q;

public class VIPCustomer extends Customer {
//	필드
	private int agentID;
	double saleRatio;
	
//	생성자
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
//		Customer의 Customer(customerID, customerName) 생성자가 호출 및 런 된다.
		super(customerID, customerName);
//		Customer(customerID, customerName)에는 initcustomer()로 인한 실버 등급 초기값 지정이 있기 때문에 customerGrade, bunusRatio를 VIP기준으로 값을 넣어준다.
		super.customerGrade = "VIP";
		super.bunusRatio = 0.05;
		this.saleRatio = 0.1;
//		Customer Counseler 지정 ID 
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
//		지불 금액을 인자값으로 받고 받은 지불 금액 * 보너스 포인트 적입 비율로 계산
		this.bunusPoint += (price * this.bunusRatio); 
//		지불금액에서 할인률이 적용 된 지불금액을 반환
		return price - (int)(price * this.saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		
//		public String  showCustomerInfo() 
//			return this.customerName + "님의 등급: " + this.customerGrade + ", 보너스 포인트: " + this.bunusPoint + "점";
//		위 showCustomerInfo() return 값에 담당 상담원 번호: " + this.agentID를 붙여준다.
		return super.showCustomerInfo() + ", 담당 상담원 번호: " + this.agentID;
	}
	
	public int getAgentID() {
		return this.agentID;
	}
	
	

}
