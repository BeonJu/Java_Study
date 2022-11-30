package Generic4;

public class GenericEx {
	//extends 로 인한 T의 타입 제한, Number 클래스에 있는 메소드만 사용 가능
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result  = compare(10,20);
		System.out.println(result);
		
		boolean result2  = compare(4.5, 4.5);
		System.out.println(result2);
	}

	
}
