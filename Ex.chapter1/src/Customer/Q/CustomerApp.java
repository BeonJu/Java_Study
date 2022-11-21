package Customer.Q;

import java.util.ArrayList;

public class CustomerApp {
//	필드
//	배열 선언시 정적 배열을 잡아야 하지만 아래 ArrayList를 사용하면 동적으로 생성 가능하며 자체 매소드로는 add, size get, remove, isEmpty 등이 있다.
	static public ArrayList<Customer> customerList = new ArrayList<Customer>();
	
//	메소드
	static public void showAllCustomer() {
		System.out.println("==========모든 고객 정보 출력=========");
//		customerList 안에 Customer형 customer가 있는 만큼 반복 됨
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	static public Customer findCustomer(int customerID) {
		Customer resultcustomer = null;
		for(Customer customer : customerList) {
			if(customer.getCustomerID() == customerID) {
				resultcustomer = customer;
				break;
			}
		}
		
		return resultcustomer;
		
	}
	
//	findCustomer에서 return 된 Resultcustomer를 인자값으로 받는다.
	static public void showPriceBonus(Customer customer, int price) {
		System.out.println("=========해당 고객의 할인율과 보너스 포인트 계산=========");
//		Resultcustomer를 customer로 받고 그 customer의 calcPrice와 오버라이딩 된 calcPrice으로 출력 한다.
		int cost = customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bunusPoint + "점");
		
	}

	
	public static void main(String[] args) {
//		다형성
		
		Customer userE = new Customer(10010,"이디야");
		Customer userS = new Customer(10020,"스타벅스");
//		Gold calcPirce Overriding
		Customer userT = new GoldCustomer(10030,"탐탐");
		Customer userB = new GoldCustomer(10040,"뺵다방");
//		VIP calcPirce Overriding
		Customer userP = new VIPCustomer(10050,"풀바셋",321654);
		
//		ArrayList 배열에 추가
		customerList.add(userE);
		customerList.add(userS);
		customerList.add(userT);
		customerList.add(userB);
		customerList.add(userP);
		
		//모든 고객 정보 출력
		showAllCustomer();
		
		//id로 찾은 고객의 실제 지불 금액, 보너스 포인트 출력
		Customer findercustomer  = findCustomer(10050);
		
		if(findercustomer == null) {
			System.out.println("======경고======");
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			showPriceBonus(findercustomer, 10000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
