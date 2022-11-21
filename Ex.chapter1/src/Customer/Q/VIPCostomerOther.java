package Customer.Q;

public class VIPCostomerOther extends Customer {
	
//	필드
	private int agentID;
	double saleRatio;
	
//	생성자
	
	public VIPCostomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
//		VIPCostomer와 동일하며 bunusRatio, saleRatio의 내용만 다르다.
		super.bunusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		this.bunusPoint += (price * this.bunusRatio); 
		return price - (int)(price * this.saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + ", 담당 상담원 번호: " + this.agentID;
	}
	
	public int getAgentID() {
		return this.agentID;
	}

}
