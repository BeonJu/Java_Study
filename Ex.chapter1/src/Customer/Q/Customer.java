package Customer.Q;

public class Customer {

//	필드
//	protected 같은 패키지 내 클래스만 사용
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bunusPoint; //보너스 포인트 적립
	double bunusRatio;//보너스 포인트 적립 비율
	

//	생성자
//	Customer는 기본 등급이 Silver이다.
	public Customer() {
		initcustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initcustomer();
	}
	
	//메소드
//	고객 등급 초기화, Customer는 기본 등급이 Silver이다.
	private void initcustomer() {
		this.customerGrade = "SILVER";
		//실버의 보너스 포인트 적립 비율
		this.bunusRatio = 0.01; 
	}
	
	public int calcPrice(int price) {  // 지불 금액
//		지불 금액을 인자값으로 받고 받은 지불 금액 * 보너스 포인트 적입 비율로 계산을 하여 보너스 포인트에 적립 한뒤 지불 금액을 리턴한다.
		this.bunusPoint += (price * this.bunusRatio); 
//		지불 금액 리턴이 있는 이유는 골드와 VIP 고객의 지불금액에서 할인률이 적용 된 지불금액을 반환 하기 위한 오버라이딩 때문이다. 
		return price;   
	}
	
	public String  showCustomerInfo() {
		return this.customerName + "님의 등급: " + this.customerGrade + ", 보너스 포인트: " + this.bunusPoint + "점";
	}
	
	
	//get,set 메소드
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
