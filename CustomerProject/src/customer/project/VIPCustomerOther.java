package customer.project;


public class VIPCustomerOther extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomerOther(int customerID, String customerName, int agentID){
		super(customerID, customerName);
	
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += (price * bonusRatio); //보너스 포인트 계산
		return price -(int)(price* saleRatio);
		}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + ", 담당 상담원 번호:" + this.agentID;
	}
	public int getAgentID() {
		return this.agentID;
	}
}
