package Object;

public class ValueCompareEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ojb1 = 300;
		Integer ojb2 = 300;
		System.out.println(ojb1 == ojb2);
		System.out.println(ojb1.equals(ojb2));
		System.out.println(ojb1.compareTo(ojb2));
		
//		
//		boolean, character
//		byte, short, int : - 128 ~ 127 의 값을 비교하면 실제 값을 비교함, 그 이상은 주소값으로 여기면서 비교함
		
		Integer ojb3 = 10;
		Integer ojb4 = 10;
		System.out.println(ojb3 == ojb4);
		System.out.println(ojb3.equals(ojb4));
		System.out.println(ojb3.compareTo(ojb4));
		
		
	}

}
