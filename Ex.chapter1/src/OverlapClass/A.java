package OverlapClass;

public class A {
//	인스턴스 멤버 클래스
//	접근 제한자 public default private
	class B{
		//필드
		int field = 1;
		B(){System.out.println("B Create");};
		void method2() {System.out.println("B Method");}
	}
//	필드로 사용
	B field = new B();
	
//	A클래스 생성자에서 사용 가능 
	A(){
		B b = new B();
	}
	
//	메소드에서 사용 가능
	void method() {
		B b= new B();
	}
	void useB() {
		B b= new B();
		System.out.println(b.field);

	}
}



