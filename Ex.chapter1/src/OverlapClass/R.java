package OverlapClass;


public class R {

	void useB(int arg) {
		//로컬변수
		int localVal = 1;  // final 표기 생략, 상수임
		
		class B{
			int field = 1;
			B(){
				System.out.println("로컬 클래스 B 생성 완료");
			}
			void method() {System.out.println("로컬 클래스 method");}
			
			void method1() {
//				arg = 2;
//				localVal = 2;
			}
		}
		
		B b = new B();
		System.out.println(b.field);
		b.method();
	}
	
	
}
