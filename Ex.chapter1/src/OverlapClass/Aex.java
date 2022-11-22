package OverlapClass;


public class Aex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		외부에서 B클래스 사용하기
		A a = new A();
		A.B b = a.new B();
		b.method2();
		a.useB();
	}

}
