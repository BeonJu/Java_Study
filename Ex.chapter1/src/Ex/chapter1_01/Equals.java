package Ex.chapter1_01;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVal1 = "홍길";
		String strVal2 = "홍길";
		
		if(strVal1 == strVal2) {
			System.out.println("참조 메모리 주소가 같음");
		}else
		{
			System.out.println("참조 메모리 주소가 같지 않음");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("참조 메모리 주소가 같음");
		}else
		{
			System.out.println("참조 메모리 주소가 같지 않음");
		}
		
				
	}

}
