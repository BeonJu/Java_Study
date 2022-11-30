package Amount;

//import CafeInterface.Coffees;

public class Amounts {
	// 총액을 저장할 변수
	private int amountSum;
	
	// 할인 금액을 저장할 변수
	private int discountAmount;
	
	// 합계 금액을 저장할 변수
	private int totalAmount;
	
	// 받은 금액을 저장할 변수
	private int paymentAmount;;
	
	

	public void setAmountSum(int amountSum) {
		//총 금액 이기 때문에 누적합산
		this.amountSum += amountSum;
	}

	public int getAmountSum() {
		return this.amountSum;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount() {
		
		this.totalAmount = this.amountSum - this.discountAmount;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


}
