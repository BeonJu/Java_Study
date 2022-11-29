package PaperTest01;

public class Ch03 {

//	3.	2680원이 있을때(int money=2680;) 500원, 100원, 50원, 10원짜리 동전으로 바꾸려고 한다. 각각 몇개의 동전들이 필요한지 구하는 프로그램을 만드시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 2680;
		
		System.out.println("500: "+money/500);
		System.out.println("100: "+(money%500)/100);
		System.out.println("50: "+((money%500)%100)/50);
		System.out.println("100: "+(((money%500)%100)%50)/10);

	}

}
