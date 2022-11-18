package Ch07;

public class ChildEX {
	
	public int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Child A = new Child();
//		A.method1();
//		A.method2();
//		A.method3();
//		
//		//자동 타입 변환
//		Parent P = A;
//		P.method1();
//		P.method2(); //오버라이드 된 메소드 호출
//		P.method3(); // 자식 객체에 있는 메소드는불러오지 못한다. 
		
//		P.a = 3;
//		P.b = 4;  //자식 객체 필드도 접근 불가
		
		//강제 타입 변환
		Parent PP = new Child();
		// instansOf 객체타입 확인을 위한 자바에서 제공하는 연산자
		if(PP instanceof Child) {
			// Parent PP안에 Child()객체가 들어 있는지 확인
			Child AA = (Child)PP;
			PP.method1();
			PP.method2();
			System.out.println();
			AA.method1();
			AA.method2();
			AA.method3();
			System.out.println();
			AA.a = 5;
			AA.b = 6;
			System.out.println(AA.a);
			System.out.println(AA.b);
		}      

	}

}
